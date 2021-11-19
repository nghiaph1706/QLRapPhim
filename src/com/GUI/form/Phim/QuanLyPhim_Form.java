package com.GUI.form.Phim;

import com.GUI.swing.ScrollBar;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import DAO.PhimDAO;
import DAO.TheLoaiDAO;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Entity.Phim;
import Entity.TheLoai;
import Utilities.MsgBox;
import Utilities.ValidateCheck;
import Utilities.XImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class QuanLyPhim_Form extends javax.swing.JPanel {
    
//    JFileChooser fileChooser = new JFileChooser();
    DefaultTableModel model;
    DefaultComboBoxModel cbomodelTheLoai = new DefaultComboBoxModel();
    TheLoaiDAO theLoaiDao = new TheLoaiDAO();
    private ValidateCheck vld = new ValidateCheck();
    PhimDAO phimDAO = new PhimDAO();
    
            
    public QuanLyPhim_Form() {
        initComponents();
        setOpaque(false);
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
//        Icon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/com/GUI/imagePhim/Inception.jpg")).getImage().getScaledInstance(lbHinh.getPreferredSize().width, lbHinh.getPreferredSize().height, Image.SCALE_SMOOTH));
//        lbHinh.setIcon(imageIcon);

        init();
    }
    
    public void init() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Mã phim", "Tên phim", "Ngày Khởi Chiếu", "Ngày Kết Thúc", "Thể Loại", "Định Dạng", "Quốc Gia"});
        tblPhim.setModel(model);
        jdNgaykc.setDateFormatString("yyyy-MM-dd");
        jdNgaykt.setDateFormatString("yyyy-MM-dd");
        fillcboTheLoai(); 
        fillTable();      
        try {
        } catch (Exception e) {
        }
    }

    public void fillcboTheLoai() {
       cboTheLoai.setModel(cbomodelTheLoai);
       cbomodelTheLoai.removeAllElements();
       List<TheLoai> list = theLoaiDao.selectAll();
       for (TheLoai theloai : list) {
           cbomodelTheLoai.addElement(theloai); // ko co du lieu dc do vao
       }
    }
    
    public void fillTableWithList(List<Phim> list) {
        model.setRowCount(0);
        for (Phim ph : list) {
//             String theLoai = theLoaiDao.selectById(ph.getMaTheLoai()).getTenTheLoai();
            model.addRow(new Object[]{ph.getMaPhim(), ph.getTenPhim(), ph.getNgayKhoiChieu(), ph.getNgayKetThuc(), ph.getMaTheLoai(), ph.getDinhDang(), ph.getQuocGia()});
        }
    }

    public void fillTable() {
        model.setRowCount(0);
        List<Phim> list = new ArrayList<>();
        list = phimDAO.selectAll();
        fillTableWithList(list);
    }
    
    public Phim getModel() {
        Phim ph = new Phim();
        ph.setMaPhim(txtMaPhim.getText());
        ph.setTenPhim(txtTenPhim.getText());
        ph.setNgayKhoiChieu(jdNgaykc.getDate());
        ph.setNgayKetThuc(jdNgaykt.getDate());
        ph.setMaTheLoai(((TheLoai) cboTheLoai.getSelectedItem()).getMaTheLoai());
        ph.setDinhDang(txtDinhDang.getText());
        ph.setHinh(lbHinh.getToolTipText());
        ph.setQuocGia(txtQuocGia.getText());
        return ph;
    }

    public void setModel(Phim ph) {
        txtMaPhim.setText(ph.getMaPhim());
        txtTenPhim.setText(ph.getTenPhim());
        jdNgaykc.setDate(ph.getNgayKhoiChieu());
        jdNgaykt.setDate(ph.getNgayKetThuc());
        cbomodelTheLoai.setSelectedItem(theLoaiDao.selectById(ph.getMaTheLoai()));
        txtDinhDang.setText(ph.getDinhDang());
        lbHinh.setToolTipText(ph.getHinh()); 
        txtQuocGia.setText(ph.getQuocGia());
    }
    
    public void them() {
        Phim ph = getModel();
        try {
            if (check(true)) {
                phimDAO.insert(ph);
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                fillTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
            e.printStackTrace();
        }
    }

    public void sua() {
        int index = tblPhim.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Vui dòng chọn phim cần sửa");
            return;
        } else {
            Phim ph = getModel();
            ph.setMaPhim(tblPhim.getValueAt(index, 0).toString());
            if (check(true)) {
                try {
                    phimDAO.update(ph);
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    fillTable();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Sửa thất bại");
                    e.printStackTrace();
                }
            }
        }

    }

    public void xoa() {
        int index = tblPhim.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Vui dòng chọn cần xóa");
            return;
        } else {
            if (MsgBox.confirm(this, "Bạn có muốn xóa phim này không ?")) {

                try {
                    phimDAO.delete(tblPhim.getValueAt(index, 0).toString());
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillTable();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");
                    e.printStackTrace();
                }

            }
        }
    }
    
    public boolean check(boolean x){
        if (x
                && vld.CheckString("Mã Phim", txtMaPhim.getText(), 50, false)
//                && Check(txtMaPhim.getText())
                && vld.CheckString("Tên Phim", txtTenPhim.getText(), 255, false)
                && vld.CheckNullDate("Ngày Khởi Chiếu", jdNgaykc.getDate())
                && vld.CheckNullDate("Ngày Kết Thúc", jdNgaykt.getDate())
                && vld.CheckAfterAndBefore("Ngày Khởi Chiếu", jdNgaykc.getDate(), "Ngày Kết Thúc", jdNgaykt.getDate())
                && vld.CheckString("Định Dạng", txtDinhDang.getText(), 50, false)
                && vld.CheckString("Quốc Gia", txtQuocGia.getText(), 50, false)) {
            return true;
        }
        if (x == false
                && vld.CheckString("Mã Phim", txtMaPhim.getText(), 50, false)
                && vld.CheckString("Tên Phim", txtTenPhim.getText(), 255, false)
                && vld.CheckNullDate("Ngày Khởi Chiếu", jdNgaykc.getDate())
                && vld.CheckNullDate("Ngày Kết Thúc", jdNgaykt.getDate())
                && vld.CheckAfterAndBefore("Ngày Khởi Chiếu", jdNgaykt.getDate(), "Ngày Kết Thúc", jdNgaykt.getDate())
                && vld.CheckString("Định Dạng", txtDinhDang.getText(), 50, false)
                && vld.CheckString("Quốc Gia", txtQuocGia.getText(), 50, false)) {
            return true;
        }
        return false;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhim = new com.GUI.swing.Table();
        txtMaPhim = new com.GUI.swing.TextField();
        txtTenPhim = new com.GUI.swing.TextField();
        txtQuocGia = new com.GUI.swing.TextField();
        txtDinhDang = new com.GUI.swing.TextField();
        cboTheLoai = new javax.swing.JComboBox<>();
        panelBorder1 = new com.GUI.swing.PanelBorder();
        lbHinh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInsert = new com.GUI.swing.Button();
        btnUpdate = new com.GUI.swing.Button();
        btnDelete = new com.GUI.swing.Button();
        jdNgaykt = new com.toedter.calendar.JDateChooser();
        jdNgaykc = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(159, 159, 159));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tblPhim.setBackground(new java.awt.Color(255, 51, 51));
        tblPhim.setForeground(new java.awt.Color(255, 51, 51));
        tblPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phim", "Tên phim", "Ngày khởi chiếu", "Ngày kết thúc", "Thể loại", "Tên định dạng", "Quốc gia"
            }
        ));
        tblPhim.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        tblPhim.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhimMouseClicked(evt);
            }
        });
        tblPhim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPhimKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhim);

        txtMaPhim.setBackground(new java.awt.Color(224, 224, 224));
        txtMaPhim.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtMaPhim.setLabelText("Mã phim");

        txtTenPhim.setBackground(new java.awt.Color(224, 224, 224));
        txtTenPhim.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtTenPhim.setLabelText("Tên phim");
        txtTenPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenPhimActionPerformed(evt);
            }
        });

        txtQuocGia.setBackground(new java.awt.Color(224, 224, 224));
        txtQuocGia.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtQuocGia.setLabelText("Quốc gia");

        txtDinhDang.setBackground(new java.awt.Color(224, 224, 224));
        txtDinhDang.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtDinhDang.setLabelText("Định dạng");

        cboTheLoai.setBackground(new java.awt.Color(224, 224, 224));
        cboTheLoai.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cboTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động - TL01", "Kinh dị", "Trinh thám", "Hoạt hình" }));
        cboTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTheLoaiActionPerformed(evt);
            }
        });

        panelBorder1.setBackground(new java.awt.Color(204, 204, 204));

        lbHinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbHinh.setFocusTraversalPolicyProvider(true);
        lbHinh.setMaximumSize(new java.awt.Dimension(394, 480));
        lbHinh.setMinimumSize(new java.awt.Dimension(394, 480));
        lbHinh.setPreferredSize(new java.awt.Dimension(414, 310));
        lbHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("QUẢN LÝ PHIM");

        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("THÊM");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("SỬA");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("XÓA");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jdNgaykt.setBackground(new java.awt.Color(224, 224, 224));
        jdNgaykt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jdNgaykc.setBackground(new java.awt.Color(224, 224, 224));
        jdNgaykc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jdNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtMaPhim, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                                    .addComponent(txtTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jdNgaykc, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                                                .addGap(95, 95, 95)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cboTheLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtDinhDang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(536, 536, 536)
                                        .addComponent(jLabel2)))
                                .addGap(102, 102, Short.MAX_VALUE)))
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jdNgaykc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDinhDang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void txtTenPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenPhimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenPhimActionPerformed

    private void cboTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTheLoaiActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        them();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        sua();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        xoa();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhimMouseClicked
        // TODO add your handling code here:
        int index = tblPhim.getSelectedRow();
        Phim ph = phimDAO.selectById(tblPhim.getValueAt(index, 0).toString());
        setModel(ph);
    }//GEN-LAST:event_tblPhimMouseClicked

    private void tblPhimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPhimKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblPhimKeyReleased

    private void lbHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHinhMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbHinhMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.swing.Button btnDelete;
    private com.GUI.swing.Button btnInsert;
    private com.GUI.swing.Button btnUpdate;
    private javax.swing.JComboBox<String> cboTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdNgaykc;
    private com.toedter.calendar.JDateChooser jdNgaykt;
    private javax.swing.JLabel lbHinh;
    private com.GUI.swing.PanelBorder panelBorder1;
    private com.GUI.swing.Table tblPhim;
    private com.GUI.swing.TextField txtDinhDang;
    private com.GUI.swing.TextField txtMaPhim;
    private com.GUI.swing.TextField txtQuocGia;
    private com.GUI.swing.TextField txtTenPhim;
    // End of variables declaration//GEN-END:variables

}
