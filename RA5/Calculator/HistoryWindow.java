package RA5.Calculator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HistoryWindow {

    public HistoryWindow(ArrayList<String> historyList) {
        JFrame historyFrame = new JFrame("Calculation History");
        historyFrame.setSize(380, 450);
        historyFrame.setLocationRelativeTo(null);

        JTextArea historyArea = new JTextArea();
        historyArea.setEditable(false);
        historyArea.setBackground(new Color(248, 249, 250));
        historyArea.setForeground(new Color(47, 53, 66));
        historyArea.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        historyArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(historyArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 30), 1));

        JButton clearHistoryButton = new RoundButton("Clear History", new Color(235, 94, 85), Color.WHITE);
        clearHistoryButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        clearHistoryButton.setPreferredSize(new Dimension(300, 45));

        clearHistoryButton.addActionListener(e -> {
            historyList.clear();
            historyArea.setText("");
        });

        for (String entry : historyList) {
            historyArea.append(entry + "\n");
        }

        JPanel contentPanel = new JPanel(new BorderLayout(0, 15));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        contentPanel.setBackground(new Color(178, 190, 181));

        contentPanel.add(scrollPane, BorderLayout.CENTER);
        contentPanel.add(clearHistoryButton, BorderLayout.SOUTH);

        historyFrame.setContentPane(contentPanel);
        historyFrame.setVisible(true);
    }
}