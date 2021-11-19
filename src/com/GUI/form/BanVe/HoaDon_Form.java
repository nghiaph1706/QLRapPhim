/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GUI.form.BanVe;

import DAO.DichVuDAO;
import DAO.HoaDonDAO;
import DAO.KhuyenMaiDAO;
import DAO.LichChieuDAO;
import DAO.PhimDAO;
import Entity.HoaDon;
import com.GUI.main.Main;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author berug
 */
public class HoaDon_Form extends javax.swing.JPanel {

    /**
     * Creates new form HoaDon_Form
     */
    private LichChieuDAO lcDAO = new LichChieuDAO();
    private KhuyenMaiDAO kmDAO = new KhuyenMaiDAO();
    private HoaDonDAO hdDAO = new HoaDonDAO();
    private PhimDAO phDAO = new PhimDAO();
    private DichVuDAO dvDAO = new DichVuDAO();
    private String[] header = {
        "Tổng tiền", "Mã KM", "Mã KHTT", "Mức giảm giá", "Thành Tiền", "Ngày lập", "Mã NV"
    };
    private DefaultTableModel model = new DefaultTableModel(header, 0);
    public HoaDon_Form() {
        initComponents();
        init();
    }

    private void init()
    {
        tblHoaDon.setModel(model);
        loadDatabase();
        comboBoxThanhToan();
    }
    private void loadDatabase()
    {
        model.setRowCount(0);
        try {
            System.out.println(BanVe_Form.MaHDTuHDCT);
            List<HoaDon> list = hdDAO.selectByMaHDFromHDCT(BanVe_Form.MaHDTuHDCT);
            for(HoaDon hd : list)
            {
                Object[] row = {
                    hd.getTongTien(),
                    hd.getMaKM(),
                    hd.getMaKHTT(),
                    hd.getMucGiamGia(),
                    hd.getThanhTien(),
                    hd.getNgayLap(),
                    hd.getMaNhanVien()
                };
                model.addRow(row);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private void comboBoxThanhToan()
    {
        cboPTThanhToan.addItem("Thanh toán bằng tiền mặt");
        cboPTThanhToan.addItem("Thanh toán bằng thẻ tín dụng");
        cboPTThanhToan.addItem("Thanh toán bằng MOMO");
        cboPTThanhToan.addItem("Thanh toán bằng quét mã QR");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new com.GUI.swing.Table();
        jLabel1 = new javax.swing.JLabel();
        cboPTThanhToan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnThanhToan = new com.GUI.swing.Button();
        btnQuayLai = new com.GUI.swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblHoaDon);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("BẢNG HÓA ĐƠN");

        cboPTThanhToan.setBackground(new java.awt.Color(224, 224, 224));
        cboPTThanhToan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        cboPTThanhToan.setForeground(new java.awt.Color(51, 51, 51));
        cboPTThanhToan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("PHƯƠNG THỨC THANH TOÁN: ");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnQuayLai.setForeground(new java.awt.Color(255, 255, 255));
        btnQuayLai.setText("QUAY LẠI");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(318, 318, 318)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboPTThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPTThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        Main.main.showForm(Main.banVe);
    }//GEN-LAST:event_btnQuayLaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.Button btnQuayLai;
    private com.GUI.swing.Button btnThanhToan;
    private javax.swing.JComboBox<String> cboPTThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.GUI.swing.Table tblHoaDon;
    // End of variables declaration//GEN-END:variables
}
