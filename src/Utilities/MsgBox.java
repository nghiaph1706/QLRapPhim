package Utilities;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author taoda
 */
public class MsgBox extends javax.swing.JFrame {
    
    public boolean bln;
    
    public MsgBox() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(this);
        messPanel.setVisible(false);
        confirmPanel.setVisible(false);
    }
    
    public void showMess(String mess){
        messPanel.setVisible(true);
        setVisible(true);
        txtMess.setText(mess);
    }
    
    public boolean showConfirm(String mess){
        confirmPanel.setVisible(true);
        setVisible(true);
        txtMess1.setText(mess);
        return bln;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messPanel = new com.GUI.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        txtMess = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        confirmPanel = new com.GUI.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        txtMess1 = new javax.swing.JLabel();
        btnTrue = new javax.swing.JButton();
        btnFalse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        messPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("CFL CINEMA MESSAGE");

        txtMess.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        txtMess.setText("Message here");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout messPanelLayout = new javax.swing.GroupLayout(messPanel);
        messPanel.setLayout(messPanelLayout);
        messPanelLayout.setHorizontalGroup(
            messPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messPanelLayout.createSequentialGroup()
                .addGroup(messPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(messPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(messPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMess, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(messPanelLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        messPanelLayout.setVerticalGroup(
            messPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMess, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(messPanel, "card2");

        confirmPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("CFL CINEMA CONFIRM");

        txtMess1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        txtMess1.setText("Message here");

        btnTrue.setBackground(new java.awt.Color(255, 255, 255));
        btnTrue.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnTrue.setText("OK");
        btnTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrueActionPerformed(evt);
            }
        });

        btnFalse.setBackground(new java.awt.Color(255, 255, 255));
        btnFalse.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnFalse.setText("CANCEL");
        btnFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confirmPanelLayout = new javax.swing.GroupLayout(confirmPanel);
        confirmPanel.setLayout(confirmPanelLayout);
        confirmPanelLayout.setHorizontalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPanelLayout.createSequentialGroup()
                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMess1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(confirmPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnFalse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        confirmPanelLayout.setVerticalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMess1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 43, Short.MAX_VALUE)
                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(confirmPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrueActionPerformed
        bln = true;
        this.dispose();
    }//GEN-LAST:event_btnTrueActionPerformed

    private void btnFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFalseActionPerformed
        bln = false;
        this.dispose();
    }//GEN-LAST:event_btnFalseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MsgBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MsgBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MsgBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MsgBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MsgBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFalse;
    private javax.swing.JButton btnTrue;
    private com.GUI.swing.PanelBorder confirmPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.GUI.swing.PanelBorder messPanel;
    private javax.swing.JLabel txtMess;
    private javax.swing.JLabel txtMess1;
    // End of variables declaration//GEN-END:variables
}
