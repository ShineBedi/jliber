package biblio;

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
        numexemp_textfield = new javax.swing.JTextField();
        verifierNum_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rendre un exemplaire consultable");
        setResizable(false);

        isbn_label.setText("Numero ISBN :");

        numexp_label.setText("Numéro exemplaire :");

        annuler_button.setText("Annuler");
        annuler_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                annuler_buttonMousePressed(evt);
            }
        });

        valider_button.setText("Valider");
        valider_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valider_buttonMousePressed(evt);
            }
        });

        verifierISBN_button.setText("Verifier");
        verifierISBN_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifierISBN_buttonMousePressed(evt);
            }
        });

        verifierNum_button.setText("Verifier");
        verifierNum_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifierNum_buttonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(isbn_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numexp_label, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numexemp_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(verifierNum_button, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(verifierISBN_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numexp_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numexemp_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifierNum_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed
        // TODO add your handling code here:
        // Vérification la non existence de l'ouvrage / ISBN
        try {

            String isbn = isbn_textfield.getText();

            Ouvrage ouv = biblio.unOuvrage(isbn);
            String numexp = numexemp_textfield.getText();
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
}//GEN-LAST:event_valider_buttonMousePressed

    private void verifierISBN_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifierISBN_buttonMousePressed
        // TODO add your handling code here:
        String isbn = isbn_textfield.getText();
        // Vérification la non existence de l'ouvrage / ISBN
        Ouvrage ouv = biblio.unOuvrage(isbn);
        if (ouv == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Cet ouvrage n'existe pas dans la base");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Cet ouvrage existe dans la base on peut donc ajouter un exemplaire");
        }
}//GEN-LAST:event_verifierISBN_buttonMousePressed

    private void verifierNum_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifierNum_buttonMousePressed
        // TODO add your handling code here:
          // TODO add your handling code here:
        try {
             String isbn = isbn_textfield.getText();
            // Vérification la non existence de l'ouvrage / ISBN
            Ouvrage ouv = biblio.unOuvrage(isbn);
            if (ouv == null) {
                javax.swing.JOptionPane.showMessageDialog(null, "Cet ouvrage n'existe pas dans la base");
            } else {
                String numexp = numexemp_textfield.getText();
                  // Vérification la non existence de l'ouvrage / ISBN
                Exemplaire exemp = ouv.unExemplaire(Integer.parseInt(numexp));
                if (exemp  == null) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Cet exemplaire n'existe pas dans la base");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Cet exemplaire existe dans la base on peut donc le modifier");
                }
            }
        } catch (java.lang.NumberFormatException e) {
             javax.swing.JOptionPane.showMessageDialog(null, "Erreur de saisie dans les champs obligatoires");
         }
}//GEN-LAST:event_verifierNum_buttonMousePressed

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
    private javax.swing.JLabel isbn_label;
    private javax.swing.JTextField isbn_textfield;
    private javax.swing.JTextField numexemp_textfield;
    private javax.swing.JLabel numexp_label;
    private javax.swing.JButton valider_button;
    private javax.swing.JButton verifierISBN_button;
    private javax.swing.JButton verifierNum_button;
    // End of variables declaration//GEN-END:variables

}
