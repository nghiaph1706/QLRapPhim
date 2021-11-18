/* @author nghiacubu */


package com.GUI.component;

import DAO.GheDAO;
import Entity.Ghe;
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
    
//    public static boolean status = false;
    public List<ModelButton> list_btn_selected = new ArrayList<>();
            
    public List<Ghe> listGhe = new ArrayList<>();
    public GheDAO gheDAO = new GheDAO();
    
    public seat(String maPhong){
        init();
        
        listGhe = gheDAO.selectByMaPhong(maPhong);
        for (Ghe ghe : listGhe) {
            Button button = new Button();
            button.setText(ghe.getMaGhe());
            button.setFont(new Font("Segoe UI Black",Font.BOLD,18));
            button.setSize(new Dimension(19, 35));
            if (ghe.isTrangThai()) {
                button.setBackground(Color.BLACK);
                button.setForeground(Color.red);
                button.disable();
            } else {
                button.setBackground(new Color(204,204,204));
                button.setForeground(Color.red);
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
//                        status = true;
                        button.setBackground(Color.red);
                        button.setForeground(Color.white);
                        list_btn_selected.add(new ModelButton(ghe.getMaGhe(),button));
                    }
                });
                this.add(button);
            }
        }
    }
    
    void init(){
        this.setBackground(Color.white);
        setLayout(new GridLayout(14,10,18,18));
    }
    
    void reset(){
        for (ModelButton button : list_btn_selected) {
            button.getBtn().setBackground(Color.white);
            button.getBtn().setForeground(Color.red);
        }
        list_btn_selected.clear();
    }
    
    List<Ghe> selectedSeat(){
        List<Ghe> listSelect = new ArrayList<>();
        for (ModelButton modelButton : list_btn_selected) {
            for (Ghe ghe : listGhe) {
                if (modelButton.getMa().equals(ghe.getMaGhe())) {
                    listSelect.add(ghe);
                }
            }
        }
        return listSelect;
    }
}
