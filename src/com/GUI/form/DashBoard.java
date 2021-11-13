package com.GUI.form;

import com.GUI.Chart.ChartPie.ModelChartPie;
import com.GUI.model.ModelCard;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class DashBoard extends javax.swing.JPanel {

    public DashBoard() {
        initComponents();
        setOpaque(false);
        card1.setData(new ModelCard("Value1", 255, 80, new ImageIcon("/com/GUI/icon/1.png")));
        card1.setColorGradient(Color.orange);
        card2.setData(new ModelCard("Value2", 800, 25, new ImageIcon("/com/GUI/icon/2.png")));
        card2.setColorGradient(new Color(255,51,51));
        List <ModelChartPie> list = new ArrayList<>();
        list.add(new ModelChartPie("Quí 1", 200, Color.yellow));
        list.add(new ModelChartPie("Quí 1", 400, Color.blue));
        list.add(new ModelChartPie("Quí 1", 300, Color.orange)); 
        list.add(new ModelChartPie("Quí 1", 600, Color.pink));        
        chartPie1.setModel(list);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("/com/GUI/imagePhim/AntMain.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        jLabel1.setIcon(imageIcon);
        imageIcon = new ImageIcon(new ImageIcon("/com/GUI/imagePhim/Iception.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        jLabel2.setIcon(imageIcon);
        imageIcon = new ImageIcon(new ImageIcon("/com/GUI/imagePhim/Avengers.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        jLabel3.setIcon(imageIcon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new com.GUI.component.Card();
        card2 = new com.GUI.component.Card();
        chartPie1 = new com.GUI.Chart.ChartPie.ChartPie();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(20, 30, 48));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GUI/imagePhim/Avengers.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(394, 480));
        jLabel1.setMinimumSize(new java.awt.Dimension(394, 480));
        jLabel1.setPreferredSize(new java.awt.Dimension(394, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/GUI/imagePhim/Inception.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(394, 480));
        jLabel2.setMinimumSize(new java.awt.Dimension(394, 480));
        jLabel2.setPreferredSize(new java.awt.Dimension(394, 480));

        jLabel3.setMaximumSize(new java.awt.Dimension(394, 480));
        jLabel3.setMinimumSize(new java.awt.Dimension(394, 480));
        jLabel3.setPreferredSize(new java.awt.Dimension(394, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chartPie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.component.Card card1;
    private com.GUI.component.Card card2;
    private com.GUI.Chart.ChartPie.ChartPie chartPie1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
