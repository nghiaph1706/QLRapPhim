package com.GUI.form.BanVe;

import DAO.GheDAO;
import Entity.Ghe;
import com.GUI.Chart.ChartPie.ModelChartPie;
import com.GUI.main.Main;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author taoda
 */
public class ChonGhe_Form extends javax.swing.JPanel {

    /**
     * Creates new form ChonGhe_Form
     */
    public static boolean status = false;
    public static double giaTienGhe;
    public static List<Ghe> listGheSelected = new ArrayList<>();
    public ChonGhe_Form() {
        initComponents();
        seat1.fillGhe(BanVe_Form.MaPhong);
        fillchart(BanVe_Form.MaPhong);
    }
    
    void fillchart(String maPhong){
        GheDAO gheDAO = new GheDAO();
        List <ModelChartPie> list = new ArrayList<>();
        int emptyseat = gheDAO.selectEmptySeat(maPhong);
        list.add(new ModelChartPie("Ghế trống", emptyseat, Color.yellow));
        list.add(new ModelChartPie("Đã đặt", 140-emptyseat, Color.blue));       
        chartPie1.setModel(list);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        button1 = new com.GUI.swing.Button();
        button2 = new com.GUI.swing.Button();
        button3 = new com.GUI.swing.Button();
        button4 = new com.GUI.swing.Button();
        button5 = new com.GUI.swing.Button();
        button6 = new com.GUI.swing.Button();
        button7 = new com.GUI.swing.Button();
        button8 = new com.GUI.swing.Button();
        button9 = new com.GUI.swing.Button();
        button10 = new com.GUI.swing.Button();
        button11 = new com.GUI.swing.Button();
        button12 = new com.GUI.swing.Button();
        button13 = new com.GUI.swing.Button();
        button14 = new com.GUI.swing.Button();
        jPanel1 = new javax.swing.JPanel();
        seat1 = new com.GUI.component.seat();
        buttonBadges1 = new com.GUI.swing.ButtonBadges();
        buttonBadges2 = new com.GUI.swing.ButtonBadges();
        chartPie1 = new com.GUI.Chart.ChartPie.ChartPie();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(73, 747));
        jPanel2.setMinimumSize(new java.awt.Dimension(73, 747));

        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("E");
        button1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("F");
        button2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("G");
        button3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("H");
        button4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("I");
        button5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("J");
        button6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("K");
        button7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("L");
        button8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("M");
        button9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button10.setForeground(new java.awt.Color(255, 255, 255));
        button10.setText("N");
        button10.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.setForeground(new java.awt.Color(255, 255, 255));
        button11.setText("D");
        button11.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button12.setForeground(new java.awt.Color(255, 255, 255));
        button12.setText("C");
        button12.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        button13.setForeground(new java.awt.Color(255, 255, 255));
        button13.setText("B");
        button13.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        button14.setForeground(new java.awt.Color(255, 255, 255));
        button14.setText("A");
        button14.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1215, 747));
        jPanel1.setMinimumSize(new java.awt.Dimension(1215, 747));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seat1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(seat1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonBadges1.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges1.setForeground(new java.awt.Color(255, 255, 255));
        buttonBadges1.setText("RESET");
        buttonBadges1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        buttonBadges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges1ActionPerformed(evt);
            }
        });

        buttonBadges2.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges2.setForeground(new java.awt.Color(255, 255, 255));
        buttonBadges2.setText("SELECT");
        buttonBadges2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        buttonBadges2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonBadges1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(chartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(chartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button13ActionPerformed

    private void buttonBadges1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges1ActionPerformed
        seat1.reset();
    }//GEN-LAST:event_buttonBadges1ActionPerformed

    private void buttonBadges2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges2ActionPerformed
        listGheSelected = seat1.selectedSeat();
        for (Ghe ghe : listGheSelected) {
            giaTienGhe = ghe.getGiaGhe();
            System.out.println(ghe.getMaGhe() + " " + giaTienGhe);
        }
        Main.banVe.insertMaVe();
        Main.banVe.loadDatabase();
        Main.main.showForm(Main.banVe);
    }//GEN-LAST:event_buttonBadges2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.Button button1;
    private com.GUI.swing.Button button10;
    private com.GUI.swing.Button button11;
    private com.GUI.swing.Button button12;
    private com.GUI.swing.Button button13;
    private com.GUI.swing.Button button14;
    private com.GUI.swing.Button button2;
    private com.GUI.swing.Button button3;
    private com.GUI.swing.Button button4;
    private com.GUI.swing.Button button5;
    private com.GUI.swing.Button button6;
    private com.GUI.swing.Button button7;
    private com.GUI.swing.Button button8;
    private com.GUI.swing.Button button9;
    private com.GUI.swing.ButtonBadges buttonBadges1;
    private com.GUI.swing.ButtonBadges buttonBadges2;
    private com.GUI.Chart.ChartPie.ChartPie chartPie1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.GUI.component.seat seat1;
    // End of variables declaration//GEN-END:variables
}
