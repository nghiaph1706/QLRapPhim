package com.GUI.form;

public class QuanLyLichChieu_Form extends javax.swing.JPanel {

    public QuanLyLichChieu_Form() {
        initComponents();
        setOpaque(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.GUI.swing.Table();
        textField1 = new com.GUI.swing.TextField();
        textField2 = new com.GUI.swing.TextField();
        textField3 = new com.GUI.swing.TextField();
        textField4 = new com.GUI.swing.TextField();
        textField6 = new com.GUI.swing.TextField();
        textField7 = new com.GUI.swing.TextField();
        txtNgayKTchieu = new com.toedter.calendar.JDateChooser();
        txtsearchDate = new com.toedter.calendar.JDateChooser();
        txtsearchDate1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        buttonBadges1 = new com.GUI.swing.ButtonBadges();
        buttonBadges2 = new com.GUI.swing.ButtonBadges();
        buttonBadges3 = new com.GUI.swing.ButtonBadges();
        buttonBadges4 = new com.GUI.swing.ButtonBadges();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNgaychieu = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã lịch chiếu", "Mã phim", "Mã phòng", "Tên phim", "Ngày chiếu", "Ngày KT chiếu", "Giờ chiếu"
            }
        ));
        table1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(table1);

        textField1.setBackground(new java.awt.Color(224, 224, 224));
        textField1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField1.setLabelText("Tìm kiếm");

        textField2.setBackground(new java.awt.Color(224, 224, 224));
        textField2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField2.setLabelText("Mã lịch chiếu");

        textField3.setBackground(new java.awt.Color(224, 224, 224));
        textField3.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField3.setLabelText("Tên phim");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });

        textField4.setBackground(new java.awt.Color(224, 224, 224));
        textField4.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField4.setLabelText("Giờ chiếu");

        textField6.setBackground(new java.awt.Color(224, 224, 224));
        textField6.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField6.setLabelText("Mã phim");

        textField7.setBackground(new java.awt.Color(224, 224, 224));
        textField7.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField7.setLabelText("Mã phòng");

        txtNgayKTchieu.setBackground(new java.awt.Color(224, 224, 224));
        txtNgayKTchieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtsearchDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtsearchDate1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên phim 1", "Tên phim 2", "Tên phim 3", "Tên phim 4" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Quản lí lịch chiếu");

        buttonBadges1.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges1.setForeground(new java.awt.Color(255, 51, 51));
        buttonBadges1.setText("Sửa");
        buttonBadges1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N

        buttonBadges2.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges2.setForeground(new java.awt.Color(255, 51, 51));
        buttonBadges2.setText("Lưu");
        buttonBadges2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N

        buttonBadges3.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges3.setForeground(new java.awt.Color(255, 21, 72));
        buttonBadges3.setText("Thêm");
        buttonBadges3.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N

        buttonBadges4.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges4.setForeground(new java.awt.Color(255, 51, 51));
        buttonBadges4.setText("Xóa");
        buttonBadges4.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Từ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Đến");

        txtNgaychieu.setBackground(new java.awt.Color(224, 224, 224));
        txtNgaychieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Ngày chiếu");

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Ngày KT chiếu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearchDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBadges3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBadges4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayKTchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(525, 525, 525))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsearchDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtsearchDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addComponent(textField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaychieu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayKTchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBadges3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBadges4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.ButtonBadges buttonBadges1;
    private com.GUI.swing.ButtonBadges buttonBadges2;
    private com.GUI.swing.ButtonBadges buttonBadges3;
    private com.GUI.swing.ButtonBadges buttonBadges4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.GUI.swing.Table table1;
    private com.GUI.swing.TextField textField1;
    private com.GUI.swing.TextField textField2;
    private com.GUI.swing.TextField textField3;
    private com.GUI.swing.TextField textField4;
    private com.GUI.swing.TextField textField6;
    private com.GUI.swing.TextField textField7;
    private com.toedter.calendar.JDateChooser txtNgayKTchieu;
    private com.toedter.calendar.JDateChooser txtNgaychieu;
    private com.toedter.calendar.JDateChooser txtsearchDate;
    private com.toedter.calendar.JDateChooser txtsearchDate1;
    // End of variables declaration//GEN-END:variables
}
