package com.GUI.form.ThongKe;

import java.awt.Color;
import java.awt.Font;

public class TKLuotXem_Form extends javax.swing.JPanel {

    public TKLuotXem_Form() {
        initComponents();
        setOpaque(false);
        initText();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblTongPhim1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPhimLuotXemThapNhatNam = new javax.swing.JLabel();
        lblTBDoanhThuNam = new javax.swing.JLabel();
        lblPhimLuotXemCaoNhatNam = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblTongPhim2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPhimLuotXemCaoNhatThang = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPhimLuotXemThapNhatThang = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTBDoanhThuThang = new javax.swing.JLabel();
        cboThongKeNam = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThongKeNam = new com.GUI.swing.Table();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblThongKeThang = new com.GUI.swing.Table();
        cboThongKeThangNam = new javax.swing.JComboBox<>();
        cboThongKeThang = new javax.swing.JComboBox<>();
        txtTimKiemThang = new javax.swing.JTextField();
        lblThongKeNam = new javax.swing.JLabel();
        lblThongKeThang = new javax.swing.JLabel();
        txtTimKiemNam = new javax.swing.JTextField();
        chartPie1 = new com.GUI.Chart.ChartPie.ChartPie();
        chartPie2 = new com.GUI.Chart.ChartPie.ChartPie();

        setBackground(new java.awt.Color(20, 30, 48));

        lblTongPhim1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongPhim1.setText("TỔNG PHIM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setText("9.000.000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Phim lượt xem cao nhất");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Phim lượt xem thấp nhất");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Trung bình doanh thu");

        lblPhimLuotXemThapNhatNam.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblPhimLuotXemThapNhatNam.setText("jLabel2");

        lblTBDoanhThuNam.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTBDoanhThuNam.setText("jLabel3");

        lblPhimLuotXemCaoNhatNam.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblPhimLuotXemCaoNhatNam.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(lblPhimLuotXemCaoNhatNam))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTongPhim1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPhimLuotXemThapNhatNam))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTBDoanhThuNam)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTongPhim1)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhimLuotXemCaoNhatNam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhimLuotXemThapNhatNam)
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTBDoanhThuNam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel11.setText("9.000.000");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 42, -1, -1));

        lblTongPhim2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongPhim2.setText("TỔNG PHIM");
        jPanel4.add(lblTongPhim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 11, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Phim lượt xem cao nhất");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, -1, -1));

        lblPhimLuotXemCaoNhatThang.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblPhimLuotXemCaoNhatThang.setText("jLabel1");
        jPanel4.add(lblPhimLuotXemCaoNhatThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 111, -1, 22));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Phim lượt xem thấp nhất");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, -1));

        lblPhimLuotXemThapNhatThang.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblPhimLuotXemThapNhatThang.setText("jLabel2");
        jPanel4.add(lblPhimLuotXemThapNhatThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Trung bình doanh thu");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, -1, -1));

        lblTBDoanhThuThang.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTBDoanhThuThang.setText("jLabel3");
        jPanel4.add(lblTBDoanhThuThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, -1, -1));

        cboThongKeNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        cboThongKeThangNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboThongKeThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTimKiemThang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemThangKeyReleased(evt);
            }
        });

        lblThongKeNam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblThongKeNam.setText("Thống kê phim theo năm");

        lblThongKeThang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblThongKeThang.setText("Thống kê phim theo tháng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThongKeNam, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(chartPie2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTimKiemNam, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboThongKeNam, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblThongKeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(266, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTimKiemThang, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboThongKeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(cboThongKeThangNam, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThongKeNam)
                    .addComponent(lblThongKeThang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboThongKeNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTimKiemNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboThongKeThangNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboThongKeThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTimKiemThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chartPie2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemThangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemThangKeyReleased
       
    }//GEN-LAST:event_txtTimKiemThangKeyReleased
    public void initText(){
        txtTimKiemThang.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
        lblTongPhim1.setForeground(new Color(255,51,51));
        lblTongPhim2.setForeground(new Color(255,51,51));
        lblThongKeNam.setForeground(new Color(255,51,51));
        lblThongKeThang.setForeground(new Color(255,51,51));
        lblThongKeNam.setFont(new Font("Segoe UI Variable", Font.PLAIN, 24)); 
        lblThongKeThang.setFont(new Font("Segoe UI Variable", Font.PLAIN, 24));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboThongKeNam;
    private javax.swing.JComboBox<String> cboThongKeThang;
    private javax.swing.JComboBox<String> cboThongKeThangNam;
    private com.GUI.Chart.ChartPie.ChartPie chartPie1;
    private com.GUI.Chart.ChartPie.ChartPie chartPie2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblPhimLuotXemCaoNhatNam;
    private javax.swing.JLabel lblPhimLuotXemCaoNhatThang;
    private javax.swing.JLabel lblPhimLuotXemThapNhatNam;
    private javax.swing.JLabel lblPhimLuotXemThapNhatThang;
    private javax.swing.JLabel lblTBDoanhThuNam;
    private javax.swing.JLabel lblTBDoanhThuThang;
    private javax.swing.JLabel lblThongKeNam;
    private javax.swing.JLabel lblThongKeThang;
    private javax.swing.JLabel lblTongPhim1;
    private javax.swing.JLabel lblTongPhim2;
    private com.GUI.swing.Table tblThongKeNam;
    private com.GUI.swing.Table tblThongKeThang;
    private javax.swing.JTextField txtTimKiemNam;
    private javax.swing.JTextField txtTimKiemThang;
    // End of variables declaration//GEN-END:variables
}
