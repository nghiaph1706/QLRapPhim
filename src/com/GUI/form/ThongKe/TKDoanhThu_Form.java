package com.GUI.form.ThongKe;

import java.awt.Color;
import java.awt.Font;

public class TKDoanhThu_Form extends javax.swing.JPanel {

    public TKDoanhThu_Form() {
        initComponents();
        setOpaque(false);
        initText();
    }
    public void initText(){
        txtTimKiemNam.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
        txtTimKiemThang.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
        lblTongDTNam.setForeground(new Color(255,51,51));
        lblTongDTThang.setForeground(new Color(255,51,51));
        lblThongKeNam.setForeground(new Color(255,51,51));
        lblThongKeThang.setForeground(new Color(255,51,51));
        lblThongKeNam.setFont(new Font("Segoe UI Variable", Font.PLAIN, 24)); 
        lblThongKeThang.setFont(new Font("Segoe UI Variable", Font.PLAIN, 24));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblTongDTNam = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNamDoanhThuCaoNhatNam = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNamDTThapNhat = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTBDoanhThuNam = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblTongDTThang = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblThangDTCaoNhat = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblThangDTThapNhat = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTrungBinhDTThang = new javax.swing.JLabel();
        cboThongKeNam = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThongKeNam = new com.GUI.swing.Table();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblThongKeThang = new com.GUI.swing.Table();
        cboThongKeThangNam = new javax.swing.JComboBox<>();
        lblThongKeThang = new javax.swing.JLabel();
        lblThongKeNam = new javax.swing.JLabel();
        txtTimKiemNam = new javax.swing.JTextField();
        txtTimKiemThang = new javax.swing.JTextField();
        barChart3 = new com.GUI.Chart.BarChart.BarChart();
        barChart4 = new com.GUI.Chart.BarChart.BarChart();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(20, 30, 48));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTongDTNam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongDTNam.setText("TỔNG DT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setText("9.000.000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Năm doạnh thu cao nhất");

        lblNamDoanhThuCaoNhatNam.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNamDoanhThuCaoNhatNam.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Năm doanh thu thấp nhất");

        lblNamDTThapNhat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNamDTThapNhat.setText("jLabel2");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Trung bình doanh thu");

        lblTBDoanhThuNam.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTBDoanhThuNam.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTongDTNam)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblNamDoanhThuCaoNhatNam))
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(lblNamDTThapNhat)
                    .addComponent(lblTBDoanhThuNam)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTongDTNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamDoanhThuCaoNhatNam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamDTThapNhat)
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTBDoanhThuNam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 69, 200, 338));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel11.setText("9.000.000");

        lblTongDTThang.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongDTThang.setText("TỔNG DT");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Tháng doanh thu cao nhất");

        lblThangDTCaoNhat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblThangDTCaoNhat.setText("jLabel1");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Tháng doanh thu thấp nhất");

        lblThangDTThapNhat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblThangDTThapNhat.setText("jLabel2");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Trung bình doanh thu");

        lblTrungBinhDTThang.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTrungBinhDTThang.setText("jLabel3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongDTThang)
                    .addComponent(jLabel11))
                .addGap(58, 58, 58))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblThangDTCaoNhat))
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(lblThangDTThapNhat)
                    .addComponent(lblTrungBinhDTThang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTongDTThang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblThangDTCaoNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblThangDTThapNhat)
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTrungBinhDTThang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1205, 69, 210, 338));

        cboThongKeNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboThongKeNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 69, 168, -1));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, 470, 309));

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

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 493, 310));

        cboThongKeThangNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboThongKeThangNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, 110, -1));

        lblThongKeThang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblThongKeThang.setText("Thống kê doanh thu theo tháng");
        add(lblThongKeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 23, 470, -1));

        lblThongKeNam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblThongKeNam.setText("Thống kê doanh thu theo năm");
        add(lblThongKeNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, 675, -1));
        add(txtTimKiemNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 69, 224, -1));
        add(txtTimKiemThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 200, -1));
        add(barChart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 680, 370));
        add(barChart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 710, 370));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.Chart.BarChart.BarChart barChart3;
    private com.GUI.Chart.BarChart.BarChart barChart4;
    private javax.swing.JComboBox<String> cboThongKeNam;
    private javax.swing.JComboBox<String> cboThongKeThangNam;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblNamDTThapNhat;
    private javax.swing.JLabel lblNamDoanhThuCaoNhatNam;
    private javax.swing.JLabel lblTBDoanhThuNam;
    private javax.swing.JLabel lblThangDTCaoNhat;
    private javax.swing.JLabel lblThangDTThapNhat;
    private javax.swing.JLabel lblThongKeNam;
    private javax.swing.JLabel lblThongKeThang;
    private javax.swing.JLabel lblTongDTNam;
    private javax.swing.JLabel lblTongDTThang;
    private javax.swing.JLabel lblTrungBinhDTThang;
    private com.GUI.swing.Table tblThongKeNam;
    private com.GUI.swing.Table tblThongKeThang;
    private javax.swing.JTextField txtTimKiemNam;
    private javax.swing.JTextField txtTimKiemThang;
    // End of variables declaration//GEN-END:variables
}
