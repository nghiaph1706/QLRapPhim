package com.GUI.form.SaoLuu;

public class SaoLuu_Form extends javax.swing.JPanel {

    public SaoLuu_Form() {
        initComponents();
        setOpaque(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDuLieu = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLichSu = new javax.swing.JTable();
        btnXuatTrucTiep = new javax.swing.JButton();
        btnXuatBKTai = new javax.swing.JButton();
        btnXuatLog = new javax.swing.JButton();

        setBackground(new java.awt.Color(20, 30, 48));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("DỮ LIỆU");

        tblDuLieu.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDuLieu.setGridColor(new java.awt.Color(255, 51, 51));
        tblDuLieu.setRowHeight(50);
        tblDuLieu.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblDuLieu.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tblDuLieu);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("NHẬT KÝ HOẠT ĐỘNG");

        tblLichSu.setModel(new javax.swing.table.DefaultTableModel(
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
        tblLichSu.setGridColor(new java.awt.Color(255, 51, 51));
        tblLichSu.setRowHeight(50);
        tblLichSu.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblLichSu.setShowHorizontalLines(true);
        jScrollPane2.setViewportView(tblLichSu);

        btnXuatTrucTiep.setBackground(new java.awt.Color(51, 51, 51));
        btnXuatTrucTiep.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnXuatTrucTiep.setForeground(new java.awt.Color(255, 51, 51));
        btnXuatTrucTiep.setText("XUẤT BACKUP FILE TRỰC TIẾP");
        btnXuatTrucTiep.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnXuatBKTai.setBackground(new java.awt.Color(51, 51, 51));
        btnXuatBKTai.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnXuatBKTai.setForeground(new java.awt.Color(255, 51, 51));
        btnXuatBKTai.setText("XUẤT BACKUP FILE TẠI ...");
        btnXuatBKTai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnXuatLog.setBackground(new java.awt.Color(51, 51, 51));
        btnXuatLog.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnXuatLog.setForeground(new java.awt.Color(255, 51, 51));
        btnXuatLog.setText("XUẤT LOG FILE");
        btnXuatLog.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(270, Short.MAX_VALUE)
                        .addComponent(btnXuatLog, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatBKTai, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatTrucTiep, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatTrucTiep, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatBKTai, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatLog, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXuatBKTai;
    private javax.swing.JButton btnXuatLog;
    private javax.swing.JButton btnXuatTrucTiep;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDuLieu;
    private javax.swing.JTable tblLichSu;
    // End of variables declaration//GEN-END:variables
}
