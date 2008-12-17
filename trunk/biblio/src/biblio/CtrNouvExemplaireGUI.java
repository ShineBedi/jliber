/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrNouvExemplaireGUI.java
 *
 * Created on 12 déc. 2008, 15:37:28
 */

package biblio;
import javax.swing.* ;
import java.awt.*;
import java.util.GregorianCalendar;
/**
 *
 * @author ksz gardaud
 */
public class CtrNouvExemplaireGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;
    
    /** Creates new form CtrNouvExemplaireGUI */
    public CtrNouvExemplaireGUI(java.awt.Frame parent, boolean modal) {
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
        verifier_button = new javax.swing.JButton();
        date_label = new javax.swing.JLabel();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        isbn_notif_jlabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        day_jspinner = new javax.swing.JSpinner();
        month_jspinner = new javax.swing.JSpinner();
        year_jspinner = new javax.swing.JSpinner();
        sep_label2 = new javax.swing.JLabel();
        sep_label3 = new javax.swing.JLabel();
        date_notif_jlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajouter un exemplaire");
        setResizable(false);

        isbn_label.setText("Numero ISBN :");

        verifier_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/find.png"))); // NOI18N
        verifier_button.setText("Verifier");
        verifier_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifier_buttonMousePressed(evt);
            }
        });

        date_label.setText("Date : (jj/mm/aaaa)");

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

        isbn_notif_jlabel.setText(" ");

        day_jspinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        day_jspinner.setEnabled(false);

        month_jspinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        month_jspinner.setEnabled(false);

        year_jspinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9999, 1));
        year_jspinner.setEnabled(false);

        sep_label2.setText("/");

        sep_label3.setText("/");

        date_notif_jlabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isbn_label)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isbn_notif_jlabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verifier_button, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(date_label, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_notif_jlabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(day_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep_label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sep_label3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifier_button)
                    .addComponent(isbn_label))
                .addGap(12, 12, 12)
                .addComponent(isbn_notif_jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sep_label2)
                    .addComponent(month_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sep_label3)
                    .addComponent(year_jspinner)
                    .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_notif_jlabel)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifier_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifier_buttonMousePressed
        // TODO add your handling code here:
        String isbn = isbn_textfield.getText();
        // Vérification la non existence de l'ouvrage / ISBN
        Ouvrage ouv = biblio.unOuvrage(isbn);
        if (ouv == null) {
            isbn_notif_jlabel.setForeground(Color.red);
            isbn_notif_jlabel.setText("L'ISBN saisit n'existe pas dans la base.");
        } else {
            // On confirme que l'on peut créer l'ouvrage.
            isbn_notif_jlabel.setForeground(Color.green);
            isbn_notif_jlabel.setText("Titre de l'ouvrage :"+ouv.titre());
            //On active les champs à remplir.
            verifier_button.setEnabled(false);
            isbn_textfield.setEnabled(false);
            valider_button.setEnabled(true);
            day_jspinner.setEnabled(true);
            month_jspinner.setEnabled(true);
            year_jspinner.setEnabled(true);
            //On met la date au minimum
            GregorianCalendar date;
            date=ouv.dateEdition(); //on récupère la date

           int day=date.get(GregorianCalendar.DAY_OF_MONTH);//on la parse
           int month=date.get(GregorianCalendar.MONTH)+1;
           int year=date.get(GregorianCalendar.YEAR);

            day_jspinner.setValue(day); //on l'assigne aux spinners
            month_jspinner.setValue(month);
            year_jspinner.setValue(year);

            SpinnerNumberModel model = (SpinnerNumberModel) year_jspinner.getModel();//on modifie le modèle (pour mettre à jour l'année minimum)
            model.setMinimum(year);
            year_jspinner.setModel(model);
        }
}//GEN-LAST:event_verifier_buttonMousePressed

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void valider_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_buttonMousePressed
        // TODO add your handling code here:
        // Vérification la non existence de l'ouvrage / ISBN
        String isbn = isbn_textfield.getText();
        Ouvrage ouv = biblio.unOuvrage(isbn);
        if (ouv != null) {
                int day = Integer.parseInt(day_jspinner.getValue().toString());
                int month = Integer.parseInt(month_jspinner.getValue().toString());
                int year = Integer.parseInt(year_jspinner.getValue().toString());


                java.util.GregorianCalendar dateRecep = new java.util.GregorianCalendar(year, month-1, day);
                 if (ouv.verifDate(dateRecep)) {
                    biblio.nouvelExemplaire(ouv,dateRecep);
                    this.dispose();
                    // Création de la vue
                    VueOuvrageGUI vOuvGUI = new VueOuvrageGUI(parent_frame, true);
                    vOuvGUI.menuPrincipal(ouv);
                    vOuvGUI.elimineObserveur();
                    vOuvGUI = null;
                 } else  {
                    date_notif_jlabel.setForeground(Color.red);
                    date_notif_jlabel.setText("La date doit être postérieure à la date d'édition.");
                }
            }
}//GEN-LAST:event_valider_buttonMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrNouvExemplaireGUI dialog = new CtrNouvExemplaireGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel date_notif_jlabel;
    private javax.swing.JSpinner day_jspinner;
    private javax.swing.JLabel isbn_label;
    private javax.swing.JLabel isbn_notif_jlabel;
    private javax.swing.JTextField isbn_textfield;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner month_jspinner;
    private javax.swing.JLabel sep_label2;
    private javax.swing.JLabel sep_label3;
    private javax.swing.JButton valider_button;
    private javax.swing.JButton verifier_button;
    private javax.swing.JSpinner year_jspinner;
    // End of variables declaration//GEN-END:variables

}
