package biblio;
import java.awt.Color;
import java.lang.*;
import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrRendreExConsultableGUI.java
 *
 * Created on 12 déc. 2008, 22:10:01
 */

/**
 *
 * @author ksz
 */
public class CtrRendreExConsultableGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;

    /** Creates new form CtrRendreExConsultableGUI */
    public CtrRendreExConsultableGUI(java.awt.Frame parent, boolean modal) {
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

        isbn_label = new javax.swing.JLabel();
        numexp_label = new javax.swing.JLabel();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        isbn_textfield = new javax.swing.JTextField();
        verifierISBN_button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        isbn_notif_jlabel = new javax.swing.JLabel();
        exemplaires_combobox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rendre un exemplaire consultable");
        setResizable(false);

        isbn_label.setText("Numero ISBN :");

        numexp_label.setText("Numéro exemplaire :");

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
        valider_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider_buttonActionPerformed(evt);
            }
        });

        verifierISBN_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/find.png"))); // NOI18N
        verifierISBN_button.setText("Verifier");
        verifierISBN_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifierISBN_buttonMousePressed(evt);
            }
        });

        isbn_notif_jlabel.setText(" ");

        exemplaires_combobox.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(isbn_label)
                                .addGap(34, 34, 34)
                                .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(verifierISBN_button)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numexp_label, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exemplaires_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isbn_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbn_label)
                    .addComponent(verifierISBN_button)
                    .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isbn_notif_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numexp_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exemplaires_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void verifierISBN_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifierISBN_buttonMousePressed
        String isbn = isbn_textfield.getText();
        // Vérification la non existence de l'ouvrage / ISBN
        Ouvrage ouv = biblio.unOuvrage(isbn);
        if (ouv == null) {
            isbn_notif_jlabel.setForeground(Color.red);
            isbn_notif_jlabel.setText("L'ouvrage n'existe pas dans la base.");
        } else {
            Enumeration enumEx = ouv.enumExemplaires();

            if  (enumEx.hasMoreElements()) {
                int i = 0;
                while (enumEx.hasMoreElements()) {
                     Exemplaire exemp = (Exemplaire) enumEx.nextElement();
                     if(exemp.estNonDisponible()){
                         Integer num = exemp.numero();
                         exemplaires_combobox.addItem(num);
                         i++;
                     }
                }
                if(i!=0){
                     //on notifie
                    isbn_notif_jlabel.setForeground(Color.green);
                    isbn_notif_jlabel.setText("Titre de l'ouvrage: "+ ouv.titre());
                    //on (dés)active les contrôles nécessaires
                    isbn_textfield.setEnabled(false);
                    verifierISBN_button.setEnabled(false);
                    valider_button.setEnabled(true);
                    exemplaires_combobox.setEnabled(true);
                } else {
                    isbn_notif_jlabel.setForeground(Color.red);
                    isbn_notif_jlabel.setText("Il n'y pas d'exemplaire pouvant etre mis en consultation.");
                }
            // TODO on remplit la liste
            } else {
                isbn_notif_jlabel.setForeground(Color.red);
                isbn_notif_jlabel.setText("Cet ouvrage n'a pas d'exemplaires.");
            }

            
        }
}//GEN-LAST:event_verifierISBN_buttonMousePressed

    private void valider_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider_buttonActionPerformed
        try {

            String isbn = isbn_textfield.getText();

            Ouvrage ouv = biblio.unOuvrage(isbn);
            String numexp = String.valueOf(exemplaires_combobox.getSelectedItem());
            if (ouv != null) {
                    Exemplaire exemp = ouv.unExemplaire(Integer.parseInt(numexp));
                    // Vérification la non existence de l'ouvrage / ISBN

                    if (exemp != null) {

                            // l'exemplaire est actuellement non disponible
                            if (exemp.estNonDisponible())
                            {
                                biblio.modifStatutExemplaire(exemp,exemp.enConsultation);
                                this.dispose();
                                VueOuvrageGUI vOuvGUI = new VueOuvrageGUI(parent_frame, true);
                                vOuvGUI.menuPrincipal(ouv);
                                vOuvGUI.elimineObserveur();
                                vOuvGUI = null;
                            } else {
                                // l'exemplaire est déjà en conseltable en bibliothèque
                                if (exemp.estEnConsultation())  javax.swing.JOptionPane.showMessageDialog(null, "L'exemplaire est déjà en consultation.");

                                // l'exemplaire est actuellement empruntable
                                else javax.swing.JOptionPane.showMessageDialog(null, "Un exemplaire empruntable ne peut pas devenir directement consultable en bibliothéque.");
                            }
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(null, "Cet exemplaire n'existe pas dans la base");
                    }
              } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Cet ouvrage n'existe pas dans la base");
              }
         } catch (java.lang.NumberFormatException e) {
             javax.swing.JOptionPane.showMessageDialog(null, "Erreur de saisie dans les champs obligatoires");
         }
    }//GEN-LAST:event_valider_buttonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrRendreExConsultableGUI dialog = new CtrRendreExConsultableGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox exemplaires_combobox;
    private javax.swing.JLabel isbn_label;
    private javax.swing.JLabel isbn_notif_jlabel;
    private javax.swing.JTextField isbn_textfield;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel numexp_label;
    private javax.swing.JButton valider_button;
    private javax.swing.JButton verifierISBN_button;
    // End of variables declaration//GEN-END:variables

}
