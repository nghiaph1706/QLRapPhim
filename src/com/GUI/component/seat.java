/* @author nghiacubu */


package com.GUI.component;

import com.GUI.swing.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


public class seat extends JPanel{
    List<ModelButton> list_btn_selected = new ArrayList<>();
    int i;
    public seat(){
        this.setBackground(Color.white);
        setLayout(new GridLayout(14,10,18,18));
        for (i = 1; i <= 140; i++) {
            Button button = new Button();
            button.setBackground(new Color(204,204,204));
            button.setForeground(Color.red);
            if (i%10!=0) {
                button.setLabel(""+ i%10);
            } else {
                button.setLabel(""+ 10);
            }
            button.setFont(new Font("Segoe UI Black",Font.BOLD,18));
            button.setSize(new Dimension(19, 35));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    button.setBackground(Color.red);
                    button.setForeground(Color.white);
                    list_btn_selected.add(new ModelButton(i,button));
                }
            });
            this.add(button);
        }
    }
    
    public void reset(){
        for (ModelButton button : list_btn_selected) {
            button.getBtn().setBackground(Color.white);
            button.getBtn().setForeground(Color.red);
        }
        list_btn_selected.clear();
    }
    
    
}
