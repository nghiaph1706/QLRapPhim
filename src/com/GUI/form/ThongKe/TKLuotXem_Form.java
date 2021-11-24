package com.GUI.form.ThongKe;

import DAO.HoaDonDAO;
import DAO.ThongKeDAO;
import com.GUI.Chart.BarChart.BarChart;
import com.GUI.Chart.BarChart.ModelChart;
import com.GUI.Chart.ChartLine.ModelChartLine;
import com.GUI.Chart.ChartPie.ModelChartPie;
import com.GUI.model.ModelCard;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.lang.String;
import java.time.Year;
import javax.swing.DefaultComboBoxModel;

public class TKLuotXem_Form extends javax.swing.JPanel {

    ThongKeDAO tkDao = new ThongKeDAO();
    DefaultComboBoxModel cboModelThang = new DefaultComboBoxModel();
    DefaultComboBoxModel cboModelNam = new DefaultComboBoxModel();

    public TKLuotXem_Form() {
        initComponents();
        setOpaque(false);
        init();
        fillCboThang();
        fillCboNam();
        List<ModelChartPie> modelChartPies = new ArrayList<>();
        modelChartPies.add(new ModelChartPie("KHTT", 200, new Color(245, 189, 135)));
        modelChartPies.add(new ModelChartPie("Khách vãng lai", 200, new Color(135, 189, 245)));
        modelChartPies.add(new ModelChartPie("Khác", 200, new Color(245, 189, 135)));
        chartPie1.setModel(modelChartPies);

        
        card1.setData(new ModelCard("Value1", 255, 80, new ImageIcon("/com/GUI/icon/1.png")));
        card1.setColorGradient(Color.pink);
    }

    public void init() {
        try {
            thongkeluotxem();
        } catch (SQLException ex) {
            Logger.getLogger(TKLuotXem_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        thongKeTheoMP();
    }

    public void fillCboThang() {
        cboThang.setModel(cboModelThang);
        cboModelThang.removeAllElements();
        for (int i = 1; i <= 12; i++) {
            cboModelThang.addElement(String.valueOf(i));
        }
        
    }

    public void fillCboNam() {
        cboNam.setModel(cboModelNam);
        cboModelNam.removeAllElements();
        for (Integer nam : new HoaDonDAO().selectYear()) {
            cboModelNam.addElement(String.valueOf(nam));
        }
    }

    public void thongkeluotxem() throws SQLException {
        BarChart barchartTKNam = new BarChart();
        barchartTKNam.addLegend("LƯỢT XEM", new Color(245, 189, 135));
        String year = "";
        String month = "";
        try {
            year = cboModelNam.getSelectedItem().toString();
            month = cboModelThang.getSelectedItem().toString();
            System.out.println(month);
            System.out.println(year);
        } catch (Exception e) {
        }
        List<Object[]> list = tkDao.getTKLX(month, year);
        for (Object obj[] : list) {
            barchartTKNam.addData(new ModelChart(obj[1].toString(), new double[]{Double.parseDouble(obj[0].toString())})); // bi lsao
        }
        jpanelTKNam.removeAll();
        jpanelTKNam.add(barchartTKNam, BorderLayout.CENTER);
        jpanelTKNam.validate();
    }

    public void thongKeTheoMP() {
        try {
            List<ModelChartLine> modelChartLines = new ArrayList<>();
            String month = "";
            String year = "";
            try {
                year = cboModelNam.getSelectedItem().toString();
                month = cboModelThang.getSelectedItem().toString();
            } catch (Exception e) {
            }
            List<Object[]> list = tkDao.getTKLX(month, year);
            for (Object obj[] : list) {
                modelChartLines.add(new ModelChartLine(obj[1].toString(), Double.parseDouble(obj[0].toString())));
            }
            chartLine1.setModel(modelChartLines);
        } catch (SQLException ex) {
            Logger.getLogger(TKLuotXem_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        chartLine1 = new com.GUI.Chart.ChartLine.ChartLine();
        chartPie1 = new com.GUI.Chart.ChartPie.ChartPie();
        card1 = new com.GUI.component.Card();
        card2 = new com.GUI.component.Card();
        jLabel4 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jpanelTKNam = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("LƯỢNG VÉ BÁN");

        cboThang.setBackground(new java.awt.Color(224, 224, 224));
        cboThang.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Trinh thám", "Hoạt hình" }));
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CHỌN THÁNG");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CHỌN NĂM");

        cboNam.setBackground(new java.awt.Color(224, 224, 224));
        cboNam.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hành động", "Kinh dị", "Trinh thám", "Hoạt hình" }));
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        jpanelTKNam.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chartPie1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpanelTKNam, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chartLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(cboThang)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chartLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelTKNam, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chartPie1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(card2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        try {
            // TODO add your handling code here:
            thongkeluotxem();                          
        } catch (SQLException ex) {
            Logger.getLogger(TKLuotXem_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboThangActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        try {
            // TODO add your handling code here:
            thongkeluotxem();
        } catch (SQLException ex) {
            Logger.getLogger(TKLuotXem_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboNamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.GUI.component.Card card1;
    private com.GUI.component.Card card2;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private com.GUI.Chart.ChartLine.ChartLine chartLine1;
    private com.GUI.Chart.ChartPie.ChartPie chartPie1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jpanelTKNam;
    // End of variables declaration//GEN-END:variables
}
