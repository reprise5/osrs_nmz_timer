
package nmztimer;

import java.util.TimerTask;
import java.util.Timer;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author reprise
 */
public class timer extends javax.swing.JFrame {
  
    public timer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tassetsCB3 = new javax.swing.JCheckBox();
        potionTypeTabbedPane = new javax.swing.JTabbedPane();
        PrayerPotionPanel = new javax.swing.JPanel();
        dosageCombobox = new javax.swing.JComboBox();
        GObutton = new javax.swing.JButton();
        RESETbutton = new javax.swing.JButton();
        ProgressLabel = new javax.swing.JLabel();
        timeProgressBar = new javax.swing.JProgressBar();
        screen = new javax.swing.JTextField();
        lvlComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mageLabel = new javax.swing.JLabel();
        missilesLabel = new javax.swing.JLabel();
        meleeLabel = new javax.swing.JLabel();
        nothingPanel = new javax.swing.JPanel();
        BonusLabel = new javax.swing.JLabel();
        MitreCB = new javax.swing.JCheckBox();
        BonusScreen = new javax.swing.JTextField();
        ardyCloakCB = new javax.swing.JCheckBox();
        stoleCB = new javax.swing.JCheckBox();
        crozierCB = new javax.swing.JCheckBox();
        offhandCB = new javax.swing.JCheckBox();
        hauberkCB = new javax.swing.JCheckBox();
        tassetsCB = new javax.swing.JCheckBox();
        holySandalsCB = new javax.swing.JCheckBox();
        HwrapsCB = new javax.swing.JCheckBox();
        godRingiCB = new javax.swing.JCheckBox();
        BlessingCB = new javax.swing.JCheckBox();

        tassetsCB3.setText("P Tasset");
        tassetsCB3.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RuneScape ppot timer");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.darkGray);
        setName("frame"); // NOI18N
        setResizable(false);

        potionTypeTabbedPane.setToolTipText("Counts down doses of super strength & super attack potions.");
        potionTypeTabbedPane.setPreferredSize(new java.awt.Dimension(331, 174));

        PrayerPotionPanel.setToolTipText("Counts down doses of prayer potion");

        dosageCombobox.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        dosageCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Dose", "2 Doses" }));

        GObutton.setText("GO");
        GObutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GObuttonActionPerformed(evt);
            }
        });

        RESETbutton.setText("RESET");
        RESETbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETbuttonActionPerformed(evt);
            }
        });

        ProgressLabel.setText("Progress:");

        screen.setEditable(false);
        screen.setBackground(new java.awt.Color(38, 201, 143));
        screen.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        screen.setForeground(new java.awt.Color(255, 255, 255));
        screen.setText("0");
        screen.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        screen.setFocusable(false);

        lvlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "36-39", "40-43", "44-47", "48-51", "52-55", "56-59", "60-63", "64-67", "68-71", "72-75", "76-79", "80-83", "84-87", "88-91", "92-95", "96-99" }));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jLabel1.setText("Potion Doses");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jLabel2.setText("Prayer Level");
        jLabel2.setToolTipText("");

        mageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nmztimer/icon/Protect_from_magic.png"))); // NOI18N

        missilesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nmztimer/icon/Protect_from_missiles.png"))); // NOI18N
        missilesLabel.setToolTipText("");

        meleeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nmztimer/icon/Protect_from_melee.png"))); // NOI18N

        javax.swing.GroupLayout PrayerPotionPanelLayout = new javax.swing.GroupLayout(PrayerPotionPanel);
        PrayerPotionPanel.setLayout(PrayerPotionPanelLayout);
        PrayerPotionPanelLayout.setHorizontalGroup(
            PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProgressLabel)
                            .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meleeLabel)
                            .addComponent(missilesLabel)
                            .addComponent(mageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(GObutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dosageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lvlComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                                .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RESETbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PrayerPotionPanelLayout.setVerticalGroup(
            PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                                .addComponent(mageLabel)
                                .addGap(12, 12, 12)
                                .addComponent(missilesLabel)))
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ProgressLabel)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrayerPotionPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(meleeLabel)
                                .addGap(6, 6, 6))))
                    .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lvlComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dosageCombobox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GObutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RESETbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(timeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        potionTypeTabbedPane.addTab("Prayer Potion", null, PrayerPotionPanel, "");

        BonusLabel.setText("calculated bonus from items");

        MitreCB.setText("Mitre");

        BonusScreen.setEditable(false);
        BonusScreen.setText("0");

        ardyCloakCB.setText("Ardy Cloak");
        ardyCloakCB.setToolTipText("");

        stoleCB.setText("Stole");
        stoleCB.setToolTipText("");

        crozierCB.setText("Crozier ..");
        crozierCB.setToolTipText("");

        offhandCB.setText("Offhand");
        offhandCB.setToolTipText("");

        hauberkCB.setText("P Hauberk");
        hauberkCB.setToolTipText("");

        tassetsCB.setText("P Tasset");
        tassetsCB.setToolTipText("");

        holySandalsCB.setText("H Sandals");
        holySandalsCB.setToolTipText("");

        HwrapsCB.setText("H Wraps");
        HwrapsCB.setToolTipText("");

        godRingiCB.setText("Ring..Gods(i)");
        godRingiCB.setToolTipText("");

        BlessingCB.setText("Blessings");
        BlessingCB.setToolTipText("");

        javax.swing.GroupLayout nothingPanelLayout = new javax.swing.GroupLayout(nothingPanel);
        nothingPanel.setLayout(nothingPanelLayout);
        nothingPanelLayout.setHorizontalGroup(
            nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nothingPanelLayout.createSequentialGroup()
                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(nothingPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BonusScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BonusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(nothingPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MitreCB)
                            .addComponent(crozierCB)
                            .addComponent(holySandalsCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nothingPanelLayout.createSequentialGroup()
                                .addComponent(ardyCloakCB)
                                .addGap(18, 18, 18)
                                .addComponent(stoleCB))
                            .addGroup(nothingPanelLayout.createSequentialGroup()
                                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hauberkCB)
                                    .addComponent(HwrapsCB))
                                .addGap(18, 18, 18)
                                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(godRingiCB)
                                    .addComponent(tassetsCB)))))
                    .addGroup(nothingPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(offhandCB)
                        .addGap(18, 18, 18)
                        .addComponent(BlessingCB)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        nothingPanelLayout.setVerticalGroup(
            nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nothingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BonusLabel)
                    .addComponent(BonusScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MitreCB)
                    .addComponent(ardyCloakCB)
                    .addComponent(stoleCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crozierCB)
                    .addComponent(hauberkCB)
                    .addComponent(tassetsCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(holySandalsCB)
                    .addComponent(HwrapsCB)
                    .addComponent(godRingiCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offhandCB)
                    .addComponent(BlessingCB))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        potionTypeTabbedPane.addTab("Bonuses", nothingPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(potionTypeTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(potionTypeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //reset the clock based on dosagebox selected index.
    private void RESETbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETbuttonActionPerformed
        System.out.println("Resetting early...");
        dosage = dosageCombobox.getSelectedIndex();
        ticks = 0;
        
        if(dosageCombobox.getSelectedIndex() == 0){
            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
            seconds = (int)(seconds * DEPLETION_CONST); 
            
            sSeconds = Integer.toString(seconds);
            screen.setText(sSeconds);
            timeProgressBar.setValue(ticks);
        }
        else{
            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
            seconds = (int)((seconds * DEPLETION_CONST) * 2);
            
            sSeconds = Integer.toString(seconds);
            screen.setText(sSeconds);
            timeProgressBar.setValue(ticks);
        }
    }//GEN-LAST:event_RESETbuttonActionPerformed
 
    //Start timing PRAYER POTIONS
    private void GObuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GObuttonActionPerformed
        dosage = dosageCombobox.getSelectedIndex();
        GObutton.setEnabled(false);
        lvlComboBox.setEnabled(false);

        //ONE dose of potion
        if (dosage == 0){
            //look in the table for how mant points a dose gives at that level, then mult by the constant to give seconds per dose.
            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
            seconds = (int)(seconds * DEPLETION_CONST);
            
            System.out.println("Counting 1 dose for " + seconds + " seconds." +  "  Dosage Selected_index: " + dosage + "  Level Selected_index: " + lvlComboBox.getSelectedIndex());
            sSeconds = Integer.toString(seconds);
            screen.setText(sSeconds);

            
            //Set properties of the progress bar.
            timeProgressBar.setMinimum(0);
            timeProgressBar.setMaximum(seconds);

            //run Timer task.
            ppotTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seconds--;  //count down seconds
                    ticks++;    //how many seconds have gone by this run?
                    sSeconds = Integer.toString(seconds);
                    screen.setText(sSeconds);

                    //update the progress bar.
                    timeProgressBar.setValue(ticks);

                    //times up, ALERT ME to drink another potion.
                    if (seconds == 0){
                        screen.setText("TIME!");

                        //play a noise.
                        //alert(alert);
                        //can't find, and "wrong format".
                    }
                    //keep the message up for 4 more seconds while I'm being alerted.
                    else if (seconds <0 && seconds > -5){
                        screen.setText("TIME!");
                    }

                    //Auto-reset timer.
                    else if (seconds == -5){
                        //look at dosage combobox. People change their minds.
                        if(dosageCombobox.getSelectedIndex() == 0){
                            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
                            seconds = (int)(seconds * DEPLETION_CONST); 
                        }
                        else{
                        seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
                        seconds = (int)((seconds * DEPLETION_CONST) * 2);
                        }
                        ticks = 0;
                      
                        System.out.println("Resetting...");
                        sSeconds = Integer.toString(seconds);
                        screen.setText(sSeconds);
                        timeProgressBar.setValue(ticks);
                    }
                }
            }, 1000,1000);
        }
        
        //2 doses of potion!
        else if (dosage == 1){
            //look in the table for how mant points a dose gives at that level, then mult by the constant to give seconds per dose.
            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
            seconds = (int)((seconds * DEPLETION_CONST) * 2);
            
            System.out.println("Counting 2 doses for " + seconds + " seconds." +  "  Dosage Selected_index: " + dosage + "  Level Selected_index: " + lvlComboBox.getSelectedIndex());
            sSeconds = Integer.toString(seconds);
            screen.setText(sSeconds);

            
            //Set properties of the progress bar.
            timeProgressBar.setMinimum(0);
            timeProgressBar.setMaximum(seconds);

            //run Timer task.
            ppotTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seconds--;  //count down seconds
                    ticks++;    //how many seconds have gone by this run?
                    sSeconds = Integer.toString(seconds);
                    screen.setText(sSeconds);

                    //update the progress bar.
                    timeProgressBar.setValue(ticks);

                    //times up, ALERT ME to drink another potion.
                    if (seconds == 0){
                        screen.setText("TIME!");

                        //play a noise.
                        //alert(alert);
                        //can't find, and "wrong format".
                    }
                    //keep the message up for 4 more seconds while I'm being alerted.
                    else if (seconds <0 && seconds > -5){
                        screen.setText("TIME!");
                    }

                    //Auto-reset timer.
                    else if (seconds == -5){
                        //look at dosage combobox. People change their minds.
                        if(dosageCombobox.getSelectedIndex() == 0){
                            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
                            seconds = (int)(seconds * DEPLETION_CONST); 
                        }
                        else{
                        seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
                        seconds = (int)((seconds * DEPLETION_CONST) * 2);
                        }
                        ticks = 0;
                      
                        System.out.println("Resetting...");
                        sSeconds = Integer.toString(seconds);
                        screen.setText(sSeconds);
                        timeProgressBar.setValue(ticks);
                    }
                }
            }, 1000,1000);
        }
    }//GEN-LAST:event_GObuttonActionPerformed

    //Sub that tries to play an audio stream when the timer hits 0.  it fails to do so
    public void alert(File alert){
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(alert));
            clip.start();
            
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch(Exception err){
            System.out.println(err);  
        }
    }

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
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new timer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BlessingCB;
    private javax.swing.JLabel BonusLabel;
    private javax.swing.JTextField BonusScreen;
    private javax.swing.JButton GObutton;
    private javax.swing.JCheckBox HwrapsCB;
    private javax.swing.JCheckBox MitreCB;
    private javax.swing.JPanel PrayerPotionPanel;
    private javax.swing.JLabel ProgressLabel;
    private javax.swing.JButton RESETbutton;
    private javax.swing.JCheckBox ardyCloakCB;
    private javax.swing.JCheckBox crozierCB;
    private javax.swing.JComboBox dosageCombobox;
    private javax.swing.JCheckBox godRingiCB;
    private javax.swing.JCheckBox hauberkCB;
    private javax.swing.JCheckBox holySandalsCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox lvlComboBox;
    private javax.swing.JLabel mageLabel;
    private javax.swing.JLabel meleeLabel;
    private javax.swing.JLabel missilesLabel;
    private javax.swing.JPanel nothingPanel;
    private javax.swing.JCheckBox offhandCB;
    private javax.swing.JTabbedPane potionTypeTabbedPane;
    private javax.swing.JTextField screen;
    private javax.swing.JCheckBox stoleCB;
    private javax.swing.JCheckBox tassetsCB;
    private javax.swing.JCheckBox tassetsCB3;
    private javax.swing.JProgressBar timeProgressBar;
    // End of variables declaration//GEN-END:variables

    //Globals
    int ticks = 0;                          //how many seconds have gone by?
    int seconds;                            //how many seconds to count down.  decrement this var.
    int dosage = 0;                         //dosage combobox index.  how many doses of prayer potion to count down for.
    int prayerLevelIndex;                   //lvlCombobox index.  used for lookup in PrayerPoints Table to find # points from 1 dose.
    String sSeconds;                        //string version of seconds to send to label. 
 
    
    File alert = new File("/nmzTimer/src/nmztimer/sound/time.wav");   //sound file declaration
    
    final double DEPLETION_CONST = 3.45;    //one point of potion is depleted every 3.45 seconds with protection prayer on (AVERAGED)
    
    final Timer ppotTimer = new Timer();    //timer object that counts PPOT doses.
    int[] PPointsTable = {16,17,18,19,20,21,22,23,      //This table corresponds with combobox index. PPOTs replenesh
                          24,25,26,27,28,29,30,31};     //different amounts based on Prayer level.  refer to README.md for detailed table.
     
}

//THIS CURRENTLY DOES NOT FACTOR IN THE FORMULA FOR PRAYER DRAIN WITH PRAYER BONUS FROM ITEMS.
//THE EQUATION IS KNOWN, AND WILL BE USED IN A FUTURE UPDATE TO MAKE THIS TIMER MORE ACCURATE.
//CURRENTLY IT MAY BE 1-3 SECONDS OFF DEPENDING ON LEVEL AND DOSAGE.
//FOR NOW THE DRAINAGE CONSTANT IN THIS TIMER IS AN AVERAGED SCORE, 3.45.

