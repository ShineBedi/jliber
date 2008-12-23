/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrEmpruntExGUI.java
 *
 * Created on 23 déc. 2008, 10:57:25
 */

package biblio;

import java.awt.Color;
import java.lang.*;
import java.util.*;

/**
 *
 * @author ksz
 */
public class CtrRetourExGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;
    private Ouvrage ouvrage_global;
    private Lecteur lecteur_global;
    private Emprunt emprunt_global;

    /** Creates new form CtrRendreExEmpruntableGUI */
    public CtrRetourExGUI(java.awt.Frame parent, boolean modal) {
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

        numero_lect_label = new javax.swing.JLabel();
        numero_lecteur_spin = new javax.swing.JSpinner();
        verifierNumLecteur_button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        numero_lecteur_notif_jlabel = new javax.swing.JLabel();
        issn_label = new javax.swing.JLabel();
        rechercherISBN_button = new javax.swing.JButton();
        isbn_notif_jlabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        issn_label1 = new javax.swing.JLabel();
        numexemp_combobox = new javax.swing.JComboBox();
        numexemp_notif_jlabel = new javax.swing.JLabel();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        isbn_textfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Retour d'un exemplaire");

        numero_lect_label.setText("Numéro du lecteur :");

        verifierNumLecteur_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/find.png"))); // NOI18N
        verifierNumLecteur_button.setText("Verifier");
        verifierNumLecteur_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifierNumLecteur_buttonMousePressed(evt);
            }
        });

        numero_lecteur_notif_jlabel.setText(" ");

        issn_label.setText("Numéro ISBN :");

        rechercherISBN_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/find.png"))); // NOI18N
        rechercherISBN_button.setText("Verifier");
        rechercherISBN_button.setEnabled(false);
        rechercherISBN_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rechercherISBN_buttonMousePressed(evt);
            }
        });

        isbn_notif_jlabel.setText(" ");

        issn_label1.setText("Numéro exemplaire :");

        numexemp_combobox.setEnabled(false);

        numexemp_notif_jlabel.setText(" ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero_lect_label)
                    .addComponent(issn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issn_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(315, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(numexemp_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(isbn_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(numero_lecteur_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numero_lecteur_spin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numexemp_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verifierNumLecteur_button)
                            .addComponent(rechercherISBN_button))
                        .addGap(13, 13, 13)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {issn_label, issn_label1, numero_lect_label});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {annuler_button, rechercherISBN_button, valider_button, verifierNumLecteur_button});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {isbn_textfield, numero_lecteur_spin, numexemp_combobox});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_lect_label)
                    .addComponent(numero_lecteur_spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifierNumLecteur_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numero_lecteur_notif_jlabel)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issn_label)
                    .addComponent(rechercherISBN_button)
                    .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isbn_notif_jlabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issn_label1)
                    .addComponent(numexemp_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numexemp_notif_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(164, 164, 164)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {numero_lecteur_spin, numexemp_combobox});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rechercherISBN_button, verifierNumLecteur_button});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifierNumLecteur_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifierNumLecteur_buttonMousePressed
        String numLect = numero_lecteur_spin.getValue().toString();

        Lecteur lect = biblio.unLecteur(Integer.parseInt(numLect));
        if (lect == null) {
           numero_lecteur_notif_jlabel.setForeground(Color.red);
           numero_lecteur_notif_jlabel.setText("Ce lecteur n'existe pas.");
        } else {
                lecteur_global = lect;
                Set<Emprunt> emprunts = lecteur_global.tesEmprunts();
                if (emprunts.isEmpty()) {
                    numero_lecteur_notif_jlabel.setForeground(Color.red);
                    numero_lecteur_notif_jlabel.setText("Ce lecteur n'a emprunté aucun livre.");
                } else {
         
                    numero_lecteur_notif_jlabel.setForeground(Color.green);
                    numero_lecteur_notif_jlabel.setText("Lecteur: "+ lect.nom() + " " + lect.prenom());
                    numero_lecteur_spin.setEnabled(false);
                    verifierNumLecteur_button.setEnabled(false);
                    isbn_textfield.setEnabled(true);
                    rechercherISBN_button.setEnabled(true);
                }
        }
}//GEN-LAST:event_verifierNumLecteur_buttonMousePressed

    private void rechercherISBN_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercherISBN_buttonMousePressed
        // TODO add your handling code here:
        String isbn = isbn_textfield.getText();
        Ouvrage ouv = biblio.unOuvrage(isbn);
        if(ouv == null) {
            isbn_notif_jlabel.setForeground(Color.red);
            isbn_notif_jlabel.setText("Cet ouvrage n'existe pas.");
        } else {
            ouvrage_global = ouv;
            Set<Emprunt> emprunts = lecteur_global.tesEmprunts();
            int i = 0;
            for(Emprunt emp:emprunts){
                    Exemplaire exemp = emp.tonExemplaire();
                    if(exemp.tonOuvrage() == ouvrage_global && exemp.estEmprunte()) {
                        Integer num = exemp.numero();
                        numexemp_combobox.addItem(num);
                        i++;
                    }
             }
            // il n'y a pas d'exemplaire emprunté
            if(i==0){
                isbn_notif_jlabel.setForeground(Color.red);
                isbn_notif_jlabel.setText("Il n'y a pas d'exemplaire emprunté.");
            } else {
                 //on notifie
                 isbn_notif_jlabel.setForeground(Color.green);
                 isbn_notif_jlabel.setText("Titre de l'ouvrage: "+ ouv.titre());
                 //on (dés)active les contrôles nécessaires
                 isbn_textfield.setEnabled(false);
                 rechercherISBN_button.setEnabled(false);
                 numexemp_combobox.setEnabled(true);
                 valider_button.setEnabled(true);
            }
        }
}//GEN-LAST:event_rechercherISBN_buttonMousePressed

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed
        String numexp = String.valueOf(numexemp_combobox.getSelectedItem());
        Exemplaire exemp = ouvrage_global.unExemplaire(Integer.parseInt(numexp));
        if(exemp == null) {
            numexemp_notif_jlabel.setForeground(Color.red);
            numexemp_notif_jlabel.setText("Cet exemplaire n'existe pas .");
        } else {
            if(!exemp.estEmprunte()) {
                 numexemp_notif_jlabel.setForeground(Color.red);
                 numexemp_notif_jlabel.setText("Cet exemplaire n'est pas emprunté.");
            } else {

                  Set<Emprunt> mesEmprunts = lecteur_global.tesEmprunts();
                  // on selectionne le bon emprunt
                  for(Emprunt emp:mesEmprunts) {
                    Exemplaire ex = emp.tonExemplaire();
                    if(ex == exemp && ex.tonOuvrage() == ouvrage_global){
                          // l'exemplaire devient empruntable
                        exemp.modifierStatut(exemp.empruntable);
                        emp.finEmprunt(new GregorianCalendar());
                    }
                  }
                  this.dispose();
                  // Création de la vue
                  VueLecteurGUI vLectGUI = new VueLecteurGUI(parent_frame, true);
                  vLectGUI.menuPrincipal(lecteur_global);
                  // Suppression de la vue vLect comme Observatrice de l'objet lect
                  vLectGUI.elimineObserveur();
                  vLectGUI = null;  // suppression de la vue
            }

        }
}//GEN-LAST:event_valider_buttonMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrEmpruntExGUI dialog = new CtrEmpruntExGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel isbn_notif_jlabel;
    private javax.swing.JTextField isbn_textfield;
    private javax.swing.JLabel issn_label;
    private javax.swing.JLabel issn_label1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel numero_lect_label;
    private javax.swing.JLabel numero_lecteur_notif_jlabel;
    private javax.swing.JSpinner numero_lecteur_spin;
    private javax.swing.JComboBox numexemp_combobox;
    private javax.swing.JLabel numexemp_notif_jlabel;
    private javax.swing.JButton rechercherISBN_button;
    private javax.swing.JButton valider_button;
    private javax.swing.JButton verifierNumLecteur_button;
    // End of variables declaration//GEN-END:variables

}
