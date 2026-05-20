package RA5.Calculator;

import javax.swing.*;
import java.awt.*;


public class Calculator extends JFrame {

    public Calculator() {
        setTitle("My_Calculator");
        setSize(420, 650);
        getContentPane().setBackground(new Color(178, 190, 181));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        new CalculatorComponents(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}