package com.GUI.form.SaoLuu;

import Entity.HoaDon;
import Utilities.Auth;
import Utilities.Log;
import Utilities.MsgBox;
import Utilities.XJdbc;
import com.GUI.form.BanVe.HoaDon_Form;
import com.GUI.swing.ScrollBar;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class SaoLuu_Form extends javax.swing.JPanel {

    private HoaDon hd = new HoaDon();
    private static String[] header = {
        "Tác vụ", "Người thực hiện", "Thời gian"
    };
    private static List<Log> listLog = new ArrayList<>();
    private String path = System.getProperty("user.dir");
    private JFileChooser fc;
    private String dir = "";
    static DefaultTableModel model = new DefaultTableModel(header, 0);

    public SaoLuu_Form() {
        initComponents();
        init();
        setOpaque(false);
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhatKyHD = new com.GUI.swing.Table();
        jLabel3 = new javax.swing.JLabel();
        btnXuatTrucTiep = new com.GUI.swing.Button();
        btnXuatDen = new com.GUI.swing.Button();
        btnXuatLog = new com.GUI.swing.Button();
        progressBarCustom1 = new com.GUI.swing.ProgressBarCustom();
        jLabel4 = new javax.swing.JLabel();
        txtDuongDan = new com.GUI.swing.TextField();
        progressBarCustom2 = new com.GUI.swing.ProgressBarCustom();
        btnLayDuLieu = new com.GUI.swing.Button();
        btnNhapDuLieu = new com.GUI.swing.Button();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("DỮ LIỆU");

        tblNhatKyHD.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblNhatKyHD);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("NHẬT KÝ HOẠT ĐỘNG");

        btnXuatTrucTiep.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatTrucTiep.setText("XUẤT DỮ LIỆU TRỰC TIẾP");
        btnXuatTrucTiep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatTrucTiepActionPerformed(evt);
            }
        });

        btnXuatDen.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatDen.setText("XUẤT DỮ LIỆU ĐẾN");
        btnXuatDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatDenActionPerformed(evt);
            }
        });

        btnXuatLog.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatLog.setText("XUẤT NHẬT KÝ HOẠT ĐỘNG");
        btnXuatLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatLogActionPerformed(evt);
            }
        });

        progressBarCustom1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        progressBarCustom1.setForeground(new java.awt.Color(51, 255, 153));
        progressBarCustom1.setValue(50);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("DUNG LƯỢNG");

        txtDuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuongDanActionPerformed(evt);
            }
        });

        progressBarCustom2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        progressBarCustom2.setForeground(new java.awt.Color(51, 255, 153));
        progressBarCustom2.setValue(50);

        btnLayDuLieu.setForeground(new java.awt.Color(255, 255, 255));
        btnLayDuLieu.setText("LẤY DỮ LIỆU");
        btnLayDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLayDuLieuActionPerformed(evt);
            }
        });

        btnNhapDuLieu.setForeground(new java.awt.Color(255, 255, 255));
        btnNhapDuLieu.setText("NHẬP DỮ LIỆU");
        btnNhapDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapDuLieuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("KHÔI PHỤC DỮ LIỆU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnXuatLog, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnXuatDen, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnXuatTrucTiep, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(progressBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(progressBarCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                                .addComponent(txtDuongDan, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLayDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNhapDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(239, 239, 239))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(progressBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(progressBarCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNhapDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLayDuLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 107, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatTrucTiep, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatDen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatLog, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatTrucTiepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatTrucTiepActionPerformed
        // TODO add your handling code here:
        backup_DuLieu_TrucTiep();
    }//GEN-LAST:event_btnXuatTrucTiepActionPerformed

    private void btnXuatDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatDenActionPerformed
        // TODO add your handling code here:
        backup_DuLieu_Den();
    }//GEN-LAST:event_btnXuatDenActionPerformed

    private void btnXuatLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatLogActionPerformed
        // TODO add your handling code here:
        xuatLog();
    }//GEN-LAST:event_btnXuatLogActionPerformed

    private void btnLayDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLayDuLieuActionPerformed
        // TODO add your handling code here:
        layDuLieu();
    }//GEN-LAST:event_btnLayDuLieuActionPerformed

    private void btnNhapDuLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapDuLieuActionPerformed

        // TODO add your handling code here:
        nhapDuLieu();
    }//GEN-LAST:event_btnNhapDuLieuActionPerformed

    private void txtDuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuongDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuongDanActionPerformed

    private void init() {
        tblNhatKyHD.setModel(model);
    }

    public static void logDuLieu() {
        Log log = new Log();
        log.setLogDangNhap(Auth.user.getMaNhanVien());
        log.setLogThanhToan(HoaDon_Form.maHoaDon_Paid);
        log.setLogThoiGian(new Date());
        listLog.add(log);
        fillTable();
    }

    private static void fillTable() {
        model.setRowCount(0);
        for (Log l : listLog) {
            Object[] rows = {
                l.lichSuThanhToan(),
                l.lichSuDangNhap(),
                l.thoiGianThucHien()
            };
            model.addRow(rows);
        }
        System.out.println(listLog.size());
    }

    private void xuatLog() {
        try {
            File file = new File("log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < tblNhatKyHD.getColumnCount(); j++) {
                    bw.write(tblNhatKyHD.getColumnName(j) + "  ");
                }
                bw.write("\n------------------------------------------------------------------\n");
            }
            for (int i = 0; i < tblNhatKyHD.getRowCount(); i++) {
                for (int j = 0; j < tblNhatKyHD.getColumnCount(); j++) {
                    if (tblNhatKyHD.getModel().getValueAt(i, j) == null) {
                        tblNhatKyHD.getModel().setValueAt("NULL", i, j);
                    }
                    bw.write(tblNhatKyHD.getModel().getValueAt(i, j).toString() + " | ");
                }
                bw.write("\n------------------------------------------------------------------\n");
            }
            MsgBox.alert(this, "Xuất Log thành công");
            bw.close();
            fw.close();
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }

    private void backup_DuLieu_Den() {
        try {
            String backup = "";
            fc = new JFileChooser();
            fc.setDialogTitle("Export to..");
            if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                backup = "BACKUP DATABASE QL_RapPhim TO DISK = '" + fc.getSelectedFile() + "'";
                System.out.println("Current Dir: " + fc.getCurrentDirectory());
                System.out.println("File Selected: " + fc.getSelectedFile());
            } else {
                System.out.println("No export");
            }
            XJdbc.update(backup);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void backup_DuLieu_TrucTiep() {
        try {
            String backup = "BACKUP DATABASE QL_RapPhim TO DISK = 'D:\\test.bak'";
            XJdbc.update(backup);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void layDuLieu() {
        try {
            fc = new JFileChooser();
            if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                txtDuongDan.setText("" + fc.getSelectedFile());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void nhapDuLieu() {
        try {
            String restore = "RESTORE DATABASE QL_RAPPHIM FROM DISK = '" + txtDuongDan.getText().trim() + "'";
            XJdbc.update(restore);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.Button btnLayDuLieu;
    private com.GUI.swing.Button btnNhapDuLieu;
    private com.GUI.swing.Button btnXuatDen;
    private com.GUI.swing.Button btnXuatLog;
    private com.GUI.swing.Button btnXuatTrucTiep;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.GUI.swing.ProgressBarCustom progressBarCustom1;
    private com.GUI.swing.ProgressBarCustom progressBarCustom2;
    private com.GUI.swing.Table tblNhatKyHD;
    private com.GUI.swing.TextField txtDuongDan;
    // End of variables declaration//GEN-END:variables
}
