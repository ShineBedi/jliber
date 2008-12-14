/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrConsOuvrageGUI.java
 *
 * Created on 12 déc. 2008, 12:53:05
 */

package biblio;

/**
 *
 * @author ksz
 */
public class CtrConsOuvrageGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;

    /** Creates new form CtrConsOuvrageGUI */
    public CtrConsOuvrageGUI(java.awt.Frame parent, boolean modal) {
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
        isbn_textfield = new javax.swing.JTextField();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        isbn_label.setText("Numero ISBN :");

        annuler_button.setText("Annuler");
        annuler_button.setFocusable(false);
        annuler_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        annuler_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isbn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(annuler_button)
                .addGap(18, 18, 18)
                .addComponent(valider_button)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbn_label)
                    .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annuler_button)
                    .addComponent(valider_button))
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
        try {
            String isbn = isbn_textfield.getText();
            Ouvrage ouv = biblio.unOuvrage(isbn);
            if (ouv != null) {
                this.dispose();
                // Création de la vue
                VueOuvrageGUI vOuvGUI = new VueOuvrageGUI(parent_frame, true);
                vOuvGUI.menuPrincipal(ouv);
                // Suppression de la vue vLect comme Observatrice de l'objet lect
                vOuvGUI.elimineObserveur();
                vOuvGUI = null;  // suppression de la vue
            } else  {
                javax.swing.JOptionPane.showMessageDialog(null, "Erreur : Ouvrage inconnu");
            }
        } catch(java.lang.NumberFormatException Ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erreur de saisie dans les champs obligatoires");
        }
}//GEN-LAST:event_valider_buttonMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrConsOuvrageGUI dialog = new CtrConsOuvrageGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton valider_button;
    // End of variables declaration//GEN-END:variables

}
