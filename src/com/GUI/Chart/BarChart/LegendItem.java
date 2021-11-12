
<<<<<<< HEAD
package com.GUI.Chart.BarChart;
=======
package GUI.Chart.BarChart;
>>>>>>> origin/duytrinoigiong

public class LegendItem extends javax.swing.JPanel {

    public LegendItem(ModelLegend data) {
        initComponents();
        setOpaque(false);
<<<<<<< HEAD
        labelColor1.setBackground(data.getColor());
=======
        lbColor.setBackground(data.getColor());
>>>>>>> origin/duytrinoigiong
        lblName.setText(data.getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
<<<<<<< HEAD
        labelColor1 = new com.GUI.Chart.BarChart.LabelColor();
=======
        lbColor = new GUI.Chart.BarChart.LabelColor();
>>>>>>> origin/duytrinoigiong

        lblName.setForeground(new java.awt.Color(100, 100, 100));
        lblName.setText("Name");

<<<<<<< HEAD
        labelColor1.setText("labelColor1");
=======
        lbColor.setBackground(new java.awt.Color(102, 102, 255));
        lbColor.setText("labelColor1");
>>>>>>> origin/duytrinoigiong

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(1, 1, 1)
                .addComponent(labelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName)
                .addGap(0, 31, Short.MAX_VALUE))
=======
                .addComponent(lbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName)
                .addGap(0, 0, Short.MAX_VALUE))
>>>>>>> origin/duytrinoigiong
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                .addComponent(lblName)
                .addComponent(labelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                .addComponent(lbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblName))
>>>>>>> origin/duytrinoigiong
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private com.GUI.Chart.BarChart.LabelColor labelColor1;
=======
    private GUI.Chart.BarChart.LabelColor lbColor;
>>>>>>> origin/duytrinoigiong
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
