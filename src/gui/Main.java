package gui;

import main.*;

/**
 *
 * @author sebas
 */
public class Main extends javax.swing.JFrame {
    
    Verteilung t;
    String JPanelText = "";

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        t = new Verteilung();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gruppenverteilung - Fifa-Turnier");
        setPreferredSize(new java.awt.Dimension(800, 800));

        jToggleButton1.setText("Starten");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, java.awt.BorderLayout.PAGE_END);

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setToolTipText("Mannschaft eintragen");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);

        jButton1.setText("Hinzufügen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //Verteilung t = new Verteilung();
        
        /*Team team1 = new Team("FC Bayern München");
        t.addTeam(team1);
                
        Team team2 = new Team("FC Barcelona");
        t.addTeam(team2);
        
        Team team3 = new Team("Letzter FC Köln");
        t.addTeam(team3);
        
        Team team4 = new Team("Manschester United");
        t.addTeam(team4);
        
        Team team5 = new Team("Olympique Lyon");
        t.addTeam(team5);
        
        Team team6 = new Team("Paris Saint Germain");
        t.addTeam(team6);
        
        Team team7 = new Team("PSV Eindhoven");
        t.addTeam(team7);
        
        Team team8 = new Team("Celtic Glasgow");
        t.addTeam(team8);
        
        Team team9 = new Team("FC AUGSBURG");
        t.addTeam(team9);
        
        Team team10 = new Team("DER GLUBB");
        t.addTeam(team10);*/
        
        
        t.gruppenfestlegen();
        
        String s = t.getGruppeA() + "\n" + t.getGruppeB();
        
        jTextPane1.setText(s);
        repaint();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String mannschaft = this.jTextField1.getText();
        t.addTeam(new Team (mannschaft));
        JPanelText = JPanelText + "\n" + mannschaft;
        jTextPane1.setText(JPanelText);
        jTextField1.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String mannschaft = this.jTextField1.getText();
        t.addTeam(new Team (mannschaft));
        JPanelText = JPanelText + "\n" + mannschaft;
        jTextPane1.setText(JPanelText);
        jTextField1.setText(null);
    }//GEN-LAST:event_jTextField1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
