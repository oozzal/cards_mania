/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClientGUI.java
 *
 * Created on Dec 3, 2011, 10:54:42 AM
 */
package cardsmania;

import java.net.*;
import java.io.*;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;

/**
 *
 * @author Uzzal Devkota
 */
public class ClientGUI extends javax.swing.JFrame {

    private CardsManiaClient gameClient = null;
    
    /** Creates new form ClientGUI */
    public ClientGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        msgTextArea = new javax.swing.JTextArea();
        card0Lbl = new javax.swing.JLabel();
        card1Lbl = new javax.swing.JLabel();
        card2Lbl = new javax.swing.JLabel();
        chaalBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        packBtn = new javax.swing.JButton();
        sideShowBtn = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
        msgTextField = new javax.swing.JTextField();
        doubleChaalBtn = new javax.swing.JButton();
        appNameLbl = new javax.swing.JLabel();
        handTypeLbl = new javax.swing.JLabel();
        seeCardsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalAmountLbl = new javax.swing.JLabel();
        gameAmountLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chaalAmountLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CardsMania Client");

        msgTextArea.setColumns(20);
        msgTextArea.setEditable(false);
        msgTextArea.setRows(5);
        jScrollPane1.setViewportView(msgTextArea);

        card0Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card1Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card2Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        chaalBtn.setText("Chaal");
        chaalBtn.setEnabled(false);
        chaalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaalBtnActionPerformed(evt);
            }
        });

        showBtn.setText("Show");
        showBtn.setEnabled(false);
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        packBtn.setText("Pack");
        packBtn.setEnabled(false);
        packBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packBtnActionPerformed(evt);
            }
        });

        sideShowBtn.setText("SideShow");
        sideShowBtn.setEnabled(false);
        sideShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideShowBtnActionPerformed(evt);
            }
        });

        startBtn.setText("Sart Client");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        msgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTextFieldActionPerformed(evt);
            }
        });

        doubleChaalBtn.setText("Double Chaal");
        doubleChaalBtn.setEnabled(false);
        doubleChaalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleChaalBtnActionPerformed(evt);
            }
        });

        appNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18));
        appNameLbl.setForeground(new java.awt.Color(51, 51, 255));
        appNameLbl.setText("CardsMania Client");
        appNameLbl.setPreferredSize(new java.awt.Dimension(179, 22));

        handTypeLbl.setFont(new java.awt.Font("Tahoma", 0, 18));
        handTypeLbl.setForeground(new java.awt.Color(255, 51, 51));

        seeCardsBtn.setText("See Cards");
        seeCardsBtn.setEnabled(false);
        seeCardsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeCardsBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 0));
        jLabel1.setText("Total Amount:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 0));
        jLabel2.setText("Game Amount:");

        totalAmountLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalAmountLbl.setForeground(new java.awt.Color(102, 153, 0));

        gameAmountLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gameAmountLbl.setForeground(new java.awt.Color(102, 153, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 0));
        jLabel3.setText("Chaal Amount:");

        chaalAmountLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chaalAmountLbl.setForeground(new java.awt.Color(102, 153, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addComponent(msgTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addComponent(handTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(startBtn)
                                .addGap(58, 58, 58)
                                .addComponent(appNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seeCardsBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chaalBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(doubleChaalBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sideShowBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(packBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card0Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalAmountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                        .addGap(3, 3, 3))
                                    .addComponent(chaalAmountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gameAmountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalAmountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chaalAmountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gameAmountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(card0Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(handTypeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seeCardsBtn)
                    .addComponent(packBtn)
                    .addComponent(chaalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doubleChaalBtn)
                    .addComponent(showBtn)
                    .addComponent(sideShowBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chaalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaalBtnActionPerformed
        // TODO add your handling code here:
        gameClient.chaal();
    }//GEN-LAST:event_chaalBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        gameClient.Show();
    }//GEN-LAST:event_showBtnActionPerformed

    private void sideShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideShowBtnActionPerformed
        // TODO add your handling code here:
        gameClient.sideShow();
    }//GEN-LAST:event_sideShowBtnActionPerformed

    private void packBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packBtnActionPerformed
        // TODO add your handling code here:
        gameClient.pack();
    }//GEN-LAST:event_packBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // TODO add your handling code here:
        try {
            gameClient = new CardsManiaClient();
            gameClient.start();
            startBtn.setEnabled(false);
        } catch (IOException e) {
            displayMessage("Error Starting Client");
            startBtn.setEnabled(true);
            e.printStackTrace();
        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void msgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTextFieldActionPerformed
        // TODO add your handling code here:
        String outputMsg = msgTextField.getText();
        if(outputMsg.equals("/exit")) {
            gameClient.closeConnection();
            System.exit(0);
        } else {
            gameClient.send(msgTextField.getText());
            msgTextField.setText("");
        }
    }//GEN-LAST:event_msgTextFieldActionPerformed

    private void doubleChaalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleChaalBtnActionPerformed
        // TODO add your handling code here:
        gameClient.doubleChaal();
    }//GEN-LAST:event_doubleChaalBtnActionPerformed

    private void seeCardsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeCardsBtnActionPerformed
        // TODO add your handling code here:
        gameClient.see();
    }//GEN-LAST:event_seeCardsBtnActionPerformed

     // display message in msgTextArea
     public void displayMessage( final String messageToDisplay ) {
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    msgTextArea.append( messageToDisplay + "\n" );
                    //auto scroll the msgTextArea to the bottom
                    Document d = msgTextArea.getDocument();
                    msgTextArea.select(d.getLength(), d.getLength());
                }
            }
        );
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
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLbl;
    private javax.swing.JLabel card0Lbl;
    private javax.swing.JLabel card1Lbl;
    private javax.swing.JLabel card2Lbl;
    private javax.swing.JLabel chaalAmountLbl;
    private javax.swing.JButton chaalBtn;
    private javax.swing.JButton doubleChaalBtn;
    private javax.swing.JLabel gameAmountLbl;
    private javax.swing.JLabel handTypeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea msgTextArea;
    private javax.swing.JTextField msgTextField;
    private javax.swing.JButton packBtn;
    private javax.swing.JButton seeCardsBtn;
    private javax.swing.JButton showBtn;
    private javax.swing.JButton sideShowBtn;
    private javax.swing.JButton startBtn;
    private javax.swing.JLabel totalAmountLbl;
    // End of variables declaration//GEN-END:variables

    class CardsManiaClient extends Thread {
    
        private Socket connection = null;
        private ObjectInputStream input = null;
        private ObjectOutputStream output = null;
        private static final int port = 12345;
        private static final String host = "localhost";
        public Player player = null;

        public CardsManiaClient() throws IOException {
            displayMessage("Connecting to Server...");
            connection = new Socket(host,port);
            displayMessage("Connection to Server Successful");
            player = new Player();
        }

        public void run() {
            displayMessage("Starting Sender and Receiver Clients..");
            new ReceiverClient().start();
            new SenderClient().start();
        }

        public void send(Object toSend) {
            try {
                output.writeObject(toSend);
                output.flush();
            } catch(IOException e) {
                displayMessage("Error Sending Message");
            }
        }

        public void displayCards() {
            int count = 0;
            javax.swing.JLabel[] cardLabels = {card0Lbl,card1Lbl,card2Lbl};
            player.getCards();
            for(int j = 0; j < 3; j++) {
              cardLabels[count].setIcon(new javax.swing.ImageIcon(getClass().getResource(
                      player.hand.handCards[j].getSpritePath())));
                      count++;
            }
            handTypeLbl.setText(player.hand.handType);
        }

        public void hideCards() {
            int count = 0;
            javax.swing.JLabel[] cardLabels = {card0Lbl,card1Lbl,card2Lbl};
            for(int j = 0; j < 3; j++) {
              cardLabels[count].setIcon(new javax.swing.ImageIcon(getClass().getResource(
                      "/cardsmania/pics/back.png")));
                      count++;
            }
            handTypeLbl.setText("");
        }

        public void enableButtons() {
            seeCardsBtn.setEnabled(true);
            chaalBtn.setEnabled(true);
            doubleChaalBtn.setEnabled(true);
            packBtn.setEnabled(true);
        }

        public void disableButtons() {
            seeCardsBtn.setEnabled(false);
            chaalBtn.setEnabled(false);
            doubleChaalBtn.setEnabled(false);
            showBtn.setEnabled(false);
            sideShowBtn.setEnabled(false);
            packBtn.setEnabled(false);
        }
        
        public void see() {
            player.seen = true;
            displayCards();
            seeCardsBtn.setEnabled(false);
            send(player);
        }

        public void chaal() {
            disableButtons();
            send(player);
        }
        
        public void doubleChaal() {
            disableButtons();
            send(player);
        }
        
        public void sideShow() {
            disableButtons();
            send(player);
        }
        
        public void Show() {
            disableButtons();
            send(player);
        }
        
        public void pack() {
            player.packed = true;
            disableButtons();
            send(player);
        }
        
        public void updateClient() {
            hideCards();
            enableButtons();
            totalAmountLbl.setText("" + player.totalAmount);
            chaalAmountLbl.setText("" + player.chaalAmount);
            gameAmountLbl.setText("" + player.gameAmount);
        }
        
        public void closeConnection() {
            try {
                connection.close();
                input.close();
                output.close();
                startBtn.setEnabled(true);
            } catch (IOException ex) {
                ex.printStackTrace();
                System.exit(1);
            }
        }

        class SenderClient extends Thread {

            private String outputMsg = null;

            public void run() {
                try {
                    output = new ObjectOutputStream(connection.getOutputStream());
                    output.flush();
                } catch (IOException ex) {
                    displayMessage("IOException Occurred");
                    ex.printStackTrace();
                    closeConnection();
                }
            }
        }

        class ReceiverClient extends Thread {

            private String inputMsg = "test";

            public void processObject(Object incomingObject) throws IOException, ClassNotFoundException {
                if( incomingObject.getClass().toString().equals(inputMsg.getClass().toString()) ) {
                    inputMsg = (String)incomingObject;
                    displayMessage(inputMsg);
                } else if( incomingObject.getClass().toString().equals(player.getClass().toString()) ) {
                    displayMessage("Receiving Cards...");
                    player = (Player)incomingObject;
                    updateClient();
                }
            }
            
            public void run() {
                try {
                    input = new ObjectInputStream(connection.getInputStream());
                    while(true) {
                        processObject(input.readObject());
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                    displayMessage("IOException Occurred");
                    closeConnection();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                    displayMessage("ClassNotFoundException Occurred");
                    closeConnection();
                }
            }
        }

    } // end of class CardsManiaClient

} // end of class ClientGUI
