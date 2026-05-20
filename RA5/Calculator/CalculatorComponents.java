package RA5.Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorComponents {

    JTextField textField;
    RoundButton[] numberButtons = new RoundButton[10];
    RoundButton addButton, subButton, mulButton, divButton;
    RoundButton decButton, eqButton, delButton, clrButton, historyButton, signButton;
    JPanel panel;
    Font myFont = new Font("Segoe UI", Font.BOLD, 20);
    Font displayFont = new Font("Segoe UI", Font.PLAIN, 28);

    public CalculatorComponents(JFrame frame) {
        textField = new RoundTextField(20);
        textField.setBounds(30, 30, 340, 75);
        textField.setBackground(new Color(28, 28, 30));
        textField.setForeground(new Color(242, 242, 247));
        textField.setFont(displayFont);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 15));

        Color numColor = new Color(255, 255, 255);
        Color opColor = new Color(242, 143, 56);
        Color specColor = new Color(200, 204, 208);
        Color redColor = new Color(235, 94, 85);
        Color darkText = new Color(44, 62, 80);
        Color lightText = Color.WHITE;

        addButton = new RoundButton("+", opColor, lightText);
        subButton = new RoundButton("-", opColor, lightText);
        mulButton = new RoundButton("*", opColor, lightText);
        divButton = new RoundButton("/", opColor, lightText);
        decButton = new RoundButton(".", numColor, darkText);
        eqButton = new RoundButton("=", opColor, lightText);
        delButton = new RoundButton("DEL", redColor, lightText);
        clrButton = new RoundButton("CLEAR", specColor, darkText);
        signButton = new RoundButton("+/-", specColor, darkText);
        historyButton = new RoundButton("HISTORY", specColor, darkText);

        RoundButton[] functionButtons = {
                addButton, subButton, mulButton, divButton,
                decButton, eqButton, delButton, clrButton, historyButton, signButton
        };

        CalculatorEngine engine = new CalculatorEngine(this);
        frame.addKeyListener(engine);
        frame.setFocusable(true);
        frame.requestFocusInWindow();
        textField.setFocusable(false);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new RoundButton(String.valueOf(i), numColor, darkText);
            numberButtons[i].setFont(myFont);
            numberButtons[i].addActionListener(engine);
        }

        for (RoundButton button : functionButtons) {
            button.setFont(myFont);
            button.addActionListener(engine);
        }
        historyButton.setFont(new Font("Segoe UI", Font.BOLD, 12));

        panel = new JPanel(new GridLayout(4, 4, 10, 10));
        panel.setBounds(30, 130, 340, 340);
        panel.setOpaque(false);

        RoundButton[] gridButtons = {
            numberButtons[7], numberButtons[8], numberButtons[9], divButton,
            numberButtons[4], numberButtons[5], numberButtons[6], mulButton,
            numberButtons[1], numberButtons[2], numberButtons[3], subButton,
            decButton, numberButtons[0], eqButton, addButton
        };
        for (RoundButton btn : gridButtons) panel.add(btn);

        RoundButton[] bottomButtons = { delButton, clrButton, signButton, historyButton };
        int[] xs = { 30, 117, 205, 293 };
        for (int i = 0; i < 4; i++) {
            bottomButtons[i].setBounds(xs[i], 490, 77, 55);
            frame.add(bottomButtons[i]);
        }

        frame.add(panel);
        frame.add(textField);
    }
}