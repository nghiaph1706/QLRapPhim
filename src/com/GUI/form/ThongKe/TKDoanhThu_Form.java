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
        jPanel5 = new javax.swing.JPanel();
        lblTongDTThang = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNamDoanhThuCaoNhatNam1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblNamDTThapNhat1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblTBDoanhThuNam1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(224, 224, 224));

        lblTongDTNam.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        lblTongDTNam.setForeground(new java.awt.Color(255, 51, 51));
        lblTongDTNam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongDTNam.setText("TỔNG DT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("9.000.000");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Năm doanh thu cao nhất");

        lblNamDoanhThuCaoNhatNam.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNamDoanhThuCaoNhatNam.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Segoe UI Variable", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Năm doanh thu thấp nhất");

        lblNamDTThapNhat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNamDTThapNhat.setText("jLabel2");

        jLabel13.setFont(new java.awt.Font("Segoe UI Variable", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Trung bình doanh thu");

        lblTBDoanhThuNam.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTBDoanhThuNam.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTongDTNam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamDoanhThuCaoNhatNam)
                            .addComponent(lblTBDoanhThuNam))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNamDTThapNhat)
                        .addContainerGap(123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTongDTNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamDoanhThuCaoNhatNam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamDTThapNhat)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTBDoanhThuNam)
                .addGap(27, 27, 27))
        );

        cboThongKeNam.setBackground(new java.awt.Color(224, 224, 224));
        cboThongKeNam.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N

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

        cboThongKeThangNam.setBackground(new java.awt.Color(224, 224, 224));
        cboThongKeThangNam.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cboThongKeThangNam.setForeground(new java.awt.Color(51, 51, 51));

        lblThongKeThang.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        lblThongKeThang.setForeground(new java.awt.Color(255, 51, 51));
        lblThongKeThang.setText("THỐNG KÊ DOANH THU THEO THÁNG");

        lblThongKeNam.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        lblThongKeNam.setForeground(new java.awt.Color(255, 51, 51));
        lblThongKeNam.setText("THỐNG KÊ DOANH THU THEO NĂM");

        txtTimKiemNam.setBackground(new java.awt.Color(224, 224, 224));

        txtTimKiemThang.setBackground(new java.awt.Color(224, 224, 224));

        jComboBox1.setBackground(new java.awt.Color(224, 224, 224));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(224, 224, 224));

        lblTongDTThang.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        lblTongDTThang.setForeground(new java.awt.Color(255, 51, 51));
        lblTongDTThang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongDTThang.setText("TỔNG DT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("9.000.000");

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Tháng doanh thu cao nhất");

        lblNamDoanhThuCaoNhatNam1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNamDoanhThuCaoNhatNam1.setText("jLabel1");

        jLabel17.setFont(new java.awt.Font("Segoe UI Variable", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("Tháng doanh thu thấp nhất");

        lblNamDTThapNhat1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNamDTThapNhat1.setText("jLabel2");

        jLabel18.setFont(new java.awt.Font("Segoe UI Variable", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("Trung bình doanh thu");

        lblTBDoanhThuNam1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTBDoanhThuNam1.setText("jLabel3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTongDTThang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamDoanhThuCaoNhatNam1)
                            .addComponent(lblTBDoanhThuNam1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNamDTThapNhat1)
                        .addContainerGap(123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTongDTThang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamDoanhThuCaoNhatNam1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamDTThapNhat1)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTBDoanhThuNam1)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barChart3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblThongKeNam, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTimKiemNam, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboThongKeNam, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtTimKiemThang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboThongKeThangNam, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblThongKeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(barChart4, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboThongKeThangNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimKiemThang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblThongKeNam)
                                .addComponent(lblThongKeThang))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboThongKeNam)
                                        .addComponent(txtTimKiemNam))
                                    .addGap(7, 7, 7)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barChart4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barChart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.Chart.BarChart.BarChart barChart3;
    private com.GUI.Chart.BarChart.BarChart barChart4;
    private javax.swing.JComboBox<String> cboThongKeNam;
    private javax.swing.JComboBox<String> cboThongKeThangNam;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblNamDTThapNhat;
    private javax.swing.JLabel lblNamDTThapNhat1;
    private javax.swing.JLabel lblNamDoanhThuCaoNhatNam;
    private javax.swing.JLabel lblNamDoanhThuCaoNhatNam1;
    private javax.swing.JLabel lblTBDoanhThuNam;
    private javax.swing.JLabel lblTBDoanhThuNam1;
    private javax.swing.JLabel lblThongKeNam;
    private javax.swing.JLabel lblThongKeThang;
    private javax.swing.JLabel lblTongDTNam;
    private javax.swing.JLabel lblTongDTThang;
    private com.GUI.swing.Table tblThongKeNam;
    private com.GUI.swing.Table tblThongKeThang;
    private javax.swing.JTextField txtTimKiemNam;
    private javax.swing.JTextField txtTimKiemThang;
    // End of variables declaration//GEN-END:variables
}
