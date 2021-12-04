package com.GUI.form.SaoLuu;

public class KhoiPhuc_Form extends javax.swing.JPanel {

    public KhoiPhuc_Form() {
        initComponents();
        setOpaque(false);
        textField1.setLabelText("Đường dẫn");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        textField1 = new com.GUI.swing.TextField();
        button3 = new com.GUI.swing.Button();
        progressBarCustom1 = new com.GUI.swing.ProgressBarCustom();
        button4 = new com.GUI.swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("KHÔI PHỤC DỮ LIỆU");

        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("LẤY DỮ LIỆU");
        button3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        progressBarCustom1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        progressBarCustom1.setForeground(new java.awt.Color(51, 255, 153));
        progressBarCustom1.setValue(50);

        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("NHẬP DỮ LIỆU");
        button4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(477, 477, 477)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progressBarCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(199, 199, 199)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(progressBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.Button button3;
    private com.GUI.swing.Button button4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private com.GUI.swing.ProgressBarCustom progressBarCustom1;
    private com.GUI.swing.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
