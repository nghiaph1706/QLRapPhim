package com.GUI.form.Phim;

import com.GUI.swing.ScrollBar;
import DAO.PhimDAO;
import DAO.TheLoaiDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Entity.Phim;
import Entity.TheLoai;
import Utilities.MsgBox;
import Utilities.ValidateCheck;
import Utilities.XImage;
import com.GUI.main.Main;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class QuanLyPhim_Form extends javax.swing.JPanel {

//    JFileChooser fileChooser = new JFileChooser();
    DefaultTableModel model;
    DefaultComboBoxModel cbomodelTheLoai = new DefaultComboBoxModel();
    TheLoaiDAO theLoaiDao = new TheLoaiDAO();
    private ValidateCheck vld = new ValidateCheck();
    PhimDAO phimDAO = new PhimDAO();
    private XImage xImage = new XImage();
    public static boolean add_Phim = false;
    public static boolean xoa_Phim = false;
    public static boolean sua_Phim = false;
    public static String MaPHIM;

    public QuanLyPhim_Form() {
        initComponents();
        setOpaque(false);
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
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
        ph.setHinh(txtvideo.getText());
        ph.setQuocGia(txtQuocGia.getText());
	MaPHIM = ph.getMaNhanVien();
        return ph;
    }

    public void setModel(Phim ph) {
        txtMaPhim.setText(ph.getMaPhim());
        txtTenPhim.setText(ph.getTenPhim());
        jdNgaykc.setDate(ph.getNgayKhoiChieu());
        jdNgaykt.setDate(ph.getNgayKetThuc());
        cbomodelTheLoai.setSelectedItem(theLoaiDao.selectById(ph.getMaTheLoai()));
        txtDinhDang.setText(ph.getDinhDang());
        txtvideo.setText(ph.getHinh());
        video1.loadlink(ph.getHinh());
        txtQuocGia.setText(ph.getQuocGia());
    }

    public void them() {
        Phim ph = getModel();
        try {
            if (check(true)) {
                phimDAO.insert(ph);
                new MsgBox().showMess("Thêm thành công");
                fillTable();
		add_Phim = true;
            }
        } catch (Exception e) {
            new MsgBox().showMess("Thêm thất bại");
            e.printStackTrace();
        }
    }

    public void sua() {
        int index = tblPhim.getSelectedRow();
        if (index < 0) {
            new MsgBox().showMess("Vui dòng chọn phim cần sửa");
            return;
        } else {
            Phim ph = getModel();
            ph.setMaPhim(tblPhim.getValueAt(index, 0).toString());
            if (check(true)) {
                try {
                    phimDAO.update(ph);
                    new MsgBox().showMess("Sửa thành công");
                    fillTable();
		    sua_Phim = true;
		    MaPHIM = tblPhim.getValueAt(index, 0).toString();
                } catch (Exception e) {
                    new MsgBox().showMess("Sửa thất bại");
                    e.printStackTrace();
                }
            }
        }

    }

    public void xoa() {
        int index = tblPhim.getSelectedRow();
        if (index < 0) {
            new MsgBox().showMess("Vui dòng chọn cần xóa");
            return;
        } else {
            if (new MsgBox().showConfirm("Bạn có muốn xóa phim này không ?")) {

                try {
                    phimDAO.delete(tblPhim.getValueAt(index, 0).toString());
                    new MsgBox().showMess("Xóa thành công");
                    fillTable();
		    xoa_Phim = true;
		    MaPHIM = tblPhim.getValueAt(index, 0).toString();
                } catch (Exception e) {
                    new MsgBox().showMess("Xóa thất bại");
                    e.printStackTrace();
                }

            }
        }
    }

    public boolean check(boolean x) {
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
        jLabel2 = new javax.swing.JLabel();
        btnInsert = new com.GUI.swing.Button();
        btnUpdate = new com.GUI.swing.Button();
        btnDelete = new com.GUI.swing.Button();
        jdNgaykt = new com.toedter.calendar.JDateChooser();
        jdNgaykc = new com.toedter.calendar.JDateChooser();
        txtvideo = new com.GUI.swing.TextField();
        video1 = new com.GUI.form.Phim.video();

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
        jScrollPane1.setViewportView(tblPhim);

        txtMaPhim.setBackground(new java.awt.Color(224, 224, 224));
        txtMaPhim.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtMaPhim.setLabelText("Mã phim");

        txtTenPhim.setBackground(new java.awt.Color(224, 224, 224));
        txtTenPhim.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtTenPhim.setLabelText("Tên phim");

        txtQuocGia.setBackground(new java.awt.Color(224, 224, 224));
        txtQuocGia.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtQuocGia.setLabelText("Quốc gia");

        txtDinhDang.setBackground(new java.awt.Color(224, 224, 224));
        txtDinhDang.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtDinhDang.setLabelText("Định dạng");

        cboTheLoai.setBackground(new java.awt.Color(224, 224, 224));
        cboTheLoai.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cboTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động - TL01", "Kinh dị", "Trinh thám", "Hoạt hình" }));

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

        txtvideo.setBackground(new java.awt.Color(224, 224, 224));
        txtvideo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtvideo.setLabelText("VIDEO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaPhim, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                        .addComponent(txtTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdNgaykc, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                                    .addComponent(jdNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboTheLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDinhDang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(57, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(352, 352, 352))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(video1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jdNgaykc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDinhDang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(video1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        them();
	Main.saoLuu.logPhim();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        sua();
	Main.saoLuu.logPhim();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        xoa();
	Main.saoLuu.logPhim();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhimMouseClicked
        int index = tblPhim.getSelectedRow();
        Phim ph = phimDAO.selectById(tblPhim.getValueAt(index, 0).toString());
        setModel(ph);
    }//GEN-LAST:event_tblPhimMouseClicked

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
    private com.GUI.swing.Table tblPhim;
    private com.GUI.swing.TextField txtDinhDang;
    private com.GUI.swing.TextField txtMaPhim;
    private com.GUI.swing.TextField txtQuocGia;
    private com.GUI.swing.TextField txtTenPhim;
    private com.GUI.swing.TextField txtvideo;
    private com.GUI.form.Phim.video video1;
    // End of variables declaration//GEN-END:variables

}
