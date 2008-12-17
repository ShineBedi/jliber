package biblio;

import javax.swing.*;
import java.awt.Color;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrNouvPeriodiqueGUI.java
 *
 * Created on 15 déc. 2008, 14:47:12
 */

/**
 *
 * @author vargasch
 */
public class CtrNouvPeriodiqueGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;
    
    /** Creates new form CtrNouvPeriodiqueGUI */
    public CtrNouvPeriodiqueGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        parent_frame = parent;
        initComponents();
        this.setLocationRelativeTo(this.getParent());
    }

    public void menuPrincipal(Bibliotheque bib) {
        biblio = bib;
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        issn_label = new javax.swing.JLabel();
        nom_label = new javax.swing.JLabel();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        issn_textfield = new javax.swing.JTextField();
        nom_textfield = new javax.swing.JTextField();
        verifierISSN_button = new javax.swing.JButton();
        issn_notif_jlabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nom_notif_jlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout d'un périodique");

        issn_label.setText("Numéro ISSN :");

        nom_label.setText("Nom :");

        annuler_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/cancel.png"))); // NOI18N
        annuler_button.setText("Annuler");
        annuler_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                annuler_buttonMousePressed(evt);
            }
        });

        valider_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/tick.png"))); // NOI18N
        valider_button.setText("Valider");
        valider_button.setEnabled(false);
        valider_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valider_buttonMousePressed(evt);
            }
        });

        nom_textfield.setEnabled(false);

        verifierISSN_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/find.png"))); // NOI18N
        verifierISSN_button.setText("Verifier");
        verifierISSN_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifierISSN_buttonMousePressed(evt);
            }
        });

        issn_notif_jlabel.setText("Saisissez un numéro ISSN.");

        nom_notif_jlabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(issn_label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(issn_notif_jlabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(issn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(verifierISSN_button)))
                            .addContainerGap())
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nom_label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nom_notif_jlabel)
                                .addComponent(nom_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(101, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issn_label)
                    .addComponent(verifierISSN_button)
                    .addComponent(issn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issn_notif_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_notif_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed
        // TODO add your handling code here:
        String issn =  issn_textfield.getText();
        String nom =  nom_textfield.getText();
        Periodique per = biblio.unPeriodique(issn);
        if (nom.isEmpty()){
           nom_notif_jlabel.setText("Veuillez saisir un nom valide.");
           nom_notif_jlabel.setForeground(Color.red);
        } else {
            per = biblio.nouveauPeriodique(issn,nom );
            this.dispose();
            VuePeriodiqueGUI vPerGUI = new VuePeriodiqueGUI(parent_frame, true);
            vPerGUI.menuPrincipale(per);
            vPerGUI.elimineObserveur();
            vPerGUI = null;
        }

}//GEN-LAST:event_valider_buttonMousePressed

    private void verifierISSN_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifierISSN_buttonMousePressed
        // TODO add your handling code here:
        String issn =  issn_textfield.getText();
        String nom =  nom_textfield.getText();
        Periodique per = biblio.unPeriodique(issn);
        if (issn.isEmpty()){
            issn_notif_jlabel.setForeground(Color.red);
            issn_notif_jlabel.setText("Veuillez saisir un ISSN valide.");
        } else if (per != null) {
            issn_notif_jlabel.setForeground(Color.red);
            issn_notif_jlabel.setText("L'ISSN existe déjà dans la base.");
        } else {
           issn_notif_jlabel.setForeground(Color.green);
           issn_notif_jlabel.setText("Ce périodique n'existe pas, il peut être créé.");

           verifierISSN_button.setEnabled(false);
           issn_textfield.setEnabled(false);

           valider_button.setEnabled(true);
           nom_textfield.setEnabled(true);
        }
}//GEN-LAST:event_verifierISSN_buttonMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrNouvPeriodiqueGUI dialog = new CtrNouvPeriodiqueGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler_button;
    private javax.swing.JLabel issn_label;
    private javax.swing.JLabel issn_notif_jlabel;
    private javax.swing.JTextField issn_textfield;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nom_label;
    private javax.swing.JLabel nom_notif_jlabel;
    private javax.swing.JTextField nom_textfield;
    private javax.swing.JButton valider_button;
    private javax.swing.JButton verifierISSN_button;
    // End of variables declaration//GEN-END:variables

}