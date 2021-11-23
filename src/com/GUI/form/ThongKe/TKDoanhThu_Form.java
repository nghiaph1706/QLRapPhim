package com.GUI.form.ThongKe;

import DAO.HoaDonDAO;
import DAO.ThongKeDAO;
import com.GUI.Chart.BarChart.BarChart;
import com.GUI.Chart.BarChart.ModelChart;
import com.GUI.Chart.ChartLine.ModelChartLine;
import com.GUI.Chart.ChartPie.ModelChartPie;
import com.GUI.swing.scrollbar.ScrollBarCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class TKDoanhThu_Form extends javax.swing.JPanel {

    ThongKeDAO tkDao = new ThongKeDAO();
    DefaultComboBoxModel cboModelNam = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelThang = new DefaultComboBoxModel();

    public TKDoanhThu_Form() {
        initComponents();
        setOpaque(false);
//        initText();
        fillCboNam();
        fillCboThang();
        init();
    }

    public void initText() {

        List<ModelChartLine> modelChartLines = new ArrayList<>();
        modelChartLines.add(new ModelChartLine("Quí 1", 800));
        modelChartLines.add(new ModelChartLine("Quí 1", 950));
        modelChartLines.add(new ModelChartLine("Quí 1", 700));
        modelChartLines.add(new ModelChartLine("Quí 1", 800));
        modelChartLines.add(new ModelChartLine("Quí 1", 800));
        modelChartLines.add(new ModelChartLine("Quí 1", 950));
        modelChartLines.add(new ModelChartLine("Quí 1", 700));
        modelChartLines.add(new ModelChartLine("Quí 1", 800));
        chartLine1.setModel(modelChartLines);

//        barChart2.addLegend("Doanh thu", new Color(245, 189, 135));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{200}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{250}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{300}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{200}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{150}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{160}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{80}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{70}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{300}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{320}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{360}));
//        barChart2.addData(new ModelChart("Tháng 1", new double[]{200}));
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());

//        List<ModelChartPie>  modelChartPies1 = new ArrayList<>();
//        modelChartPies1.add(new ModelChartPie("Dịch vụ", 200, new Color(245, 189,135)));
//        modelChartPies1.add(new ModelChartPie("Vé", 200, new Color(135, 189,245)));
//        modelChartPies1.add(new ModelChartPie("Dịch vụ", 200, new Color(245, 189,135)));
//        modelChartPies1.add(new ModelChartPie("Vé", 200, new Color(135, 189,245)));
//        chartPie2.setModel(modelChartPies1);
//        
//        List<ModelChartLine> modelChartLines1 = new ArrayList<>();
//        modelChartLines1.add(new ModelChartLine("Tuần 1",800));
//        modelChartLines1.add(new ModelChartLine("Tuần 1",950));
//        modelChartLines1.add(new ModelChartLine("Tuần 1",700));
//        modelChartLines1.add(new ModelChartLine("Tuần 1",800));
//        chartLine2.setModel(modelChartLines1);
    }

    public void init() {

        try {
            thongKeDTQuaTungNam();
        } catch (SQLException ex) {
            Logger.getLogger(TKDoanhThu_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        thongKeDTBieuDoTron();
        thongKeTheoQuy();

    }

    public void fillCboNam() {
        cboNam.setModel(cboModelNam);
        cboModelNam.removeAllElements();
        for (Integer nam : new HoaDonDAO().selectYear()) {
            cboModelNam.addElement(String.valueOf(nam));
        }
    }

    public void fillCboThang() {
        cboThang.setModel(cboModelThang);
        cboModelThang.removeAllElements();
        for (int i = 1; i <= 12; i++) {
            cboModelThang.addElement(String.valueOf(i));
        }
    }

    public void thongKeDTQuaTungNam() throws SQLException {
        barChart1.addLegend("Doanh thu", new Color(245, 189, 135));
        List<Object[]> list = tkDao.getDoanhThuNam();
        for (Object obj[] : list) {
            barChart1.addData(new ModelChart(obj[1].toString(), new double[]{Double.parseDouble(obj[0].toString())}));
        }
    }

    public void thongKeDTBieuDoTron() {
        List<ModelChartPie> modelChartPies = new ArrayList<>();
        String ten[] = {"Vé", "Dịch Vụ"};
        Double[] veVaDVArray = tkDao.getDoanhThuTheoVeVaDichvu();
        for (int i = 0; i < veVaDVArray.length; i++) {
            if (i > 0) {
                modelChartPies.add(new ModelChartPie(ten[i], veVaDVArray[i], new Color(135, 189, 245)));
            } else {
                modelChartPies.add(new ModelChartPie(ten[i], veVaDVArray[i], new Color(245, 189, 135)));
            }

        }
        chartPie1.setModel(modelChartPies);
    }

    public void thongKeDTChonNam() {
        BarChart barchartTKNam = new BarChart();
        String year = "";
        year = cboModelNam.getSelectedItem().toString();
        System.out.println(year);
        barchartTKNam.addLegend("Doanh thu", new Color(245, 189, 135));
        List<Object[]> list = tkDao.getDTTungThangTheoNam(year);
        for (Object obj[] : list) {
            barchartTKNam.addData(new ModelChart(obj[0].toString(), new double[]{Double.parseDouble(obj[1].toString())}));
        }

        jpanelTKNam.removeAll();
        jpanelTKNam.add(barchartTKNam, BorderLayout.CENTER);
        jpanelTKNam.validate();

    }

    public void thongKeTheoQuy() {
        try {
            List<ModelChartLine> modelChartLines = new ArrayList<>();
            List<Object[]> list = tkDao.getDoanhThuNam();
            for (Object obj[] : list) {
                modelChartLines.add(new ModelChartLine(obj[1].toString(), Double.parseDouble(obj[0].toString())));
            }
            chartLine1.setModel(modelChartLines);
        } catch (SQLException ex) {
            Logger.getLogger(TKDoanhThu_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        public void thongKeDTTungNgayTheoThang() {
        DefaultTableModel model = new DefaultTableModel();
        tblDTTungNgayTheoThang.setModel(model);
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"Ngày", "Tổng vé", "Tổng dịch vụ", "Tổng tiền ngày"});
        String year = "";
        String month = "";
        try {
            year = cboModelNam.getSelectedItem().toString();
            month = cboModelThang.getSelectedItem().toString();
        } catch (Exception e) {
        }
        List<Object[]> list = tkDao.getDTTungNgayTheoThang(year, month);

        for (Object[] a : list) {
            model.addRow(a);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barChart1 = new com.GUI.Chart.BarChart.BarChart();
        jLabel1 = new javax.swing.JLabel();
        chartPie1 = new com.GUI.Chart.ChartPie.ChartPie();
        chartLine1 = new com.GUI.Chart.ChartLine.ChartLine();
        jPanel2 = new javax.swing.JPanel();
        jpanelTKNam = new javax.swing.JPanel();
        cboNam = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDTTungNgayTheoThang = new com.GUI.swing.Table();
        jLabel3 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DOANH THU QUA TỪNG NĂM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chartPie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chartLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chartLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jpanelTKNam.setLayout(new java.awt.BorderLayout());

        cboNam.setBackground(new java.awt.Color(224, 224, 224));
        cboNam.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Trinh thám", "Hoạt hình" }));
        cboNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNamItemStateChanged(evt);
            }
        });
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CHỌN NĂM");

        tblDTTungNgayTheoThang.setModel(new javax.swing.table.DefaultTableModel(
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
                "Ngày", "Vé", "Dịch vụ", "Tổng ngày"
            }
        ));
        jScrollPane1.setViewportView(tblDTTungNgayTheoThang);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CHỌN THÁNG");

        cboThang.setBackground(new java.awt.Color(224, 224, 224));
        cboThang.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Trinh thám", "Hoạt hình" }));
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("Xuất báo báo");
        jButton2.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpanelTKNam, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboThang)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNam)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpanelTKNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        thongKeDTTungNgayTheoThang();
    }//GEN-LAST:event_cboThangActionPerformed

    private void cboNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNamItemStateChanged

    }//GEN-LAST:event_cboNamItemStateChanged

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        thongKeDTChonNam();
        thongKeDTTungNgayTheoThang();
    }//GEN-LAST:event_cboNamActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.Chart.BarChart.BarChart barChart1;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private com.GUI.Chart.ChartLine.ChartLine chartLine1;
    private com.GUI.Chart.ChartPie.ChartPie chartPie1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelTKNam;
    private com.GUI.swing.Table tblDTTungNgayTheoThang;
    // End of variables declaration//GEN-END:variables
}
