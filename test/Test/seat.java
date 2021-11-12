/* @author nghiacubu */


package Test;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


public class seat extends JPanel{
    List<Button> list_btn = new ArrayList<>();
    public seat(){
        setLayout(new GridLayout(10,20,10,10));
        for (int i = 1; i <= 200; i++) {
            Button button = new Button();
            button.setBackground(Color.yellow); // chua chon
            button.setLabel(""+ i);
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    button.setBackground(Color.red);
                }
            });
            this.add(button);
            list_btn.add(button);
        }
    }
    
    public void reset(){
        removeAll();
        list_btn.clear();
        for (int i = 1; i <= 200; i++) {
            Button button = new Button();
            button.setBackground(Color.yellow); // chua chon
            button.setLabel(""+ i);
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    button.setBackground(Color.red);
                }
            });
            this.add(button);
            list_btn.add(button);
            repaint();
        }
    }
}
