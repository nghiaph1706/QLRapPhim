package com.GUI.form.Phim;

public class QuanLyPhim_Form extends javax.swing.JPanel {

    public QuanLyPhim_Form() {
        initComponents();
        setOpaque(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
<<<<<<< HEAD
=======
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.GUI.swing.Table();
        textField1 = new com.GUI.swing.TextField();
        textField2 = new com.GUI.swing.TextField();
        textField3 = new com.GUI.swing.TextField();
        textField4 = new com.GUI.swing.TextField();
        textField5 = new com.GUI.swing.TextField();
        textField6 = new com.GUI.swing.TextField();
        textField7 = new com.GUI.swing.TextField();
        textField8 = new com.GUI.swing.TextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelBorder1 = new com.GUI.swing.PanelBorder();
        panelBorder2 = new com.GUI.swing.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonBadges2 = new com.GUI.swing.ButtonBadges();
        buttonBadges4 = new com.GUI.swing.ButtonBadges();
        buttonBadges5 = new com.GUI.swing.ButtonBadges();
>>>>>>> origin/duytrinoigiong

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(159, 159, 159));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
<<<<<<< HEAD
        jLabel1.setText("quan ly ohim");
=======

        table1.setBackground(new java.awt.Color(255, 51, 51));
        table1.setForeground(new java.awt.Color(255, 51, 51));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phim", "Tên phim", "Ngày khởi chiếu", "Ngày kết thúc", "Quốc gia", "Mã thể loại", "Thể loại", "Mã định dạng", "Tên định dạng"
            }
        ));
        table1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        table1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(table1);

        textField1.setBackground(new java.awt.Color(224, 224, 224));
        textField1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField1.setLabelText("Mã phim");

        textField2.setBackground(new java.awt.Color(224, 224, 224));
        textField2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField2.setLabelText("Mã thể loại");

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
        textField4.setLabelText("Ngày kết thúc");

        textField5.setBackground(new java.awt.Color(224, 224, 224));
        textField5.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField5.setLabelText("Quốc gia");

        textField6.setBackground(new java.awt.Color(224, 224, 224));
        textField6.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField6.setLabelText("Mã định dạng");

        textField7.setBackground(new java.awt.Color(224, 224, 224));
        textField7.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField7.setLabelText("Định dạng");

        textField8.setBackground(new java.awt.Color(224, 224, 224));
        textField8.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        textField8.setLabelText("Ngày khởi chiếu");
        textField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField8ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(224, 224, 224));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Trinh thám", "Hoạt hình" }));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("P");

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("S");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("O");

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("T");

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("E");

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("R");

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("R");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(5, 5, 5))
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(146, 146, 146)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Quản lí phim");

        buttonBadges2.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges2.setForeground(new java.awt.Color(255, 51, 51));
        buttonBadges2.setText("Thêm");
        buttonBadges2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        buttonBadges2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges2ActionPerformed(evt);
            }
        });

        buttonBadges4.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges4.setForeground(new java.awt.Color(255, 51, 51));
        buttonBadges4.setText("Xóa");
        buttonBadges4.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        buttonBadges4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges4ActionPerformed(evt);
            }
        });

        buttonBadges5.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges5.setForeground(new java.awt.Color(255, 51, 51));
        buttonBadges5.setText("Sửa");
        buttonBadges5.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        buttonBadges5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges5ActionPerformed(evt);
            }
        });
>>>>>>> origin/duytrinoigiong

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
=======
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(548, 548, 548)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(buttonBadges5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(buttonBadges4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonBadges5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonBadges4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBadges2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBadges2ActionPerformed

    private void buttonBadges4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBadges4ActionPerformed

    private void buttonBadges5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBadges5ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.ButtonBadges buttonBadges2;
    private com.GUI.swing.ButtonBadges buttonBadges4;
    private com.GUI.swing.ButtonBadges buttonBadges5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.GUI.swing.PanelBorder panelBorder1;
    private com.GUI.swing.PanelBorder panelBorder2;
    private com.GUI.swing.Table table1;
    private com.GUI.swing.TextField textField1;
    private com.GUI.swing.TextField textField2;
    private com.GUI.swing.TextField textField3;
    private com.GUI.swing.TextField textField4;
    private com.GUI.swing.TextField textField5;
    private com.GUI.swing.TextField textField6;
    private com.GUI.swing.TextField textField7;
    private com.GUI.swing.TextField textField8;
>>>>>>> origin/duytrinoigiong
    // End of variables declaration//GEN-END:variables
}
