/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edfin9913
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        burgers_label = new javax.swing.JLabel();
        fries_label = new javax.swing.JLabel();
        purpaldrank_label = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        price_subtitle = new javax.swing.JLabel();
        before_taxes = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        burgers_spinner = new javax.swing.JSpinner();
        fries_spinner = new javax.swing.JSpinner();
        purpaldrank_spinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fast Food Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 800));

        burgers_label.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        burgers_label.setText("Burgers");

        fries_label.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fries_label.setText("Fries");

        purpaldrank_label.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        purpaldrank_label.setText("Soft Drinks");

        title.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        title.setText("Fast Food Calculator");

        price_subtitle.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        price_subtitle.setText("Price:");

        before_taxes.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        before_taxes.setText("Before taxes: null");

        tax.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        tax.setText("Tax: null");

        total.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        total.setText("Total: null");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        burgers_spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                burgers_spinnerStateChanged(evt);
            }
        });

        fries_spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fries_spinnerStateChanged(evt);
            }
        });

        purpaldrank_spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                purpaldrank_spinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(price_subtitle)
                            .addComponent(before_taxes)
                            .addComponent(tax)
                            .addComponent(total)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(burgers_label)
                                            .addComponent(fries_label))
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(purpaldrank_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fries_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(burgers_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purpaldrank_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(burgers_label)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(burgers_spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fries_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fries_spinner))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purpaldrank_label)
                    .addComponent(purpaldrank_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(price_subtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(before_taxes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(exit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public int burgers, fries, purpledrank;
    public final double[] prices = {
        2.49, 1.89, 0.99,
    };
    // $2.49 for burgers, $1.89 for fries, and $0.99 for soft drinks.
    public void refresh(){
        double before_t;
        before_t = prices[0]*burgers + prices[1]*fries + prices[2]*purpledrank;
        double tax_t = before_t*0.13;
        double total_f = tax_t+before_t;
        
        tax_t = Math.round(tax_t*100)/100.0;
        total_f = Math.round(total_f*100)/100.0;
        before_t = Math.round(before_t*100)/100.0;
        
        before_taxes.setText("Before taxes: $" + before_t);
        tax.setText("Tax: $" + tax_t);
        total.setText("Total: $" + total_f);
    }
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        burgers_spinner.setValue((Integer)0);
        fries_spinner.setValue((Integer)0);
        purpaldrank_spinner.setValue((Integer)0);
        burgers = 0;
        fries = 0;
        purpledrank = 0;
        
        refresh();
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void burgers_spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_burgers_spinnerStateChanged
        burgers = (Integer)burgers_spinner.getValue();
        refresh();
    }//GEN-LAST:event_burgers_spinnerStateChanged

    private void fries_spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fries_spinnerStateChanged
        fries = (Integer)fries_spinner.getValue();
        refresh();
    }//GEN-LAST:event_fries_spinnerStateChanged

    private void purpaldrank_spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_purpaldrank_spinnerStateChanged
        purpledrank = (Integer)purpaldrank_spinner.getValue();
        refresh();
    }//GEN-LAST:event_purpaldrank_spinnerStateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel before_taxes;
    private javax.swing.JLabel burgers_label;
    private javax.swing.JSpinner burgers_spinner;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fries_label;
    private javax.swing.JSpinner fries_spinner;
    private javax.swing.JLabel price_subtitle;
    private javax.swing.JLabel purpaldrank_label;
    private javax.swing.JSpinner purpaldrank_spinner;
    private javax.swing.JButton reset;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel title;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
