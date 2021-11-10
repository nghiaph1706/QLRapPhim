package com.GUI.form.SaoLuu;

public class KhoiPhuc_Form extends javax.swing.JPanel {

    public KhoiPhuc_Form() {
        initComponents();
        setOpaque(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNhapDuLieu = new javax.swing.JButton();
        pgbQuaTrinh = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstQuaTrinh = new javax.swing.JList<>();

        setBackground(new java.awt.Color(20, 30, 48));

        btnNhapDuLieu.setBackground(new java.awt.Color(51, 51, 51));
        btnNhapDuLieu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnNhapDuLieu.setForeground(new java.awt.Color(255, 51, 51));
        btnNhapDuLieu.setText("NHẬP BACKUP DỮ LIỆU");
        btnNhapDuLieu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jScrollPane1.setViewportView(lstQuaTrinh);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgbQuaTrinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(btnNhapDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnNhapDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(pgbQuaTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapDuLieu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstQuaTrinh;
    private javax.swing.JProgressBar pgbQuaTrinh;
    // End of variables declaration//GEN-END:variables
}
