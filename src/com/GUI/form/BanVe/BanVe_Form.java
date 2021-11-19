package com.GUI.form.BanVe;

import DAO.HoaDonDAO;
import DAO.KhuyenMaiDAO;
import DAO.LichChieuDAO;
import DAO.PhimDAO;
import DAO.VeDAO;
import Entity.DichVu;
import Entity.Ghe;
import Entity.HDCT;
import Entity.HoaDon;
import Entity.KHTT;
import Entity.KhuyenMai;
import Entity.LichChieu;
import Entity.Phim;
import Entity.Ve;
import Utilities.Auth;
import com.GUI.component.seat;
import com.GUI.main.Main;
import com.GUI.swing.ScrollBar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class BanVe_Form extends javax.swing.JPanel {
    
    private LichChieuDAO lcDAO = new LichChieuDAO();
    private KhuyenMaiDAO kmDAO = new KhuyenMaiDAO();
    private HoaDonDAO hdDAO = new HoaDonDAO();
    private PhimDAO phDAO = new PhimDAO();
    public static String MaPhong;
    private String[] header = {
        "Mã vé/DV", "Giá tiền", "Số lượng", "Thành tiền", "Mã hóa đơn"
    };
    private DefaultTableModel model = new DefaultTableModel(header, 0);
    public BanVe_Form() {
        initComponents();
       // init();
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new com.GUI.swing.Table();
        btnThanhToan = new com.GUI.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        cboPhim = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        chkPhieuGG = new javax.swing.JCheckBox();
        cboPhieuGG = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        panelDichVu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnBap = new javax.swing.JSpinner();
        spnNuoc = new javax.swing.JSpinner();
        spnCombo1 = new javax.swing.JSpinner();
        spnCombo2 = new javax.swing.JSpinner();
        btnXuLy = new com.GUI.swing.Button();
        btnThemDichVu = new com.GUI.swing.Button();
        jLabel8 = new javax.swing.JLabel();
        cboPTThanhToan = new javax.swing.JComboBox<>();
        btnChuyen = new com.GUI.swing.Button();
        txtMaKHTT = new com.GUI.swing.TextField();
        cboPhongChieu = new javax.swing.JComboBox<>();
        lblCheckMa = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHoaDon.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        tblHoaDon.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblHoaDon.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tblHoaDon);

        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("HÓA ĐƠN CHI TIẾT");

        cboPhim.setBackground(new java.awt.Color(224, 224, 224));
        cboPhim.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        cboPhim.setForeground(new java.awt.Color(204, 204, 204));
        cboPhim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));
        cboPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhimActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("PHIM");

        chkPhieuGG.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chkPhieuGG.setForeground(new java.awt.Color(255, 51, 51));
        chkPhieuGG.setText("Thêm phiếu giảm giá");
        chkPhieuGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPhieuGGActionPerformed(evt);
            }
        });

        cboPhieuGG.setBackground(new java.awt.Color(224, 224, 224));
        cboPhieuGG.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        cboPhieuGG.setForeground(new java.awt.Color(51, 51, 51));
        cboPhieuGG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("PHIẾU GIẢM GIÁ");

        panelDichVu.setBackground(new java.awt.Color(224, 224, 224));

        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BẮP");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NƯỚC");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("COMBO 1");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("COMBO 2");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        spnBap.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        spnBap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));

        spnNuoc.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        spnNuoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));

        spnCombo1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        spnCombo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));

        spnCombo2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        spnCombo2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));

        javax.swing.GroupLayout panelDichVuLayout = new javax.swing.GroupLayout(panelDichVu);
        panelDichVu.setLayout(panelDichVuLayout);
        panelDichVuLayout.setHorizontalGroup(
            panelDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDichVuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnBap, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnNuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelDichVuLayout.setVerticalGroup(
            panelDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDichVuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnBap, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnXuLy.setForeground(new java.awt.Color(255, 255, 255));
        btnXuLy.setText("XỬ LÝ");
        btnXuLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuLyActionPerformed(evt);
            }
        });

        btnThemDichVu.setForeground(new java.awt.Color(255, 255, 255));
        btnThemDichVu.setText("THÊM DỊCH VỤ");
        btnThemDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDichVuActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("PHƯƠNG THỨC THANH TOÁN: ");

        cboPTThanhToan.setBackground(new java.awt.Color(224, 224, 224));
        cboPTThanhToan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        cboPTThanhToan.setForeground(new java.awt.Color(51, 51, 51));
        cboPTThanhToan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));

        btnChuyen.setForeground(new java.awt.Color(255, 255, 255));
        btnChuyen.setText(">");
        btnChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenActionPerformed(evt);
            }
        });

        cboPhongChieu.setBackground(new java.awt.Color(224, 224, 224));
        cboPhongChieu.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        cboPhongChieu.setForeground(new java.awt.Color(204, 204, 204));
        cboPhongChieu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));
        cboPhongChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongChieuActionPerformed(evt);
            }
        });

        lblCheckMa.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblCheckMa.setForeground(new java.awt.Color(51, 51, 51));
        lblCheckMa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCheckMa.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(cboPhieuGG, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPhieuGG)
                            .addComponent(cboPhongChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKHTT, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(btnChuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCheckMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(btnXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(panelDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnThemDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPTThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGap(31, 31, 31))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(232, 232, 232)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKHTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboPhongChieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCheckMa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkPhieuGG)
                            .addComponent(btnChuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPhieuGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPTThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDichVuActionPerformed
        // TODO add your handling code here:
     //   checkDichVu(true);
    }//GEN-LAST:event_btnThemDichVuActionPerformed

    private void chkPhieuGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPhieuGGActionPerformed
        // TODO add your handling code here:
//        if(checkPhieuGiamGia())
//            cboPhieuGG.setEnabled(true);
//        else
//            cboPhieuGG.setEnabled(false);
    }//GEN-LAST:event_chkPhieuGGActionPerformed

    private void btnXuLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuLyActionPerformed
        // TODO add your handling code here:
        //xuLyDuLieu();
    }//GEN-LAST:event_btnXuLyActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenActionPerformed
        // TODO add your handling code here      
        Main.main.showForm(Main.chonGhe);
    }//GEN-LAST:event_btnChuyenActionPerformed

    private void cboPhongChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongChieuActionPerformed

        String tmp = cboPhongChieu.getSelectedItem().toString().trim();
        MaPhong = tmp.substring(0, tmp.indexOf(" ")).trim();
    }//GEN-LAST:event_cboPhongChieuActionPerformed

    private void cboPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhimActionPerformed
        // TODO add your handling code here:
       // comboBoxPhongChieu();
    }//GEN-LAST:event_cboPhimActionPerformed

    // MAIN FUNCTIONAL
    
//    private void init()
//    {
//        loadDatabase();
//        txtMaKHTT.setLabelText("Mã KHTT");
//        tblHoaDon.setModel(model);
//        cboPhieuGG.setEnabled(false);
//        checkDichVu(false);
//        comboBoxPhim();
//        comboBoxPhieuGiamGia();
//        comboBoxThanhToan();
//    }
//    private void loadDatabase()
//    {
//        model.setRowCount(0);
//        try {
//            List<HoaDon> list = hdDAO.selectAll();
//            for(HoaDon hd : list) {
//                Object[] row = {
//                    hd.getMaHoaDon(),
//                    hd.getTongTien(),
//                    hd.getMaKM(),
//                    hd.getMaKHTT(),
//                    hd.getMucGiamGia(),
//                    hd.getThanhTien()
//                };
//                model.addRow(row);
//            }
//        } catch(Exception e) {
//            
//        }
//    }
//    private void XuLy()
//    {
//        
//    }
//    private void ThanhToan()
//    {
//        
//    }
//    private void xuLyDuLieu()
//    {
//        try {
//            HoaDon hd = getForm();
//            hdDAO.insert(hd);
//            loadDatabase();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//    private HoaDon getForm()
//    {
//        boolean checkMaKM = false, checkMaKHTT = false;
//        double soLuong = 0;
//        double mucGiamGiaKM = 0, mucGiamGiaKHTT = 0, giaGhe = 0;
//        String maKM = "";
//        //Entity
//        HoaDon hd = new HoaDon();
//        DichVu dv = new DichVu();
//        KHTT khtt = new KHTT();
//        Ghe gh = new Ghe();
//        Phim ph = new Phim();
//        //Vé Phim
//        //Phiếu giảm giá
//        KhuyenMai km = (KhuyenMai) cboPhieuGG.getSelectedItem();
//        List<KhuyenMai> listKM = kmDAO.selectByMaKM(km.getMaKM());
//        for(KhuyenMai kh : listKM) {
//            if(chkPhieuGG.isSelected() && cboPhieuGG.getSelectedItem().equals(kh.getMaKM())) {
//                mucGiamGiaKM = kh.getMucGiamGia();
//                maKM = kh.getMaKM();
//                checkMaKM = true;
//            }
//            else {
//                mucGiamGiaKM = 0;
//                maKM = null;
//                checkMaKM = false;
//            }
//        }
//        
//        hd.setMaKM(maKM);
//        hd.setMucGiamGia((int)mucGiamGiaKM);
//        //Phòng xem phim = Phòng && Chọn ghế = (Vị trí từ A-N 1-10)
//        //Thành tiền = (phí dịch vụ + vé xem phim) * ((100 - (mức giảm giá của KHTT + mức giảm giá của vé))/100)
//        //Tổng tiền = (phí dịch vụ + vé xem phim)
//        hd.setMaKHTT(txtMaKHTT.getText());
//        if(txtMaKHTT.getText().equals(khtt.getMAKHTT()) && !txtMaKHTT.getText().isEmpty()) {
//            mucGiamGiaKHTT = khtt.getMucGiacGia();
//            checkMaKHTT = true;
//        }
//        double mucGiamGia = 0;
//        if(checkMaKM && checkMaKHTT) {
//            mucGiamGia = mucGiamGiaKM + mucGiamGiaKHTT;
//        }
//        else if(checkMaKM && !checkMaKHTT) {
//            mucGiamGia = mucGiamGiaKM;
//        }
//        else if(!checkMaKM && checkMaKHTT) {
//            mucGiamGia = mucGiamGiaKHTT;
//        }
//        else {
//            mucGiamGia = 0;
//        }
//        //Giá dịch vụ = Tổng hoặc từng dịch vụ
//        int bap = (int) spnBap.getValue();
//        int nuoc = (int) spnNuoc.getValue();
//        int cb1 = (int) spnCombo1.getValue();
//        int cb2 = (int) spnCombo2.getValue();
//        double tongTienDV = 0;
//        if(bap >= 0 && nuoc >= 0 && cb1 >= 0 && cb2 >= 0) {
//            //Bắp = 25000, Nước = 25000, Combo1 = 50000, Combo2 = 75000
//            soLuong = (bap + nuoc + cb1 + cb2);
//            tongTienDV = ((25000*2) + 50000 + 75000);
//            dv.setGiaDichVu(tongTienDV);
//            if(bap > 1 || nuoc > 1 || cb1 > 1 || cb2 > 1) {
//                dv.setGiaDichVu(tongTienDV + (25000 | 25000 | 50000 | 75000));
//            }
//        }
//        else {
//            soLuong = bap | nuoc | cb1 | cb2;
//            tongTienDV = (25000 | 25000 | 50000 | 75000) * soLuong;
//            dv.setGiaDichVu(tongTienDV);
//        }
//        //Chọn ghế
//        for(Ghe ghe : ChonGhe_Form.listGheSelected) {
//            if(ghe.getMaGhe().equals(ChonGhe_Form.listGheSelected)) {
//                giaGhe = ghe.getGiaGhe();
//            }
//        }
//        //Thành tiền
//        double thanhTien = 0;
//        if(mucGiamGia != 0) {
//            thanhTien = (dv.getGiaDichVu() + giaGhe) * ((100 - mucGiamGia)/100);
//        }
//        else {
//            thanhTien = (dv.getGiaDichVu() + giaGhe);
//        }
//        hd.setTongTien(dv.getGiaDichVu() + giaGhe);
//        hd.setThanhTien(thanhTien);
//        java.util.Date date = new java.util.Date();
//        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
//        hd.setNgayLap(sqlDate);
//        hd.setMaNhanVien("NV1");
//        return hd;
//    }
//    //
//    private HDCT insertDichVu()
//    {
//        HDCT hdct = new HDCT();
//        DichVu dv = new DichVu();
//        String maDichVu = "";
//        int bap = (int) spnBap.getValue();
//        int nuoc = (int) spnNuoc.getValue();
//        int cb1 = (int) spnCombo1.getValue();
//        int cb2 = (int) spnCombo2.getValue();
//        int soLuong = 0;
//        double tongTienDV = 0;
//        if(bap >= 0 && nuoc >= 0 && cb1 >= 0 && cb2 >= 0) {
//            //Bắp = 25000, Nước = 25000, Combo1 = 50000, Combo2 = 75000
//            soLuong = (bap + nuoc + cb1 + cb2);
//            if(bap > 1 || nuoc > 1 || cb1 > 1 || cb2 > 1) {
//                dv.setGiaDichVu(tongTienDV + (25000 | 25000 | 50000 | 75000));
//            }
//        }
//        else {
//            soLuong = bap | nuoc | cb1 | cb2;
//            tongTienDV = (25000 | 25000 | 50000 | 75000) * soLuong;
//            dv.setGiaDichVu(tongTienDV);
//        }
//        String lch = (String) cboPhim.getSelectedItem();
//        String maPhim = lch.substring(0, lch.indexOf("-")).trim();
//        List<DichVu> listDV = vDAO.selectByMaPhim(maPhim);
//        for(DichVu dcv : listDV) {
//            maDichVu = dcv.getMave();
//        }
//        hdct.setMaDichVu(MaPhong);
//        hdct.setGiaTien(WIDTH);
//        hdct.setSoLuong(SOMEBITS);
//        hdct.setThanhTien(HEIGHT);
//        hdct.setMaHoaDon(MaPhong);
//        hdct.setHIDE(true);
//        return hdct;
//    }
//    private VeDAO vDAO = new VeDAO();
//    private HDCT insertMaVe()
//    {
//        HDCT hdct = new HDCT();
//        String maVe = "";
//        String lch = (String) cboPhim.getSelectedItem();
//        String maPhim = lch.substring(0, lch.indexOf("-")).trim();
//        List<Ve> listVe = vDAO.selectByMaPhim(maPhim);
//        for(Ve v : listVe) {
//            maVe = v.getMave();
//        }
//        hdct.setMaVe(maVe);
//        
//        hdct.setGiaTien(WIDTH);
//        hdct.setSoLuong(1);
//        hdct.setThanhTien(HEIGHT);
//        hdct.setMaHoaDon(MaPhong);
//        hdct.setHIDE(true);
//        return hdct;
//    }
//    
//    // SUB-FUNCTIONAL
//    private void comboBoxThanhToan()
//    {
//        cboPTThanhToan.addItem("Thanh toán bằng tiền mặt");
//        cboPTThanhToan.addItem("Thanh toán bằng thẻ tín dụng");
//        cboPTThanhToan.addItem("Thanh toán bằng MOMO");
//    }
//    private void comboBoxPhim()
//    {
//        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboPhim.getModel();
//        List<LichChieu> list = lcDAO.selectPhimTheoLichChieu();
//        
//        for(LichChieu lc : list) {
//            List<Phim> listPh = phDAO.selectPhimTheoLichChieu(lc.getMaPhim());
//            cboModel.addElement(lc.getMaPhim() + " - " + listPh.get(0).toString());
//        }
//    }
//    private void comboBoxPhongChieu()
//    {
//        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboPhongChieu.getModel();
//        cboModel.removeAllElements();
//        String lch = (String) cboPhim.getSelectedItem();
//        if(lch != null) {
//            List<LichChieu> list = lcDAO.selectPhongChieuTheoPhim(lch.substring(0, lch.indexOf("-")).trim());
//            for(LichChieu lc : list) {
//                cboModel.addElement(lc.getMaPhong());
//            }
//        }
//    }
//    private void comboBoxPhieuGiamGia()
//    {
//        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboPhieuGG.getModel();
//        List<String> list = kmDAO.listKhuyenMai();
//        for(String km : list)
//            cboModel.addElement(km);
//    }
//    private boolean checkPhieuGiamGia()
//    {
//        if(!chkPhieuGG.isSelected())
//            return false;
//        return true;
//    }
//    private void checkDichVu(boolean check) {
//        spnBap.setEnabled(check);
//        spnNuoc.setEnabled(check);
//        spnCombo1.setEnabled(check);
//        spnCombo2.setEnabled(check);
//    }
//    private void setStatus(boolean stt) {
//        
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.Button btnChuyen;
    private com.GUI.swing.Button btnThanhToan;
    private com.GUI.swing.Button btnThemDichVu;
    private com.GUI.swing.Button btnXuLy;
    private javax.swing.JComboBox<String> cboPTThanhToan;
    private javax.swing.JComboBox<String> cboPhieuGG;
    private javax.swing.JComboBox<String> cboPhim;
    private javax.swing.JComboBox<String> cboPhongChieu;
    private javax.swing.JCheckBox chkPhieuGG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCheckMa;
    private javax.swing.JPanel panelDichVu;
    private javax.swing.JSpinner spnBap;
    private javax.swing.JSpinner spnCombo1;
    private javax.swing.JSpinner spnCombo2;
    private javax.swing.JSpinner spnNuoc;
    private com.GUI.swing.Table tblHoaDon;
    private com.GUI.swing.TextField txtMaKHTT;
    // End of variables declaration//GEN-END:variables
}
