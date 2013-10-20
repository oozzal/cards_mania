/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CardsMania.java
 *
 * Created on Nov 23, 2011, 3:17:50 PM
 */
package cardsmania;

import javax.swing.JLabel;

/**
 *
 * @author Uzzal Devkota
 */
public class CardsMania extends javax.swing.JFrame {

    /** Creates new form CardsMania */
    public CardsMania() {
        initComponents();
        deck = new Deck();
        players = new Player[numberOfPlayers];
        sameCardHolders = new int[numberOfPlayers];
        playersReady();
        startGame();
    }

    private void playersReady() {
        for(int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player();
            players[i].hand.handCards = new Card[cardsPerPlayer];
        }
    }
    
    private void startGame() {
        deck.shuffle(); // the deck is shuffled as the game starts
        deck.cutCards();
        dealCards();
        showCards();
        declareWinner();
    }
    
    //as dealt in real
    private void dealCards() {
        for(int i = 0; i < numberOfPlayers; i++) {
            for(int j = 0; j < cardsPerPlayer; j++) {
                if(deck.currentCardIndex > 51) {
                    deck.currentCardIndex = 0;
                }
                players[j].hand.handCards[i] = deck.getCardAt(deck.currentCardIndex);
                deck.currentCardIndex++;
            }
        }
    }
    
    private void showCards() {
        int count = 0;
        JLabel[] cardLabels = {card1_lbl,card2_lbl,card3_lbl,card4_lbl,
                                card5_lbl,card6_lbl,card7_lbl,card8_lbl,card9_lbl};
        JLabel[] handTypeLabels = {handType0_lbl,handType1_lbl,handType2_lbl};
        for(int i = 0; i < numberOfPlayers; i++) {
            players[i].hand.arrange();
            System.out.println("Player[" + i + "] has:\n");
            players[i].getCards();
            System.out.println("Hand Type = " + players[i].hand.handType);
            System.out.println("\n--------------------------------\n");
            //get Sprite values here
            for(int j = 0; j < 3; j++) {
              cardLabels[count].setIcon(new javax.swing.ImageIcon(getClass().getResource(
                      players[i].hand.handCards[j].getSpritePath())));
                      count++;
            }
            handTypeLabels[i].setText(players[i].hand.handType);
        }
    }
    
    private void declareWinner() {
        int winner = 0;
        int winnersCount = 0;
        for(int i = 0; i < numberOfPlayers - 1; i++) {
            if(players[i+1].hand.isGreaterHand(players[winner].hand))
                winner = i + 1;
            if(players[i].hand.isEqualHand(players[i+1].hand)) {
                sameCardHolders[winnersCount] = i;
                sameCardHolders[winnersCount + 1] = i + 1;
                winnersCount++;
            }
        }
        if(winnersCount == 0) {
            System.out.println("Winner is: Player[" + winner +"]");
            winner_lbl.setText("Winner is: Player[" + winner +"]");
        } else {
            System.out.println("Winners are:");
            winner_lbl.setText("Multiple Winners");
            for(int i = 0; i <= winnersCount; i++) {
                System.out.println(" Player[" + sameCardHolders[i] +"]");
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1_lbl = new javax.swing.JLabel();
        card2_lbl = new javax.swing.JLabel();
        card3_lbl = new javax.swing.JLabel();
        card4_lbl = new javax.swing.JLabel();
        card5_lbl = new javax.swing.JLabel();
        card6_lbl = new javax.swing.JLabel();
        card7_lbl = new javax.swing.JLabel();
        card8_lbl = new javax.swing.JLabel();
        card9_lbl = new javax.swing.JLabel();
        winner_lbl = new javax.swing.JLabel();
        player1_lbl = new javax.swing.JLabel();
        player2_lbl = new javax.swing.JLabel();
        player0_lbl = new javax.swing.JLabel();
        handType0_lbl = new javax.swing.JLabel();
        handType1_lbl = new javax.swing.JLabel();
        handType2_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        card1_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card1_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card2_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card2_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card3_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card3_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card4_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card4_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card5_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card5_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card6_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card6_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card7_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card7_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card8_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card8_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        card9_lbl.setBackground(new java.awt.Color(51, 153, 0));
        card9_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardsmania/pics/back.png"))); // NOI18N

        winner_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        winner_lbl.setForeground(new java.awt.Color(0, 204, 102));
        winner_lbl.setText("Winner Is: Player[0]");

        player1_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        player1_lbl.setForeground(new java.awt.Color(51, 51, 255));
        player1_lbl.setText("Player[1]");

        player2_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        player2_lbl.setForeground(new java.awt.Color(51, 51, 255));
        player2_lbl.setText("Player[2]");

        player0_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        player0_lbl.setForeground(new java.awt.Color(51, 51, 255));
        player0_lbl.setText("Player[0]");

        handType0_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        handType0_lbl.setForeground(new java.awt.Color(255, 0, 102));
        handType0_lbl.setText("Double Run");

        handType1_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        handType1_lbl.setForeground(new java.awt.Color(255, 0, 102));
        handType1_lbl.setText("Double Run");

        handType2_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        handType2_lbl.setForeground(new java.awt.Color(255, 0, 102));
        handType2_lbl.setText("Double Run");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(card7_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player2_lbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card8_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card9_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(handType2_lbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(winner_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(card1_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card2_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card3_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(card4_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(player0_lbl)
                            .addComponent(handType0_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card5_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(card6_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(player1_lbl)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(handType1_lbl)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card6_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player1_lbl)
                    .addComponent(player0_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(handType1_lbl)
                    .addComponent(handType0_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card9_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card7_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(player2_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(handType2_lbl)
                .addGap(31, 31, 31)
                .addComponent(winner_lbl)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        card1_lbl.getAccessibleContext().setAccessibleName("card1");
        card2_lbl.getAccessibleContext().setAccessibleName("card1");
        card3_lbl.getAccessibleContext().setAccessibleName("card1");
        card4_lbl.getAccessibleContext().setAccessibleName("card1");
        card5_lbl.getAccessibleContext().setAccessibleName("card1");
        card6_lbl.getAccessibleContext().setAccessibleName("card1");
        card7_lbl.getAccessibleContext().setAccessibleName("card1");
        card8_lbl.getAccessibleContext().setAccessibleName("card1");
        card9_lbl.getAccessibleContext().setAccessibleName("card1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CardsMania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardsMania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardsMania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardsMania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CardsMania().setVisible(true);
            }
        });
    }
    
    private static Deck deck;
    private static Player[] players;
    private static int numberOfPlayers = 3;
    private static int cardsPerPlayer = 3;
    private static int[] sameCardHolders;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel card1_lbl;
    private javax.swing.JLabel card2_lbl;
    private javax.swing.JLabel card3_lbl;
    private javax.swing.JLabel card4_lbl;
    private javax.swing.JLabel card5_lbl;
    private javax.swing.JLabel card6_lbl;
    private javax.swing.JLabel card7_lbl;
    private javax.swing.JLabel card8_lbl;
    private javax.swing.JLabel card9_lbl;
    private javax.swing.JLabel handType0_lbl;
    private javax.swing.JLabel handType1_lbl;
    private javax.swing.JLabel handType2_lbl;
    private javax.swing.JLabel player0_lbl;
    private javax.swing.JLabel player1_lbl;
    private javax.swing.JLabel player2_lbl;
    private javax.swing.JLabel winner_lbl;
    // End of variables declaration//GEN-END:variables
}