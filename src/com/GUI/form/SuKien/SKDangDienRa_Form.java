package com.GUI.form.SuKien;

import DAO.KhuyenMaiDAO;
import Entity.KhuyenMai;
import Utilities.ValidateCheck;
import Utilities.XDate;
import com.GUI.swing.ScrollBar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SKDangDienRa_Form extends javax.swing.JPanel {

    private DefaultTableModel modeltable;
    private List<KhuyenMai> list;
    private ValidateCheck vld = new ValidateCheck();
    private KhuyenMaiDAO KmAction;
    static SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");

    public SKDangDienRa_Form() {
        initComponents();
        setOpaque(false);
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        FillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btndelete = new com.GUI.swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsukien = new com.GUI.swing.Table();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("SỰ KIỆN ĐANG DIỄN RA");

        btndelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("XÓA");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        tblsukien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã KM", "Tên Khuyến Mãi", "Mức Giảm Giá", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Mã Nhân Viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblsukien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(499, 499, 499))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if (tblsukien.getRowCount() > 0) {
            DeleteValues();
        } else {
            JOptionPane.showMessageDialog(this, "Chưa Có Dữ Liệu!", "Lỗi!", 0);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.Button btndelete;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.GUI.swing.Table tblsukien;
    // End of variables declaration//GEN-END:variables


    private void FillTable() {
        list = null;
        list = new KhuyenMaiDAO().selectallbydate();
        modeltable = (DefaultTableModel) tblsukien.getModel();
        modeltable.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            modeltable.addRow(new Object[]{list.get(i).getMaKM(), list.get(i).getTenKM(), list.get(i).getMucGiamGia(), list.get(i).getNgayBatDau(), list.get(i).getNgayKetThuc(), list.get(i).getMaNhanVien()});
        }
        modeltable.fireTableDataChanged();
    }

    private void DeleteValues() {
        int index = tblsukien.getSelectedRow();
        if (index != -1) {
            KmAction = new KhuyenMaiDAO();
            KmAction.delete(tblsukien.getValueAt(index, 0).toString());
            JOptionPane.showMessageDialog(this, "Xóa Dữ Liệu Thành Công!", "Hoàn Thành", 0);
            FillTable();
            return;
        }
        JOptionPane.showMessageDialog(this, "Xóa Dữ Liệu Không Thành Công!", "Lỗi!", 0);
    }
}
