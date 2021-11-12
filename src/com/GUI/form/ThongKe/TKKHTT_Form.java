package com.GUI.form.ThongKe;

import java.awt.Color;
import java.awt.Font;

public class TKKHTT_Form extends javax.swing.JPanel {

    public TKKHTT_Form() {
        initComponents();
        setOpaque(false);
        initText();
        
    }
    public void initText(){
        txtTimKiemNam.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
        txtTimKiemThang.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
        lblTongKHTT1.setForeground(new Color(255,51,51));
        lblTongKHTT2.setForeground(new Color(255,51,51));
        lblThongKeNam.setForeground(new Color(255,51,51));
        lblThongKeThang.setForeground(new Color(255,51,51));
        lblThongKeNam.setFont(new Font("Segoe UI Variable", Font.PLAIN, 24)); 
        lblThongKeThang.setFont(new Font("Segoe UI Variable", Font.PLAIN, 24));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblTongKHTT1 = new javax.swing.JLabel();
        lblTongKHTTNam = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuiMail = new com.GUI.swing.Button();
        lblSoKHTTMoiNam = new javax.swing.JLabel();
        lblKhachLuotXemCaoNhatNam = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTongKHTTThang = new javax.swing.JLabel();
        lblTongKHTT2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblKhachLuotXemCaoNhatThang = new javax.swing.JLabel();
        cboThongKeNam = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThongKeNam = new com.GUI.swing.Table();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblThongKeThang = new com.GUI.swing.Table();
        cboThongKeThangNam = new javax.swing.JComboBox<>();
        cboThang = new javax.swing.JComboBox<>();
        txtTimKiemThang = new javax.swing.JTextField();
        lblThongKeNam = new javax.swing.JLabel();
        lblThongKeThang = new javax.swing.JLabel();
        txtTimKiemNam = new javax.swing.JTextField();
        barChart3 = new com.GUI.Chart.BarChart.BarChart();
        barChart4 = new com.GUI.Chart.BarChart.BarChart();

        setBackground(new java.awt.Color(20, 30, 48));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTongKHTT1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongKHTT1.setText("TỔNG KHTT");

        lblTongKHTTNam.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblTongKHTTNam.setText("9.000.000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Số KHTT mới");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Khách có lượt xem cao nhất: ");

        btnGuiMail.setText("Gửi mail chúc mừng");
        btnGuiMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiMailActionPerformed(evt);
            }
        });

        lblSoKHTTMoiNam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSoKHTTMoiNam.setText("50");

        lblKhachLuotXemCaoNhatNam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblKhachLuotXemCaoNhatNam.setText("Nguyễn Văn A");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuiMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTongKHTT1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSoKHTTMoiNam, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(lblTongKHTTNam))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKhachLuotXemCaoNhatNam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTongKHTT1)
                .addGap(8, 8, 8)
                .addComponent(lblTongKHTTNam)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSoKHTTMoiNam, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKhachLuotXemCaoNhatNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuiMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 51, 190, 337));

        lblTongKHTTThang.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblTongKHTTThang.setText("9.000.000");

        lblTongKHTT2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongKHTT2.setText("TỔNG KHTT");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Khách có lượt xem cao nhất: ");

        lblKhachLuotXemCaoNhatThang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblKhachLuotXemCaoNhatThang.setText("Nguyễn Văn A");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongKHTT2)
                    .addComponent(lblTongKHTTThang))
                .addGap(46, 46, 46))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lblKhachLuotXemCaoNhatThang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTongKHTT2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTongKHTTThang)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKhachLuotXemCaoNhatThang)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 50, 190, 340));

        cboThongKeNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboThongKeNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 51, 116, -1));

        tblThongKeNam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblThongKeNam);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, -1, 309));

        tblThongKeThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblThongKeThang);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 520, 300));

        cboThongKeThangNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboThongKeThangNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 60, 100, 20));

        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 139, -1));

        txtTimKiemThang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemThangKeyReleased(evt);
            }
        });
        add(txtTimKiemThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 223, -1));

        lblThongKeNam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblThongKeNam.setText("Thống kê KHTT theo năm");
        add(lblThongKeNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 525, -1));

        lblThongKeThang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblThongKeThang.setText("Thống kê KHTT theo tháng");
        add(lblThongKeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 11, 470, -1));
        add(txtTimKiemNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 228, -1));
        add(barChart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 650, 390));
        add(barChart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 403, 720, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemThangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemThangKeyReleased
       
    }//GEN-LAST:event_txtTimKiemThangKeyReleased

    private void btnGuiMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuiMailActionPerformed
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.Chart.BarChart.BarChart barChart3;
    private com.GUI.Chart.BarChart.BarChart barChart4;
    private com.GUI.swing.Button btnGuiMail;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JComboBox<String> cboThongKeNam;
    private javax.swing.JComboBox<String> cboThongKeThangNam;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblKhachLuotXemCaoNhatNam;
    private javax.swing.JLabel lblKhachLuotXemCaoNhatThang;
    private javax.swing.JLabel lblSoKHTTMoiNam;
    private javax.swing.JLabel lblThongKeNam;
    private javax.swing.JLabel lblThongKeThang;
    private javax.swing.JLabel lblTongKHTT1;
    private javax.swing.JLabel lblTongKHTT2;
    private javax.swing.JLabel lblTongKHTTNam;
    private javax.swing.JLabel lblTongKHTTThang;
    private com.GUI.swing.Table tblThongKeNam;
    private com.GUI.swing.Table tblThongKeThang;
    private javax.swing.JTextField txtTimKiemNam;
    private javax.swing.JTextField txtTimKiemThang;
    // End of variables declaration//GEN-END:variables
}
