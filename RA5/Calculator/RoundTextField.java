package RA5.Calculator;

import javax.swing.*;
import java.awt.*;

public class RoundTextField extends JTextField {

    private int roundRadius;

    public RoundTextField(int radius) {
        super();
        this.roundRadius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, roundRadius, roundRadius);
        
        g2.dispose();
        
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255, 255, 255, 30));
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, roundRadius, roundRadius);
        
        g2.dispose();
    }
}
