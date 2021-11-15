/* @author nghiacubu */


package com.GUI.component;

import com.GUI.swing.Button;
import java.awt.Color;
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
        setLayout(new GridLayout(10,20,10,10));
        for (i = 1; i <= 200; i++) {
            Button button = new Button();
            button.setBackground(Color.white);
            button.setForeground(Color.red);
            button.setLabel(""+ i);
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
