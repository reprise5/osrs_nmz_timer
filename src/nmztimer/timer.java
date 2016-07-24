
package nmztimer;

import java.util.TimerTask;
import java.util.Timer;
import java.io.*;
import sun.audio.*;

/**
 * @author reprise
 */
public class timer extends javax.swing.JFrame {

    /**
     * Creates new form timer
     */
    public timer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dosageCombobox = new javax.swing.JComboBox();
        screen = new javax.swing.JTextField();
        STOPbutton = new javax.swing.JButton();
        GObutton = new javax.swing.JButton();
        timeProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RuneScape ppot timer");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        dosageCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Dose", "2 Doses" }));

        screen.setEditable(false);
        screen.setBackground(new java.awt.Color(153, 204, 255));
        screen.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        screen.setForeground(new java.awt.Color(153, 0, 0));
        screen.setText("0");
        screen.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        screen.setFocusable(false);

        STOPbutton.setText("STOP");
        STOPbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STOPbuttonActionPerformed(evt);
            }
        });

        GObutton.setText("GO");
        GObutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GObuttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Progress:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GObutton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(STOPbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dosageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dosageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GObutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STOPbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6)
                .addComponent(timeProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Start timing.  keep going until stop.
    private void GObuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GObuttonActionPerformed
    dosage = dosageCombobox.getSelectedIndex();        
    
    if (dosage == 0){
        seconds = 82;
        System.out.println(" Counting 1 dose of Prayer Potion for " + seconds + " seconds." +  "   Selected_index: " + dosage);
        screen.setText("82");
        
        //Set properties of the progress bar.
        timeProgressBar.setMinimum(0);
        timeProgressBar.setMaximum(82);
        
        //run timer task.
        timer.scheduleAtFixedRate(new TimerTask() {
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
                    System.out.println(seconds);
                    
                    //play a noise.
                    try{
                        AudioStream audioStream = new AudioStream(inputStream);
                        AudioPlayer.player.start(audioStream);
                        //^NULL POINTER EXCEPTION.                              *fix
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
                //keep the message up for 3 more seconds while I'm being alerted. 
                else if (seconds <0 && seconds > -4){
                    screen.setText("TIME!");
                }

                //RESET & run timer again.
                else if (seconds == -4){
                    seconds = 82;
                    ticks = 0;
                    
                    System.out.println(seconds);
                    sSeconds = Integer.toString(seconds);
                    screen.setText(sSeconds);
                    timeProgressBar.setValue(ticks);
                }
            }
        }, 1000,1000);
    } 
    else if (dosage == 1){
        seconds = 165;
        System.out.println(" Counting 2 doses of Prayer Potion for " + seconds + " seconds." +  " Selected_index: " + dosage);

            //now do the thing.

        }
    }//GEN-LAST:event_GObuttonActionPerformed

    private void STOPbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STOPbuttonActionPerformed
        timer.cancel();
        //if it's canceled, it cannot be started again.                         *can't do twice.
    }//GEN-LAST:event_STOPbuttonActionPerformed

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
    private javax.swing.JButton STOPbutton;
    private javax.swing.JComboBox dosageCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField screen;
    private javax.swing.JProgressBar timeProgressBar;
    // End of variables declaration//GEN-END:variables

    //Globals
    int ticks = 0;                          //how many seconds have gone by?
    int seconds;                            //how many seconds to count down, & increment this var downward.
    int dosage = 0;                         //combobox index.  how many doses of prayer potion to count down for.
    String sSeconds;                        //string version of seconds to send to label.                 
    final Timer timer = new Timer();        //timer object
    InputStream inputStream = getClass().getResourceAsStream("nmztimer/sounds/demonstrative.ogg");
                                            //the sound file declaration
}
