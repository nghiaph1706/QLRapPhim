package Utilities;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Option extends JOptionPane {

    private Icon icon;

    public Option() {
    }

    public Icon geticon(Integer values) {
        if (values == 1) {
            icon = new ImageIcon("src/com/GUI/icon/Done.png");
        }
        if (values == 2) {
            icon = new ImageIcon("src/com/GUI/icon/MessageOption.png");
        }
        return icon;
    }

    public void Message(Component parentComponent, Object message, String title) {
        JOptionPane.showMessageDialog(parentComponent, message, title, 0, geticon(2));
    }
    public void Done(Component parentComponent, Object message, String title) {
        JOptionPane.showMessageDialog(parentComponent, message, title, 0, geticon(1));
    }

    public String Input(Component parentComponent, Object message, String title) {
        return JOptionPane.showInputDialog(parentComponent, message, title, 0);
    }

    public void Error(Component parentComponent, Object message, String title) {
        JOptionPane.showMessageDialog(parentComponent, message, title, 0);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs);
    }
}
