package com.GUI.form.ThongKe;

import com.GUI.Chart.BarChart.ModelChart;
import com.GUI.Chart.ChartLine.ModelChartLine;
import com.GUI.Chart.ChartPie.ModelChartPie;
import com.GUI.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

public class TKDoanhThu_Form extends javax.swing.JPanel {

    public TKDoanhThu_Form() {
        initComponents();
        setOpaque(false);
        initText();
    }
    public void initText(){
        barChart1.addLegend("Doanh thu", new Color(245, 189,135));
        barChart1.addData(new ModelChart("Năm 1", new double[]{200}));
        barChart1.addData(new ModelChart("Năm 1", new double[]{250}));
        barChart1.addData(new ModelChart("Năm 1", new double[]{300}));
        barChart1.addData(new ModelChart("Năm 1", new double[]{200}));
        barChart1.addData(new ModelChart("Năm 1", new double[]{150}));
        
        List<ModelChartPie>  modelChartPies = new ArrayList<>();
        modelChartPies.add(new ModelChartPie("Dịch vụ", 200, new Color(245, 189,135)));
        modelChartPies.add(new ModelChartPie("Vé", 200, new Color(135, 189,245)));
        modelChartPies.add(new ModelChartPie("Dịch vụ", 200, new Color(245, 189,135)));
        modelChartPies.add(new ModelChartPie("Vé", 200, new Color(135, 189,245)));
        chartPie1.setModel(modelChartPies);
        
        
        List<ModelChartLine> modelChartLines = new ArrayList<>();
        modelChartLines.add(new ModelChartLine("Quí 1",800));
        modelChartLines.add(new ModelChartLine("Quí 1",950));
        modelChartLines.add(new ModelChartLine("Quí 1",700));
        modelChartLines.add(new ModelChartLine("Quí 1",800));
        modelChartLines.add(new ModelChartLine("Quí 1",800));
        modelChartLines.add(new ModelChartLine("Quí 1",950));
        modelChartLines.add(new ModelChartLine("Quí 1",700));
        modelChartLines.add(new ModelChartLine("Quí 1",800));
        chartLine1.setModel(modelChartLines);
        
        barChart2.addLegend("Doanh thu", new Color(245, 189,135));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{200}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{250}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{300}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{200}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{150}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{160}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{80}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{70}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{300}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{320}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{360}));
        barChart2.addData(new ModelChart("Tháng 1", new double[]{200}));
        
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barChart1 = new com.GUI.Chart.BarChart.BarChart();
        jLabel1 = new javax.swing.JLabel();
        chartPie1 = new com.GUI.Chart.ChartPie.ChartPie();
        chartLine1 = new com.GUI.Chart.ChartLine.ChartLine();
        jPanel2 = new javax.swing.JPanel();
        barChart2 = new com.GUI.Chart.BarChart.BarChart();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.GUI.swing.Table();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CHỌN NĂM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CHỌN THÁNG");

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("Xuất báo báo");
        jButton2.setBorder(null);

        jComboBox1.setBackground(new java.awt.Color(224, 224, 224));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Trinh thám", "Hoạt hình" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox4.setBackground(new java.awt.Color(224, 224, 224));
        jComboBox4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Trinh thám", "Hoạt hình" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4))
                        .addGap(19, 19, 19)
                        .addComponent(barChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.Chart.BarChart.BarChart barChart1;
    private com.GUI.Chart.BarChart.BarChart barChart2;
    private com.GUI.Chart.ChartLine.ChartLine chartLine1;
    private com.GUI.Chart.ChartPie.ChartPie chartPie1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.GUI.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
