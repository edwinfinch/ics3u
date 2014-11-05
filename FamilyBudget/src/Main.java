
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        budgetPanel = new javax.swing.JPanel();
        budgetTitle = new javax.swing.JLabel();
        housingLabel = new javax.swing.JLabel();
        transLabel = new javax.swing.JLabel();
        lifeLabel = new javax.swing.JLabel();
        savingsLabel = new javax.swing.JLabel();
        housingInput = new javax.swing.JTextField();
        transInput = new javax.swing.JTextField();
        lifeInput = new javax.swing.JTextField();
        savingsInput = new javax.swing.JTextField();
        monthlyInLabel = new javax.swing.JLabel();
        monthlyInInput = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        monthlyPanel = new javax.swing.JPanel();
        monthlyTitle = new javax.swing.JLabel();
        housingBar = new javax.swing.JProgressBar();
        transBar = new javax.swing.JProgressBar();
        lifeBar = new javax.swing.JProgressBar();
        savingsBar = new javax.swing.JProgressBar();
        tooltipLabel = new javax.swing.JLabel();
        resultsPanel = new javax.swing.JPanel();
        resultsTitleLabel = new javax.swing.JLabel();
        housingOutput = new javax.swing.JLabel();
        transOutput = new javax.swing.JLabel();
        lifeOutput = new javax.swing.JLabel();
        savingsOutput = new javax.swing.JLabel();
        inDebtLabel = new javax.swing.JLabel();

        housingBar.setStringPainted(true);
        transBar.setStringPainted(true);
        lifeBar.setStringPainted(true);
        savingsBar.setStringPainted(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        budgetPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        budgetPanel.setForeground(new java.awt.Color(255, 255, 255));

        budgetTitle.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        budgetTitle.setText("Budget");

        housingLabel.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        housingLabel.setText("Housing");

        transLabel.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        transLabel.setText("Transportation");

        lifeLabel.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        lifeLabel.setText("Life");

        savingsLabel.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        savingsLabel.setText("Savings");

        monthlyInLabel.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        monthlyInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthlyInLabel.setText("Monthly Income");

        submitButton.setText("Submit!");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout budgetPanelLayout = new javax.swing.GroupLayout(budgetPanel);
        budgetPanel.setLayout(budgetPanelLayout);
        budgetPanelLayout.setHorizontalGroup(
            budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(budgetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(budgetPanelLayout.createSequentialGroup()
                        .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transLabel)
                            .addComponent(lifeLabel)
                            .addComponent(housingLabel)
                            .addComponent(savingsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savingsInput)
                            .addComponent(lifeInput)
                            .addComponent(transInput)
                            .addComponent(housingInput, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, budgetPanelLayout.createSequentialGroup()
                        .addGap(0, 160, Short.MAX_VALUE)
                        .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, budgetPanelLayout.createSequentialGroup()
                                .addComponent(budgetTitle)
                                .addGap(167, 167, 167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, budgetPanelLayout.createSequentialGroup()
                                .addComponent(submitButton)
                                .addGap(180, 180, 180))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, budgetPanelLayout.createSequentialGroup()
                        .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(monthlyInLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthlyInInput))
                        .addContainerGap())))
        );
        budgetPanelLayout.setVerticalGroup(
            budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(budgetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(budgetTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(housingLabel)
                    .addComponent(housingInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transLabel)
                    .addComponent(transInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lifeLabel)
                    .addComponent(lifeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(budgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savingsLabel)
                    .addComponent(savingsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monthlyInLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthlyInInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        monthlyPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        monthlyTitle.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        monthlyTitle.setText("Monthly Spending");

        tooltipLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tooltipLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tooltipLabel.setText("Progress bars are respective to their left column labels.");

        javax.swing.GroupLayout monthlyPanelLayout = new javax.swing.GroupLayout(monthlyPanel);
        monthlyPanel.setLayout(monthlyPanelLayout);
        monthlyPanelLayout.setHorizontalGroup(
            monthlyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monthlyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(monthlyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monthlyPanelLayout.createSequentialGroup()
                        .addComponent(monthlyTitle)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monthlyPanelLayout.createSequentialGroup()
                        .addComponent(tooltipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(monthlyPanelLayout.createSequentialGroup()
                .addGroup(monthlyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monthlyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lifeBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monthlyPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(housingBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(monthlyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(savingsBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(monthlyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        monthlyPanelLayout.setVerticalGroup(
            monthlyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthlyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthlyTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(housingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(transBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lifeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savingsBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tooltipLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        resultsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resultsTitleLabel.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        resultsTitleLabel.setText("Feedback");

        housingOutput.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        housingOutput.setText("None, yet.");

        transOutput.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        transOutput.setText(" ");

        lifeOutput.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        lifeOutput.setText(" ");

        savingsOutput.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        savingsOutput.setText(" ");

        inDebtLabel.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        inDebtLabel.setText(" ");

        javax.swing.GroupLayout resultsPanelLayout = new javax.swing.GroupLayout(resultsPanel);
        resultsPanel.setLayout(resultsPanelLayout);
        resultsPanelLayout.setHorizontalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultsTitleLabel)
                .addGap(398, 398, 398))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inDebtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(housingOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lifeOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savingsOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        resultsPanelLayout.setVerticalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(housingOutput)
                .addGap(18, 18, 18)
                .addComponent(transOutput)
                .addGap(18, 18, 18)
                .addComponent(lifeOutput)
                .addGap(18, 18, 18)
                .addComponent(savingsOutput)
                .addGap(18, 18, 18)
                .addComponent(inDebtLabel)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(budgetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(monthlyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(budgetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthlyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final int HOUSING_KEY = 0, TRANS_KEY = 1, LIFE_KEY = 2, SAVINGS_KEY = 3, INCOME_KEY = 4;
    
    private double[] budgetValues = {
        0, 1, 2, 3, 4
    };
    private int[] budgetPercents = {
        0, 1, 2, 3
    };
    
    private boolean inDebt = false, errorThrown = false;
    
    private void getBudgetValues(){
        try{
             budgetValues[HOUSING_KEY] = Double.parseDouble(housingInput.getText());
             budgetValues[TRANS_KEY] = Double.parseDouble(transInput.getText());
             budgetValues[LIFE_KEY] = Double.parseDouble(lifeInput.getText());
             budgetValues[SAVINGS_KEY] = Double.parseDouble(savingsInput.getText());
             budgetValues[INCOME_KEY] = Double.parseDouble(monthlyInInput.getText());
        }
        catch(NumberFormatException e){
            throwError("Make sure only numbers are being inputted. Decimals are supported!");
            return;
        }
    }

    private void throwError(String errorText){
        errorThrown = true;
        JOptionPane.showMessageDialog(null, errorText, "Error!", JOptionPane.ERROR_MESSAGE);
    }

    private boolean checkForSyntaxErrors(){
        if(budgetValues[INCOME_KEY] == 0){
            throwError("Your income must be above 0.");
            System.out.println("run!");
            return true;
        }
        for(int i = 0; i < 5; i++){
            if(budgetValues[i] < 0){
                throwError("You have a negative number inputted.");
                return true;
            }
        }
        return false;
    }
    
    private void getAndSetPercentages(){
        double total = 0;
        for(int i = 0; i < 4; i++){
            total += budgetValues[i];
        }
        if(total > budgetValues[INCOME_KEY]){
            inDebt = true;
        }
        for(int i = 0; i < 4; i++){
            double temp = budgetValues[i];
            double beforeCast = (temp/budgetValues[INCOME_KEY])*100;
            budgetPercents[i] = (int)beforeCast;
        }
        housingBar.setValue(budgetPercents[HOUSING_KEY]);
        transBar.setValue(budgetPercents[TRANS_KEY]);
        lifeBar.setValue(budgetPercents[LIFE_KEY]);
        savingsBar.setValue(budgetPercents[SAVINGS_KEY]);
        housingBar.setString(budgetPercents[HOUSING_KEY] + "%");
        transBar.setString(budgetPercents[TRANS_KEY] + "%");
        lifeBar.setString(budgetPercents[LIFE_KEY] + "%");
        savingsBar.setString(budgetPercents[SAVINGS_KEY] + "%");
    }
    
    private void setTips(){
        if(inDebt){
            inDebtLabel.setText("You are in debt! -.-");
        }
        else{
            inDebtLabel.setText("You are not in debt :)");
        }
        
        if(budgetPercents[HOUSING_KEY] > 35){
            housingOutput.setText("You are spending too much on housing.");
        }
        else{
            housingOutput.setText("You are spending a good amount on housing!");
        }
        
        if(budgetPercents[TRANS_KEY] > 15){
            transOutput.setText("You are spending too much on transportation.");
        }
        else{
            transOutput.setText("You're getting around for a good price! (transportation)");
        }
        
        if(budgetPercents[LIFE_KEY] > 25){
            lifeOutput.setText("You are spending too much on life (groceries, entertainment and stuff).");
        }
        else{
            lifeOutput.setText("You're spending a fine amount for life, no worries here!");
        }
        
        if(budgetPercents[SAVINGS_KEY] < 10){
            savingsOutput.setText("You're not putting enough into savings! Get it to over 10% of your income.");
        }
        else{
            savingsOutput.setText("You're throwing enough money in that piggy bank :)");
        }
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        getBudgetValues();
        if(checkForSyntaxErrors()){
            return;
        }
        getAndSetPercentages();
        setTips();
    }

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
    private javax.swing.JPanel budgetPanel;
    private javax.swing.JLabel budgetTitle;
    private javax.swing.JProgressBar housingBar;
    private javax.swing.JTextField housingInput;
    private javax.swing.JLabel housingLabel;
    private javax.swing.JLabel housingOutput;
    private javax.swing.JLabel inDebtLabel;
    private javax.swing.JProgressBar lifeBar;
    private javax.swing.JTextField lifeInput;
    private javax.swing.JLabel lifeLabel;
    private javax.swing.JLabel lifeOutput;
    private javax.swing.JTextField monthlyInInput;
    private javax.swing.JLabel monthlyInLabel;
    private javax.swing.JPanel monthlyPanel;
    private javax.swing.JLabel monthlyTitle;
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JLabel resultsTitleLabel;
    private javax.swing.JProgressBar savingsBar;
    private javax.swing.JTextField savingsInput;
    private javax.swing.JLabel savingsLabel;
    private javax.swing.JLabel savingsOutput;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel tooltipLabel;
    private javax.swing.JProgressBar transBar;
    private javax.swing.JTextField transInput;
    private javax.swing.JLabel transLabel;
    private javax.swing.JLabel transOutput;
    // End of variables declaration//GEN-END:variables
}
