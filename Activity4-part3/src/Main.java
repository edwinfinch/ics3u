
import java.util.Random;

public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        num_1_spin = new javax.swing.JSpinner();
        num_2_spin = new javax.swing.JSpinner();
        num_2_label = new javax.swing.JLabel();
        num_1_label = new javax.swing.JLabel();
        num_label = new javax.swing.JLabel();
        rand_num_label = new javax.swing.JLabel();
        catfact_label = new javax.swing.JLabel();
        final_catfact_label = new javax.swing.JLabel();
        realtime_button = new javax.swing.JToggleButton();
        realtime_label = new javax.swing.JLabel();
        manual_refresh = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        Aboot = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("Random Number Generator + Cat Facts");

        num_1_spin.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        num_1_spin.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, Integer.valueOf(999), Integer.valueOf(1)));
        num_1_spin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                num_1_spinStateChanged(evt);
            }
        });

        num_2_spin.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        num_2_spin.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), null, Integer.valueOf(999), Integer.valueOf(1)));
        num_2_spin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                num_2_spinStateChanged(evt);
            }
        });

        num_2_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num_2_label.setText("Number 2");

        num_1_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num_1_label.setText("Number 1");

        num_label.setText("Number:");

        rand_num_label.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        rand_num_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rand_num_label.setText("null");

        catfact_label.setText("Cat fact:");

        final_catfact_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        final_catfact_label.setText("Dogs are better.");
        final_catfact_label.setAutoscrolls(true);

        realtime_button.setText("False");
        realtime_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realtime_buttonActionPerformed(evt);
            }
        });

        realtime_label.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        realtime_label.setText("Update in real time:");

        manual_refresh.setText("Refresh");
        manual_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manual_refreshActionPerformed(evt);
            }
        });

        Aboot.setText("Aboot & Stuff");
        Aboot.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AbootStateChanged(evt);
            }
        });
        Aboot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbootActionPerformed(evt);
            }
        });
        menu.add(Aboot);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(final_catfact_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(title)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(catfact_label)
                                        .addGap(80, 80, 80))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(num_1_spin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num_1_label, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(num_label)
                                                .addGap(80, 80, 80))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(rand_num_label, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(num_2_spin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num_2_label, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manual_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(realtime_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(realtime_button)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num_1_spin)
                            .addComponent(num_2_spin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num_2_label)
                            .addComponent(num_1_label)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(num_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rand_num_label, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(catfact_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(final_catfact_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realtime_button)
                    .addComponent(realtime_label)
                    .addComponent(manual_refresh))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean realtime_selected = false;
    public int num_1, num_2;
    
    //Cat facts taken and edited from Buzzfeed
    public final String[] cat_facts = {
        "Cats are the most popular pet in the United States.",
        "There are cats who have survived falls from over 32 stories",
        "A group of cats is called a clowder",
        "Cats have over 20 muscles that control their ears",
        "Cats sleep 70% of their lives.",
        "A cat has been mayor of Talkeetna, Alaska, for 15 years.",
        "When cats grimace, they are usually “taste-scenting.”",
        "Cats can’t taste sweetness",
        "Owning a cat can reduce the risk of stroke and heart attack by a third",
        "Wikipedia has a recording of a cat meowing because why not?",
        "The world’s largest cat measured 48.5 inches long.",
        "Domesticated cats have been around since 3600 B.C.,",
        "A cat’s purr may be a form of self-healing.",
        "Frequency of a domestic cat’s purr repairs bones & stuff.",
        "Adult cats only meow to communicate with humans",
    };
    
    public void refresh(){
        int rand = random(num_1, num_2);
        rand_num_label.setText("" + rand);
        
        int catfact = random(0, 14);
        final_catfact_label.setText("" + cat_facts[catfact]);
    }
    
    public int random(int num_1, int num_2) {
        Random rand = new Random();
        int max, min;
        if(num_1 > num_2){
            max = num_1;
            min = num_2;
        }
        else{
            max = num_2;
            min = num_1;
        }
        int num = rand.nextInt((max-min)+1)+min;
        return num;
    }
    
    private void AbootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbootActionPerformed
        //unused and for some dumb reason I can't remove this
    }//GEN-LAST:event_AbootActionPerformed

    private void AbootStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AbootStateChanged
        AbootWindow aboot = new AbootWindow();
        aboot.main(null);
    }//GEN-LAST:event_AbootStateChanged

    private void realtime_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realtime_buttonActionPerformed
        realtime_selected = realtime_button.isSelected();
        manual_refresh.setVisible(!realtime_selected);
        if(realtime_selected){
            realtime_button.setText("True");
        }
        else{
            realtime_button.setText("False"); 
        }
    }//GEN-LAST:event_realtime_buttonActionPerformed

    private void num_1_spinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_num_1_spinStateChanged
        num_1 = (Integer)num_1_spin.getValue();
        if(realtime_selected){
            refresh();
        }
    }//GEN-LAST:event_num_1_spinStateChanged

    private void num_2_spinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_num_2_spinStateChanged
        num_2 = (Integer)num_2_spin.getValue();
        if(realtime_selected){
            refresh();
        }
    }//GEN-LAST:event_num_2_spinStateChanged

    private void manual_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manual_refreshActionPerformed
        refresh();
    }//GEN-LAST:event_manual_refreshActionPerformed

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
    private javax.swing.JMenu Aboot;
    private javax.swing.JLabel catfact_label;
    private javax.swing.JLabel final_catfact_label;
    private javax.swing.JButton manual_refresh;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel num_1_label;
    private javax.swing.JSpinner num_1_spin;
    private javax.swing.JLabel num_2_label;
    private javax.swing.JSpinner num_2_spin;
    private javax.swing.JLabel num_label;
    private javax.swing.JLabel rand_num_label;
    private javax.swing.JToggleButton realtime_button;
    private javax.swing.JLabel realtime_label;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
