/* @author nghiacubu */
package com.GUI.component;

import DAO.GheDAO;
import Entity.Ghe;
import com.GUI.form.BanVe.BanVe_Form;
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

public class seat extends JPanel {

//    public static boolean status = false;
    int i;
    public List<ModelButton> list_btn = new ArrayList<>();

    public List<Ghe> listGhe = new ArrayList<>();
    public GheDAO gheDAO = new GheDAO();

    public seat() {
        this.setBackground(Color.white);
        setLayout(new GridLayout(14, 10, 18, 18));

        for (i = 1; i <= 140; i++) {
            Button button = new Button();
            button.setBackground(new Color(204, 204, 204));
            button.setForeground(Color.red);
            if (i % 10 != 0) {
                button.setLabel("" + i % 10);
            } else {
                button.setLabel("" + 10);
            }
            button.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
            button.setSize(new Dimension(19, 35));
            ModelButton mb = new ModelButton(i, button,false);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    button.setBackground(Color.red);
                    button.setForeground(Color.white);
                    mb.setStt(true);
                }
            });
            list_btn.add(mb);
            this.add(button);
        }
    }

    public void fillGhe(String maPhong) {
        listGhe = gheDAO.selectByMaPhong(maPhong);
        int i = 0;
        for (Ghe ghe : listGhe) {
            if (ghe.isTrangThai()) {
                list_btn.get(i).setStt(true);
                list_btn.get(i).getBtn().setEnabled(false);
            }
        }
    }

    public void reset() {
        for (ModelButton button : list_btn) {
            if (button.isStt()) {
                button.getBtn().setBackground(new Color(204, 204, 204));
                button.getBtn().setForeground(Color.red);
                button.setStt(false);
            }
        }
    }

    public List<Ghe> selectedSeat() {
        List<Ghe> listSelect = new ArrayList<>();
        for (int i = 0; i <= list_btn.size()-1; i++) {
            ModelButton btn = list_btn.get(i);
            if (btn.isStt() == true) {
                listSelect.add(listGhe.get(i));
            }
        }
        return listSelect;
    }
}
