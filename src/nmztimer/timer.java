
package nmztimer;

import java.util.TimerTask;
import java.util.Timer;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 * @author reprise
 */
public class timer extends javax.swing.JFrame {

    /**
     * Creates new form ppotTimer
     */
    public timer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        potionTypeTabbedPane = new javax.swing.JTabbedPane();
        PrayerPotionPanel = new javax.swing.JPanel();
        dosageCombobox = new javax.swing.JComboBox();
        GObutton = new javax.swing.JButton();
        RESETbutton = new javax.swing.JButton();
        ProgressLabel = new javax.swing.JLabel();
        timeProgressBar = new javax.swing.JProgressBar();
        screen = new javax.swing.JTextField();
        nothingPanel = new javax.swing.JPanel();
        nothingpasswordfield = new javax.swing.JPasswordField();
        nothingusernamefield = new javax.swing.JTextField();
        nothingbutton = new javax.swing.JButton();

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
                        .addGap(24, 24, 24)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                                .addComponent(GObutton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RESETbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dosageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrayerPotionPanelLayout.setVerticalGroup(
            PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                        .addComponent(dosageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrayerPotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GObutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RESETbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PrayerPotionPanelLayout.createSequentialGroup()
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProgressLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        potionTypeTabbedPane.addTab("Prayer Potion", null, PrayerPotionPanel, "");

        nothingpasswordfield.setText("Password");

        nothingusernamefield.setText("Username");

        nothingbutton.setText("Go?");
        nothingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nothingbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nothingPanelLayout = new javax.swing.GroupLayout(nothingPanel);
        nothingPanel.setLayout(nothingPanelLayout);
        nothingPanelLayout.setHorizontalGroup(
            nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nothingPanelLayout.createSequentialGroup()
                .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nothingPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nothingpasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nothingusernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(nothingPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(nothingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        nothingPanelLayout.setVerticalGroup(
            nothingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nothingPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nothingusernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nothingpasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nothingbutton)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        potionTypeTabbedPane.addTab("Nothing", nothingPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(potionTypeTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(potionTypeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //reset the clock based on dosagebox selected index.
    private void RESETbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETbuttonActionPerformed
        System.out.println("Resetting early...");
        dosage = dosageCombobox.getSelectedIndex();
        if (dosage == 0){
            seconds = 82;
            ticks = 0;
             
            sSeconds = Integer.toString(seconds);
            screen.setText(sSeconds);
            timeProgressBar.setValue(ticks);
        }
        else if (dosage == 1){
            seconds = 165;
            ticks = 0;
            
            sSeconds = Integer.toString(seconds);
            screen.setText(sSeconds);
            timeProgressBar.setValue(ticks);
        }
    }//GEN-LAST:event_RESETbuttonActionPerformed
 
    //Start timing PRAYER POTIONS
    private void GObuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GObuttonActionPerformed
        dosage = dosageCombobox.getSelectedIndex();
        GObutton.setEnabled(false);

        if (dosage == 0){
            seconds = 82;
            System.out.println("Counting 1 dose of Prayer Potion for " + seconds + " seconds." +  "   Selected_index: " + dosage);
            screen.setText("82");

            //Set properties of the progress bar.
            timeProgressBar.setMinimum(0);
            timeProgressBar.setMaximum(82);

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
                        alert(alert);
                        //can't find, and "wrong format".

                    }
                    //keep the message up for 3 more seconds while I'm being alerted.
                    else if (seconds <0 && seconds > -5){
                        screen.setText("TIME!");
                    }

                    //RESET & run Timer again.
                    else if (seconds == -5){
                        seconds = 82;
                        ticks = 0;

                        System.out.println("Resetting...");
                        sSeconds = Integer.toString(seconds);
                        screen.setText(sSeconds);
                        timeProgressBar.setValue(ticks);
                    }
                }
            }, 1000,1000);
        }
        else if (dosage == 1){
            seconds = 165;
            System.out.println("Counting 2 doses of Prayer Potion for " + seconds + " seconds." +  " Selected_index: " + dosage);
            screen.setText("165");

            //Set properties of the progress bar.
            timeProgressBar.setMinimum(0);
            timeProgressBar.setMaximum(165);

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

                        //alert(alert);

                    }
                    //keep the message up for 3 more seconds while I'm being alerted.
                    else if (seconds <0 && seconds > -5){
                        screen.setText("TIME!");
                    }

                    //RESET & run Timer again.
                    else if (seconds == -5){
                        seconds = 165;
                        ticks = 0;

                        sSeconds = Integer.toString(seconds);
                        screen.setText(sSeconds);
                        timeProgressBar.setValue(ticks);
                    }
                }
            }, 1000,1000);
        }
    }//GEN-LAST:event_GObuttonActionPerformed

    //Because I'm bored and wanted another tab for now till I have a legitimate idea on how to automate more RuneScape Stuff I do.   
    private void nothingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nothingbuttonActionPerformed
        var++;
        if (var == 5){
            JOptionPane.showConfirmDialog(
                rootPane,
                "Stop pressing that button.\nIt doesn't do anything.\nMoron."
            );
            var = 0;
        }
    }//GEN-LAST:event_nothingbuttonActionPerformed

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
    private javax.swing.JButton GObutton;
    private javax.swing.JPanel PrayerPotionPanel;
    private javax.swing.JLabel ProgressLabel;
    private javax.swing.JButton RESETbutton;
    private javax.swing.JComboBox dosageCombobox;
    private javax.swing.JPanel nothingPanel;
    private javax.swing.JButton nothingbutton;
    private javax.swing.JPasswordField nothingpasswordfield;
    private javax.swing.JTextField nothingusernamefield;
    private javax.swing.JTabbedPane potionTypeTabbedPane;
    private javax.swing.JTextField screen;
    private javax.swing.JProgressBar timeProgressBar;
    // End of variables declaration//GEN-END:variables

    //Globals
    int ticks = 0;                          //how many seconds have gone by?
    int seconds;                            //how many seconds to count down, & increment this var downward.
    int dosage = 0;                         //combobox index.  how many doses of prayer potion to count down for.
    String sSeconds;                        //string version of seconds to send to label.                 
    final Timer ppotTimer = new Timer();    //timer object that counts PPOT doses.
    final Timer superPotTimer = new Timer();//timer object that counts super potion doses.
    File alert = new File("/nmzTimer/src/nmztimer/sound/time.wav");   //sound file declaration
    int var = 0;                            // OMG
}
