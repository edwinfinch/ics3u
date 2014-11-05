public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameInput = new javax.swing.JTextPane();
        systemInput = new javax.swing.JTextField();
        heightInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        systemLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        hintMeasure = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        titleLabel.setText("Ideal Weight Calculator");

        jScrollPane1.setViewportView(nameInput);

        systemInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                systemInputCaretUpdate(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        nameLabel.setText("Name");

        systemLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        systemLabel.setText("System of Measure");

        heightLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        heightLabel.setText("Height");

        hintMeasure.setText("?");
        hintMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintMeasureActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(systemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hintMeasure)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(heightInput))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(systemInput))))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hintMeasure)
                    .addComponent(systemInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(outputLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int NAME_KEY = 0, SYSTEM_KEY = 1, HEIGHT_KEY = 2;
    String[] textInputs = {
        "Edwin", "M"
    };
    String[] weightTypes = {
        "lbs", "kgs"
    };
    int heightInputInt = 0;
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        boolean error = false;
        int metric = 0;
        textInputs[NAME_KEY] = nameInput.getText();
        textInputs[SYSTEM_KEY] = systemInput.getText();
        switch (textInputs[SYSTEM_KEY]) {
            case "I":
            case "i":
                metric = 0;
                break;
            case "M":
            case "m":
                metric = 1;
                break;
            default:
                outputLabel.setText("Error: invalid input in system!");
                error = true;
                break;
        }
        try{
             heightInputInt = Integer.parseInt(heightInput.getText());
        }
        catch(NumberFormatException e){
            outputLabel.setText("Error: invalid input in height!");
            error = true;
        }
        
        double weightResult = 0.00;
        if(metric == 1){
            weightResult = heightInputInt*heightInputInt*25;
        }
        else{
            weightResult = heightInputInt*heightInputInt*25/703;
        }
        
        if(!error){
            outputLabel.setText(textInputs[NAME_KEY] + "'s ideal weight is " + weightResult + " " + weightTypes[metric]);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void hintMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintMeasureActionPerformed
        outputLabel.setText("Set unit. (M)eters or (i)nches.");
    }//GEN-LAST:event_hintMeasureActionPerformed

    private void systemInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_systemInputCaretUpdate
        switch(systemInput.getText()) {
            case "I":
            case "i":
                heightLabel.setText("Height: inches");
                break;
            case "M":
            case "m":
                heightLabel.setText("Height: meters");
                break;
            default:
                heightLabel.setText("Height: invalid input");
                break;
        }
    }//GEN-LAST:event_systemInputCaretUpdate

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField heightInput;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JButton hintMeasure;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField systemInput;
    private javax.swing.JLabel systemLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
