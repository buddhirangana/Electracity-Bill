package electracitybill;

import javax.swing.ImageIcon;

public class ElectracityBillJFrame extends javax.swing.JFrame {

    public ElectracityBillJFrame() {
        initComponents();
        setTitle("Electracity Billing System");
        setIconImage(new ImageIcon(getClass().getResource("MSMessenger.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_lbl = new javax.swing.JLabel();
        tmu_lbl = new javax.swing.JLabel();
        tmu_txt = new javax.swing.JTextField();
        lmu_lbl = new javax.swing.JLabel();
        lmu_txt = new javax.swing.JTextField();
        units_lbl = new javax.swing.JLabel();
        units_txt = new javax.swing.JLabel();
        amount_lbl = new javax.swing.JLabel();
        amounts_txt = new javax.swing.JLabel();
        amount_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 150, 150));
        setResizable(false);

        title_lbl.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        title_lbl.setText("Electracity Bill");

        tmu_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tmu_lbl.setText("This Month Units");

        lmu_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lmu_lbl.setText("Last Month Units");

        units_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        units_lbl.setText("Used Units : ");

        units_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        amount_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amount_lbl.setText("Bill Amount : ");

        amounts_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        amount_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amount_btn.setText("Amount");
        amount_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(amount_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tmu_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tmu_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lmu_lbl)
                                .addGap(20, 20, 20)
                                .addComponent(lmu_txt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(units_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(units_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(amount_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amounts_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmu_lbl)
                    .addComponent(tmu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lmu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lmu_lbl))
                .addGap(18, 18, 18)
                .addComponent(amount_btn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(units_lbl)
                    .addComponent(units_txt))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount_lbl)
                    .addComponent(amounts_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amount_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_btnActionPerformed
        String tmu = tmu_txt.getText();
        String lmu = lmu_txt.getText();
        int tm1 = Integer.parseInt(tmu);
        int lm1 = Integer.parseInt(lmu);

        int unit = tm1 - lm1;
        int amount;
        if (unit <= 100) {
            amount = unit * 5;
        } else {
            amount = (100 * 5) + (unit - 100) * 8;
        }
        units_txt.setText(""+unit);
        amounts_txt.setText("LKR " + amount + ".00");

    }//GEN-LAST:event_amount_btnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElectracityBillJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectracityBillJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectracityBillJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectracityBillJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ElectracityBillJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amount_btn;
    private javax.swing.JLabel amount_lbl;
    private javax.swing.JLabel amounts_txt;
    private javax.swing.JLabel lmu_lbl;
    private javax.swing.JTextField lmu_txt;
    private javax.swing.JLabel title_lbl;
    private javax.swing.JLabel tmu_lbl;
    private javax.swing.JTextField tmu_txt;
    private javax.swing.JLabel units_lbl;
    private javax.swing.JLabel units_txt;
    // End of variables declaration//GEN-END:variables
}
