package RA5.Calculator;

import javax.swing.*;
import java.awt.*;

public class RoundButton extends JButton {

    private Color startColor;
    private Color endColor;

    public RoundButton(String label, Color baseColor, Color fgColor) {
        super(label);
        this.startColor = baseColor;
        this.endColor = new Color(
            Math.max((int)(baseColor.getRed() * 0.94), 0),
            Math.max((int)(baseColor.getGreen() * 0.94), 0),
            Math.max((int)(baseColor.getBlue() * 0.94), 0)
        );
        setForeground(fgColor);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Color sColor = startColor;
        Color eColor = endColor;

        if (getModel().isPressed()) {
            sColor = startColor.darker();
            eColor = endColor.darker();
        } else if (getModel().isRollover()) {
            sColor = blend(startColor, Color.WHITE, 0.15f);
            eColor = blend(endColor, Color.WHITE, 0.15f);
        }

        g2.setColor(new Color(0, 0, 0, 15));
        g2.fillRoundRect(1, 2, getWidth() - 2, getHeight() - 3, 16, 16);

        g2.setPaint(new GradientPaint(0, 0, sColor, 0, getHeight(), eColor));
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 2, 16, 16);

        g2.setColor(new Color(255, 255, 255, 30));
        g2.drawRoundRect(0, 0, getWidth() - 2, getHeight() - 3, 16, 16);

        g2.setColor(getForeground());
        g2.setFont(getFont());
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
        g2.drawString(getText(), x, y);

        g2.dispose();
    }

    private Color blend(Color c1, Color c2, float r) {
        float ir = 1f - r;
        return new Color((int)(c1.getRed()*ir + c2.getRed()*r), (int)(c1.getGreen()*ir + c2.getGreen()*r), (int)(c1.getBlue()*ir + c2.getBlue()*r));
    }
}