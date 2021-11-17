package com.GUI.form.ThongKe;

import com.GUI.Chart.BarChart.ModelChart;
import com.GUI.Chart.ChartLine.ModelChartLine;
import com.GUI.Chart.ChartPie.ModelChartPie;
import com.GUI.model.ModelCard;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class TKLuotXem_Form extends javax.swing.JPanel {

    public TKLuotXem_Form() {
        initComponents();
        setOpaque(false);
       
        barChart2.addLegend("lƯỢT XEM", new Color(245, 189,135));
        barChart2.addData(new ModelChart("MAPHIM 1", new double[]{200}));
        barChart2.addData(new ModelChart("MAPHIM 1", new double[]{250}));
        barChart2.addData(new ModelChart("MAPHIM 1", new double[]{300}));
        barChart2.addData(new ModelChart("MAPHIM 1", new double[]{200}));
        barChart2.addData(new ModelChart("MAPHIM 1", new double[]{150}));
        barChart2.addData(new ModelChart("MAPHIM 1", new double[]{160}));
        barChart2.addData(new ModelChart("MAPHIM 1", new double[]{80}));
        barChart2.addData(new ModelChart("MAPHIM 1", new double[]{70}));
        
        List<ModelChartLine> modelChartLines = new ArrayList<>();
        modelChartLines.add(new ModelChartLine("MAPHIM 1",200));
        modelChartLines.add(new ModelChartLine("MAPHIM 1",250));
        modelChartLines.add(new ModelChartLine("MAPHIM 1",300));
        modelChartLines.add(new ModelChartLine("MAPHIM 1",150));
        modelChartLines.add(new ModelChartLine("MAPHIM 1",160));
        modelChartLines.add(new ModelChartLine("MAPHIM 1",80));
        modelChartLines.add(new ModelChartLine("MAPHIM 1",70));
        chartLine1.setModel(modelChartLines);
        
        List<ModelChartPie>  modelChartPies = new ArrayList<>();
        modelChartPies.add(new ModelChartPie("KHTT", 200, new Color(245, 189,135)));
        modelChartPies.add(new ModelChartPie("Khách vãng lai", 200, new Color(135, 189,245)));
        modelChartPies.add(new ModelChartPie("Khác", 200, new Color(245, 189,135)));
        chartPie1.setModel(modelChartPies);
        
        
        card1.setData(new ModelCard("Value1", 255, 80, new ImageIcon("/com/GUI/icon/1.png")));
        card1.setColorGradient(Color.pink);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        barChart2 = new com.GUI.Chart.BarChart.BarChart();
        chartLine1 = new com.GUI.Chart.ChartLine.ChartLine();
        chartPie1 = new com.GUI.Chart.ChartPie.ChartPie();
        card1 = new com.GUI.component.Card();
        card2 = new com.GUI.component.Card();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("LƯỢNG VÉ BÁN");

        jComboBox1.setBackground(new java.awt.Color(224, 224, 224));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Trinh thám", "Hoạt hình" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CHỌN THÁNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chartLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chartLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barChart2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chartPie1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(card2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.Chart.BarChart.BarChart barChart2;
    private com.GUI.component.Card card1;
    private com.GUI.component.Card card2;
    private com.GUI.Chart.ChartLine.ChartLine chartLine1;
    private com.GUI.Chart.ChartPie.ChartPie chartPie1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
