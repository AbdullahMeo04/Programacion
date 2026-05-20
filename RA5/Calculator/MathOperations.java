package RA5.Calculator;

import java.util.ArrayList;

public class MathOperations {

    public static String formatResult(double val) {
        return val == (long) val ? String.valueOf((long) val) : String.valueOf(val);
    }

    public static String calculateIntermediate(String[] parts, ArrayList<String> historyList) {
        double n1 = Double.parseDouble(parts[0]);
        char op = parts[1].charAt(0);
        double n2 = Double.parseDouble(parts[2]);
        double result = 0;

        if (op == '/' && n2 == 0) return "Math Error";

        switch (op) {
            case '+': result = n1 + n2; break;
            case '-': result = n1 - n2; break;
            case '*': result = n1 * n2; break;
            case '/': result = n1 / n2; break;
        }

        String historyEntry = formatResult(n1) + " " + op + " " + formatResult(n2) + " = " + formatResult(result);
        historyList.add(historyEntry);
        return formatResult(result);
    }
}