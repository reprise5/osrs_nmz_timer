
package nmztimer;

import java.util.TimerTask;
import java.util.Timer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


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
        tabbedPane1 = new javax.swing.JTabbedPane();
        PrayerPotionPanel = new javax.swing.JPanel();
        dosageCombobox = new javax.swing.JComboBox();
        GObutton = new javax.swing.JButton();
        RESETbutton = new javax.swing.JButton();
        ProgressLabel = new javax.swing.JLabel();
        timeProgressBar = new javax.swing.JProgressBar();
        screen = new javax.swing.JTextField();
        lvlComboBox = new javax.swing.JComboBox();
        potionDosesLabel = new javax.swing.JLabel();
        prayerLevelLabel = new javax.swing.JLabel();
        mageLabel = new javax.swing.JLabel();
        missilesLabel = new javax.swing.JLabel();
        meleeLabel = new javax.swing.JLabel();
        bonusPanel = new javax.swing.JPanel();
        BonusLabel = new javax.swing.JLabel();
        bonusScreen = new javax.swing.JTextField();
        useCheckBox = new javax.swing.JCheckBox();
        plusLabel = new javax.swing.JLabel();

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

        tabbedPane1.setToolTipText("Counts down doses of super strength & super attack potions.");
        tabbedPane1.setPreferredSize(new java.awt.Dimension(331, 174));

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

        potionDosesLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        potionDosesLabel.setText("Potion Doses");

        prayerLevelLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        prayerLevelLabel.setText("Prayer Level");
        prayerLevelLabel.setToolTipText("");

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
                            .addComponent(potionDosesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lvlComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                                .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prayerLevelLabel)
                                    .addComponent(RESETbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dosageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                                    .addComponent(mageLabel)
                                    .addGap(12, 12, 12)
                                    .addComponent(missilesLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrayerPotionPanelLayout.createSequentialGroup()
                                .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GObutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RESETbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrayerPotionPanelLayout.createSequentialGroup()
                                .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ProgressLabel)
                                    .addComponent(meleeLabel))
                                .addGap(17, 17, 17))))
                    .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(potionDosesLabel)
                            .addComponent(prayerLevelLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(timeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        tabbedPane1.addTab("Prayer Potion", null, PrayerPotionPanel, "");

        BonusLabel.setText("Enter Prayer Bonus");

        bonusScreen.setText("0");

        useCheckBox.setText("Use this bonus");
        useCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useCheckBoxActionPerformed(evt);
            }
        });

        plusLabel.setText("+");

        javax.swing.GroupLayout bonusPanelLayout = new javax.swing.GroupLayout(bonusPanel);
        bonusPanel.setLayout(bonusPanelLayout);
        bonusPanelLayout.setHorizontalGroup(
            bonusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bonusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bonusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bonusPanelLayout.createSequentialGroup()
                        .addComponent(bonusScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BonusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(useCheckBox))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        bonusPanelLayout.setVerticalGroup(
            bonusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bonusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bonusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BonusLabel)
                    .addComponent(bonusScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(useCheckBox)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        tabbedPane1.addTab("Bonuses", bonusPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
            seconds = (int)Math.round((seconds * DEPLETION)); 
        }
        else{
            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
            seconds = (int)(Math.round((seconds * DEPLETION) * 2));
        }
        
        screen.setText(Integer.toString(seconds));
        timeProgressBar.setMaximum(seconds);
        timeProgressBar.setValue(ticks);
            
    }//GEN-LAST:event_RESETbuttonActionPerformed
 
    //Start timing PRAYER POTIONS
    private void GObuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GObuttonActionPerformed
        /* alert(alert); */
        dosage = dosageCombobox.getSelectedIndex();
        GObutton.setEnabled(false);
        lvlComboBox.setEnabled(false);

        //ONE dose of potion
        if (dosage == 0){
            //look in the table for how mant points a dose gives at that level, then mult by the constant to give seconds per dose.
            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
            seconds = (int)Math.round((seconds * DEPLETION));
            
            System.out.println("Counting 1 dose for " + seconds + " seconds." +  "  Dosage Selected_index: " + dosage + "  Level Selected_index: " + lvlComboBox.getSelectedIndex());
            screen.setText(Integer.toString(seconds));
            
            //Set properties of the progress bar.
            timeProgressBar.setMinimum(0);
            timeProgressBar.setMaximum(seconds);

            //run Timer task.
            ppotTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seconds--;  //count down seconds
                    ticks++;    //how many seconds have gone by this run?
                    screen.setText(Integer.toString(seconds));

                    //update the progress bar.
                    timeProgressBar.setValue(ticks);

                    //times up, ALERT ME to drink another potion.
                    if (seconds == 0){
                        screen.setText("TIME!");

                        alert(alert);
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
                            seconds = (int)Math.round((seconds * DEPLETION)); 
                        }
                        else{
                            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
                            seconds = (int)(Math.round((seconds * DEPLETION) * 2));
                        }
                        ticks = 0;
                      
                        System.out.println("Resetting...");
                        screen.setText(Integer.toString(seconds));
                        timeProgressBar.setValue(ticks);
                    }
                }
            }, 1000,1000);
        }
        
        //2 doses of potion!
        else if (dosage == 1){
            //look in the table for how mant points a dose gives at that level, then mult by the constant to give seconds per dose.
            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
            seconds = (int)Math.round((seconds * DEPLETION) * 2);
            
            System.out.println("Counting 2 doses for " + seconds + " seconds." +  "  Dosage Selected_index: " + dosage + "  Level Selected_index: " + lvlComboBox.getSelectedIndex());
            screen.setText(Integer.toString(seconds));
            
            //Set properties of the progress bar.
            timeProgressBar.setMinimum(0);
            timeProgressBar.setMaximum(seconds);

            //run Timer task.
            ppotTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    seconds--;  //count down seconds
                    ticks++;    //how many seconds have gone by this run?
                    screen.setText(Integer.toString(seconds));

                    //update the progress bar.
                    timeProgressBar.setValue(ticks);

                    //times up, ALERT ME to drink another potion.
                    if (seconds == 0){
                        screen.setText("TIME!");
                        alert(alert);
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
                            seconds = (int)Math.round((seconds * DEPLETION)); 
                        }
                        else{
                            seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
                            seconds = (int)Math.round(((seconds * DEPLETION) * 2));
                        }
                        ticks = 0;
                      
                        System.out.println("Resetting...");
                        screen.setText(Integer.toString(seconds));
                        timeProgressBar.setValue(ticks);
                    }
                }
            }, 1000,1000);
        }
    }//GEN-LAST:event_GObuttonActionPerformed

    //if box is checked, auto-flips user back to main timer screen.
    private void useCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useCheckBoxActionPerformed
        String sBonus = bonusScreen.getText();
        
        try{
            bonus = Integer.parseInt(sBonus); 
        }
        catch (NumberFormatException nfe){
            useCheckBox.setSelected(false);
        }   
        
        if(useCheckBox.isSelected() && bonus <= 61 && bonus > 0){
            tabbedPane1.setSelectedIndex(0);
            
            /*
             * We are going to calculate the new constant right here.
             * EQUATION:     NewRate = RawRate * (1 + ( bonus / 30 ) )
             * where RawRate is 3 (default depletion rate).
             */      
            DEPLETION = 3.00 * ( 1 + (bonus / 30.0));
            System.out.println("Bonus: " + bonus);
            System.out.println("New Depletion Constant Calculated: " + DEPLETION );
            RESETbuttonActionPerformed(evt);
        }
        else{ 
            useCheckBox.setSelected(false);
            bonus = 0;
            DEPLETION = 3;
            System.out.println("Acknowleged.  Depletion constant is " + DEPLETION + ", bonus is " + bonus + ".");
            RESETbuttonActionPerformed(evt);
            tabbedPane1.setSelectedIndex(0); 
        }   
    }//GEN-LAST:event_useCheckBoxActionPerformed

    //Sub that tries to play an audio stream when the timer hits 0.  pls fix file declaration though.  (:
    public void alert(File alert){
        //new thread?  necessary?
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(alert));
            clip.start();
            
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch(LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException err){
            System.out.println(err);  
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BonusLabel;
    private javax.swing.JButton GObutton;
    private javax.swing.JPanel PrayerPotionPanel;
    private javax.swing.JLabel ProgressLabel;
    private javax.swing.JButton RESETbutton;
    private javax.swing.JPanel bonusPanel;
    private javax.swing.JTextField bonusScreen;
    private javax.swing.JComboBox dosageCombobox;
    private javax.swing.JComboBox lvlComboBox;
    private javax.swing.JLabel mageLabel;
    private javax.swing.JLabel meleeLabel;
    private javax.swing.JLabel missilesLabel;
    private javax.swing.JLabel plusLabel;
    private javax.swing.JLabel potionDosesLabel;
    private javax.swing.JLabel prayerLevelLabel;
    private javax.swing.JTextField screen;
    private javax.swing.JTabbedPane tabbedPane1;
    private javax.swing.JCheckBox tassetsCB3;
    private javax.swing.JProgressBar timeProgressBar;
    private javax.swing.JCheckBox useCheckBox;
    // End of variables declaration//GEN-END:variables

    //Globals
    int ticks = 0;          //how many seconds have gone by? [[increment this var.]]
    int seconds;            //how many seconds to count down.  [[decrement this var.]]
    int dosage = 0;         //dosage combobox index. How many >doses< of prayer potion to count down for.
    int prayerLevelIndex;   //lvlCombobox index.  used for lookup in PrayerPoints Table to find # points from 1 dose.
    double bonus = 0.0;     //Bonus from items to be calculated to find DEPLETION constant.  if neglected, 3.45.
    double DEPLETION = 3.47;//one point of potion is depleted every 3.45 seconds with protection prayer on (AVERAGED)
    
    final Timer ppotTimer = new Timer();                //timer object that counts PPOT doses.
    int[] PPointsTable = {16,17,18,19,20,21,22,23,      //This table corresponds with combobox index. PPOTs replenesh
                          24,25,26,27,28,29,30,31};     //different amounts based on Prayer level.  refer to README.md for detailed table.
    
    //sound file declaration
    File alert = new File("/home/reprise/Dropbox/Programming/01 Java/nmzTimer/src/nmztimer/sound/time.wav");   //sound file declaration
    //File alert2 = new File(alertURL);   //second sound file declaration
    InputStream alert3 = ClassLoader.getSystemClassLoader().getResourceAsStream("/nmzTimer/src/nmztimer/sound/time.wav");  //third try for sound file declr.
    URL alertURL = ClassLoader.getSystemClassLoader().getResource("/nmzTimer/src/nmztimer/sound/time.wav");
}
/*                                   *** NOTES ***
 * + The average drainage constant in this timer was 3.45. (before the arithmatic was worked out).
 *   It may be used as a fallback constant in some cases.
 * + Sound file declaration is being worked out.  It finally works, butonly using a direct path to the file.
 *   The goal is to have it load the file from a directory from within a .jar package file.  
 *   I accomplished this with images in other projects using:
 *   <code> ImageIcon who = new javax.swing.ImageIcon(getClass().getResource("/PuzzPak/images/main-menu/loginIcon.png")); </code>
 *   how would this string of code be used for "File"?
 */