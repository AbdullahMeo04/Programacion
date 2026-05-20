package RA5.Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class CalculatorEngine implements ActionListener, KeyListener {

    private CalculatorComponents ui;
    private boolean startNewNumber = false;
    private ArrayList<String> historyList = new ArrayList<>();
    private char lastOperator = ' ';
    private double lastOperand = 0;
    private boolean hasLastOperation = false;

    public CalculatorEngine(CalculatorComponents ui) {
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (!(source instanceof RoundButton)) return;

        String btnText = ((RoundButton) source).getText();

        if (Character.isDigit(btnText.charAt(0)) && btnText.length() == 1) {
            appendNumber(btnText);
        } else if (source == ui.decButton) {
            appendDecimal();
        } else if (source == ui.addButton || source == ui.subButton || source == ui.mulButton || source == ui.divButton) {
            handleOperator(btnText.charAt(0));
        } else if (source == ui.eqButton) {
            evaluateExpression();
        } else if (source == ui.clrButton) {
            ui.textField.setText("");
            startNewNumber = false;
        } else if (source == ui.delButton) {
            deleteLastCharacter();
        } else if (source == ui.signButton) {
            toggleSign();
        } else if (source == ui.historyButton) {
            new HistoryWindow(historyList);
        }
    }

    private boolean isErrorState() {
        String text = ui.textField.getText();
        return text.equals("Math Error") || text.equals("Syntax Error") || text.equals("Enter Number");
    }

    private void appendNumber(String num) {
        if (startNewNumber || isErrorState()) {
            ui.textField.setText("");
            startNewNumber = false;
        }
        ui.textField.setText(ui.textField.getText().concat(num));
    }

    private void appendDecimal() {
        if (startNewNumber || isErrorState()) {
            ui.textField.setText("0.");
            startNewNumber = false;
            return;
        }

        String text = ui.textField.getText();
        if (text.isEmpty()) {
            ui.textField.setText("0.");
            return;
        }

        String[] parts = text.split(" ");
        if (parts.length == 1 && !parts[0].contains(".")) {
            ui.textField.setText(text.concat("."));
        } else if (parts.length == 2) {
            ui.textField.setText(text.concat("0."));
        } else if (parts.length == 3 && !parts[2].contains(".")) {
            ui.textField.setText(text.concat("."));
        }
    }

    private void handleOperator(char op) {
        if (isErrorState()) {
            ui.textField.setText("");
            return;
        }

        try {
            String currentText = ui.textField.getText().trim();
            if (currentText.isEmpty()) {
                ui.textField.setText("Enter Number");
                return;
            }

            String[] parts = currentText.split(" ");
            if (parts.length >= 3) {
                currentText = MathOperations.calculateIntermediate(parts, historyList);
                if (currentText.equals("Math Error")) {
                    ui.textField.setText(currentText);
                    return;
                }
            } else if (parts.length == 2) {
                currentText = parts[0];
            }

            double num = Double.parseDouble(currentText);
            ui.textField.setText(MathOperations.formatResult(num) + " " + op + " ");
            startNewNumber = false;
        } catch (Exception ex) {
            ui.textField.setText("Syntax Error");
        }
    }

    private void evaluateExpression() {
        try {
            String currentText = ui.textField.getText().trim();
            if (currentText.isEmpty()) return;

            String[] parts = currentText.split(" ");

            if (parts.length >= 3) {
                String res = MathOperations.calculateIntermediate(parts, historyList);
                if (res.equals("Math Error")) {
                    ui.textField.setText(res);
                    hasLastOperation = false;
                    return;
                }

                lastOperator = parts[1].charAt(0);
                lastOperand = Double.parseDouble(parts[2]);
                hasLastOperation = true;

                ui.textField.setText(res);
                startNewNumber = true;
            } else if (parts.length == 1 && hasLastOperation) {
                double currentVal = Double.parseDouble(parts[0]);
                double result = 0;

                if (lastOperator == '/' && lastOperand == 0) {
                    ui.textField.setText("Math Error");
                    hasLastOperation = false;
                    return;
                }

                switch (lastOperator) {
                    case '+': result = currentVal + lastOperand; break;
                    case '-': result = currentVal - lastOperand; break;
                    case '*': result = currentVal * lastOperand; break;
                    case '/': result = currentVal / lastOperand; break;
                }

                String resStr = MathOperations.formatResult(result);
                String historyEntry = MathOperations.formatResult(currentVal) + " " + lastOperator + " " + MathOperations.formatResult(lastOperand) + " = " + resStr;
                historyList.add(historyEntry);

                ui.textField.setText(resStr);
                startNewNumber = true;
            }
        } catch (Exception ex) {
            ui.textField.setText("Syntax Error");
        }
    }

    private void toggleSign() {
        if (isErrorState()) {
            ui.textField.setText("");
            return;
        }

        String text = ui.textField.getText();
        if (text.isEmpty()) {
            ui.textField.setText("-");
            return;
        }

        String trimmed = text.trim();
        String[] parts = trimmed.split(" ");

        if (parts.length == 1) {
            try {
                double val = Double.parseDouble(parts[0]);
                val = -val;
                ui.textField.setText(MathOperations.formatResult(val));
            } catch (NumberFormatException e) {
                ui.textField.setText(parts[0].equals("-") ? "" : "-");
            }
        } else if (parts.length == 2) {
            ui.textField.setText(text.endsWith("-") ? text.substring(0, text.length() - 1) : text + "-");
        } else if (parts.length == 3) {
            try {
                double val = Double.parseDouble(parts[2]);
                val = -val;
                ui.textField.setText(parts[0] + " " + parts[1] + " " + MathOperations.formatResult(val));
            } catch (NumberFormatException e) {
                ui.textField.setText(parts[2].equals("-") ? parts[0] + " " + parts[1] + " " : parts[0] + " " + parts[1] + " -");
            }
        }
    }

    private void deleteLastCharacter() {
        if (isErrorState()) {
            ui.textField.setText("");
            return;
        }

        String text = ui.textField.getText();
        if (!text.isEmpty()) {
            ui.textField.setText(text.endsWith(" ") ? text.substring(0, text.length() - 3) : text.substring(0, text.length() - 1));
        }
    }

    // --- KeyListener Methods ---
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();

        if (Character.isDigit(keyChar)) {
            appendNumber(String.valueOf(keyChar));
        } else if (keyChar == '.') {
            appendDecimal();
        } else if (keyChar == '+' || keyChar == '-' || keyChar == '*' || keyChar == '/') {
            handleOperator(keyChar);
        } else if (keyChar == '=' || keyChar == '\n') {
            evaluateExpression();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            deleteLastCharacter();
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            ui.textField.setText("");
            startNewNumber = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}