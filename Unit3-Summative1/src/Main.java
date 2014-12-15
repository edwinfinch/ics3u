
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edwinfinch
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        marksList.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            itemDoubleClicked(list.locationToIndex(evt.getPoint()));
            clear(0);
            updateData();
        }
    }
    });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        enterLabel = new javax.swing.JLabel();
        marksInput = new javax.swing.JTextField();
        helpButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        marksList = new javax.swing.JList();
        marksLabel = new javax.swing.JLabel();
        statsLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        statsTextArea = new javax.swing.JTextArea();
        resetAllButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 36)); // NOI18N
        titleLabel.setText("Class Marks and Stats");

        enterLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        enterLabel.setText("Enter:");

        marksInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marksInputActionPerformed(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("Shree Devanagari 714", 1, 14)); // NOI18N
        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        marksList.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        marksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marksListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(marksList);

        marksLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        marksLabel.setText("Marks");

        statsLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        statsLabel.setText("Statistics");

        statsTextArea.setEditable(false);
        statsTextArea.setColumns(20);
        statsTextArea.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        statsTextArea.setRows(5);
        jScrollPane3.setViewportView(statsTextArea);

        resetAllButton.setFont(new java.awt.Font("Shree Devanagari 714", 1, 14)); // NOI18N
        resetAllButton.setText("Reset All Data");
        resetAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAllButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        jLabel1.setText("Created by Edwin Finch");

        jLabel2.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        jLabel2.setText("v. 1.0.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(marksLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statsLabel)
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marksInput))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))))
                        .addGap(12, 12, 12))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetAllButton)
                    .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(helpButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetAllButton))
                            .addComponent(titleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marksInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marksLabel)
                            .addComponent(statsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //In case of warning, error, or help message needed, this function can be called and a message
    //will appear accordingly
    private void popup(String errorText, int type){
         switch(type){
             case 0:
                JOptionPane.showMessageDialog(null, errorText, "Warning", JOptionPane.WARNING_MESSAGE);
                break;
             case 1:
                JOptionPane.showMessageDialog(null, errorText, "Error", JOptionPane.ERROR_MESSAGE);
                break;
             case 2:
                JOptionPane.showMessageDialog(null, errorText, "Help", JOptionPane.INFORMATION_MESSAGE);
                break;
         }
    }
    
    //Input and marks variables for storing data
    String inputText;
    ArrayList<Integer> marks = new ArrayList<>();
    
    //When an item is double clicked, the item location is passed into this when called
    //And it removes the items and refreshes the list
    void itemDoubleClicked(int item){
        marks.remove(item);
        insertNumbersIntoList();
    }
    
    //Gets the input text and adds some space cushion around it to prevent errors or early cut offs
    private void captureInputText(){
        inputText = " " + marksInput.getText() + " ";
    }
    
    //Removes invalid characters such as commas or double spaces
    private void removeInvalidCharacters(){
        if(inputText.contains(",")){
            inputText = inputText.replaceAll(",", " ");
        }
        if(inputText.contains("  ")){
            inputText = inputText.replaceAll("  ", " ");
        }
    }
    
    //Captures the numbers when the string is finally ready for processing after all of its pampering
    //Multiple numbers are supported in one sentence which is why we have a while loop
    private void captureNumbers(){
        String tempString;
        while(inputText != " " || inputText != ""){
            tempString = inputText.substring(inputText.indexOf(" ")+1);
            inputText = inputText.substring(inputText.indexOf(" ")+1);
            if(tempString.contains(" ")){
                tempString = tempString.substring(0, tempString.indexOf(" "));
            }
            if(tempString.length() < 2){
                break;
            }
            //System.out.println("Debug: Got number: " + tempString);
            try{
                marks.add(Integer.parseInt(tempString));
            }
            catch(Exception e){
                popup("Invalid input. Please make sure you are separating your input with spaces or commas.", 1);
            }
        }
    }
    
    //Sets (or refreshes) the data of the list panel to the data of the ArrayList
    private void insertNumbersIntoList(){
        marksList.setListData(marks.toArray());
    }
    
    //Adds a string to the stats text area and starts a new line.
    private void addToStats(String text){
        statsTextArea.append(text + "\n");
    }
    
    //Depending on the context, clears a certain amount of data/areas for different reasons such as the clear button being clicked
    private void clear(int toClear){
        switch(toClear){
            case 0:
                statsTextArea.setText("");
                break;
            case 1:
                clear(0);
                marks.removeAll(marks);
                insertNumbersIntoList();
                break;
        }
    }
    
    /*
     * Creates a new ClassData instance with the marks at the time, adds all of the stats required to the stats
     * box, from average to amount of people at a level
     */
    private void updateData(){
        ClassData data = new ClassData(marks);
        addToStats("Average: " + String.format("%.2f", data.getAverage()));
        addToStats("Highest Mark: " + data.getHighest());
        addToStats("Lowest Mark: " + data.getLowest());
        addToStats("Range: " + data.getRange());
        addToStats("Median: " + data.getMedian());
        for(int i = 0; i < 5; i++){
            addToStats("Amount at level " + i + ": " + data.getAmountOfLevel(i));
        }
    }
    
    //Cleans up the marks input textbox after input so the user doens't have to delete it themselves
    private void cleanup(){
        marksInput.setText("");
    }
    
    //When the help button is clicked, popup a help dialog
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        popup("Press enter to submit marks. Marks should be separated by commas or spaces. Double click an item to remove.", 2);
    }//GEN-LAST:event_helpButtonActionPerformed

    //When the enter key is hit on the main input box, run basically all of the functions above
    private void marksInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marksInputActionPerformed
        clear(0);
        captureInputText();
        removeInvalidCharacters();
        captureNumbers();
        marks.sort(null);
        insertNumbersIntoList();
        updateData();
        cleanup();
    }//GEN-LAST:event_marksInputActionPerformed

    //Clears all the data, text areas, etc.
    private void resetAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAllButtonActionPerformed
        clear(1);
    }//GEN-LAST:event_resetAllButtonActionPerformed

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
    private javax.swing.JLabel enterLabel;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField marksInput;
    private javax.swing.JLabel marksLabel;
    private javax.swing.JList marksList;
    private javax.swing.JButton resetAllButton;
    private javax.swing.JLabel statsLabel;
    private javax.swing.JTextArea statsTextArea;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
