/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CtrNouvOuvrageGUI.java
 *
 * Created on 12 déc. 2008, 11:01:06
 */

package biblio;
import java.awt.Color;
import java.lang.*;
import java.util.*;
/**
 *
 * @author ksz
 */
public class CtrNouvOuvrageGUI extends javax.swing.JDialog {

    private Bibliotheque biblio;
    private java.awt.Frame parent_frame;
    
    /** Creates new form CtrNouvOuvrageGUI */
    public CtrNouvOuvrageGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        parent_frame = parent;
        initComponents();
        this.setLocationRelativeTo(this.getParent());
    }

    public void menuPrincipal(Bibliotheque bib) {
        biblio = bib;
        this.rafraichirListeAuteur();
         // ajout des motsCles
        Enumeration enumMotsCles = biblio.enumMotsCles();
        Vector<String> mesMotsCles = new Vector<String>();
        if (enumMotsCles.hasMoreElements()) {
            while (enumMotsCles.hasMoreElements()) {
                MotCle mc = (MotCle) enumMotsCles.nextElement();
                mesMotsCles.add(mc.motCle());
            }
        }
        motscles_list.setListData(mesMotsCles);
        this.setVisible(true);
    }

    public void rafraichirListeAuteur() {

        // ajout des Auteurs
        Enumeration enumAuteurs = biblio.enumAuteurs();
        Vector<String> mesAuteurs = new Vector<String>();
        if (enumAuteurs.hasMoreElements()) {
            while (enumAuteurs.hasMoreElements()) {
                Auteur aut = (Auteur) enumAuteurs.nextElement();
                mesAuteurs.add(aut.nom()+" "+aut.prenom());
            }
        }
        auteurs_list.setListData(mesAuteurs);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();
        auteur_label = new javax.swing.JLabel();
        titre_label = new javax.swing.JLabel();
        editeur_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        titre_textfield = new javax.swing.JTextField();
        editeur_textfield = new javax.swing.JTextField();
        isbn_label = new javax.swing.JLabel();
        isbn_textfield = new javax.swing.JTextField();
        verifier_button = new javax.swing.JButton();
        isbn_notif_label = new javax.swing.JLabel();
        day_jspinner = new javax.swing.JSpinner();
        month_jspinner = new javax.swing.JSpinner();
        year_jspinner = new javax.swing.JSpinner();
        sep_label2 = new javax.swing.JLabel();
        sep_label3 = new javax.swing.JLabel();
        titre_notif_jlabel = new javax.swing.JLabel();
        auteur_notif_jlabel = new javax.swing.JLabel();
        editeur_notif_jlabel = new javax.swing.JLabel();
        motscles_label = new javax.swing.JLabel();
        motscles_notif_jlabel = new javax.swing.JLabel();
        ajouter_auteurs_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        motscles_list = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        auteurs_list = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        supprimer_auteur_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout d'un ouvrage");
        setResizable(false);

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

        auteur_label.setText("Auteur(s) :");

        titre_label.setText("Titre :");

        editeur_label.setText("Editeur :");

        date_label.setText("Date : (jj/mm/aaaa)");

        titre_textfield.setEnabled(false);

        editeur_textfield.setEnabled(false);

        isbn_label.setText("Numero ISBN :");

        verifier_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/find.png"))); // NOI18N
        verifier_button.setText("Vérifier");
        verifier_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verifier_buttonMousePressed(evt);
            }
        });

        isbn_notif_label.setText("Saisissez un numéro ISBN.");

        day_jspinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        day_jspinner.setEnabled(false);

        month_jspinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        month_jspinner.setEnabled(false);

        year_jspinner.setModel(new javax.swing.SpinnerNumberModel(2008, 0, 9999, 1));
        year_jspinner.setEnabled(false);

        sep_label2.setText("/");

        sep_label3.setText("/");

        titre_notif_jlabel.setText(" ");

        auteur_notif_jlabel.setText(" ");

        editeur_notif_jlabel.setText(" ");

        motscles_label.setText("Mot(s) clé(s) :");

        motscles_notif_jlabel.setText(" ");

        ajouter_auteurs_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/plus_icon.gif"))); // NOI18N
        ajouter_auteurs_button.setText("Ajouter");
        ajouter_auteurs_button.setEnabled(false);
        ajouter_auteurs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_auteurs_buttonActionPerformed(evt);
            }
        });

        motscles_list.setEnabled(false);
        jScrollPane2.setViewportView(motscles_list);

        auteurs_list.setEnabled(false);
        jScrollPane1.setViewportView(auteurs_list);

        supprimer_auteur_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblio/minus_icon.png"))); // NOI18N
        supprimer_auteur_button.setText("Supprimer");
        supprimer_auteur_button.setEnabled(false);
        supprimer_auteur_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_auteur_buttonActionPerformed(evt);
            }
        });

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
                                .addComponent(isbn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isbn_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                    .addComponent(isbn_notif_label)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(auteur_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(titre_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                    .addComponent(titre_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(auteur_notif_jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verifier_button, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(supprimer_auteur_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ajouter_auteurs_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(date_label)
                        .addGap(24, 24, 24)
                        .addComponent(day_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep_label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep_label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(302, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motscles_label, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editeur_label))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editeur_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motscles_notif_jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editeur_notif_jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {auteur_notif_jlabel, editeur_notif_jlabel, editeur_textfield, isbn_notif_label, isbn_textfield, jScrollPane1, jScrollPane2, motscles_notif_jlabel, titre_notif_jlabel, titre_textfield});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {auteur_label, date_label, editeur_label, isbn_label, motscles_label, titre_label});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbn_label)
                    .addComponent(isbn_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifier_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isbn_notif_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titre_label)
                    .addComponent(titre_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titre_notif_jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(auteur_label)
                        .addGap(31, 31, 31)
                        .addComponent(ajouter_auteurs_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supprimer_auteur_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(auteur_notif_jlabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editeur_textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editeur_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(editeur_notif_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motscles_label)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(motscles_notif_jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_label)
                    .addComponent(day_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_jspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sep_label2)
                    .addComponent(sep_label3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annuler_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_annuler_buttonMousePressed

    private void verifier_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifier_buttonMousePressed
        // TODO add your handling code here:
        String isbn = isbn_textfield.getText();
        // Vérification la non existence de l'ouvrage / ISBN
        Ouvrage ouv = biblio.unOuvrage(isbn);
        if (isbn.length()==0){
            isbn_notif_label.setForeground(Color.red);
            isbn_notif_label.setText("Veuillez saisir un ISBN valide.");
        } else {
        if (ouv != null) {
            isbn_notif_label.setForeground(Color.red);
            isbn_notif_label.setText("Cet ouvrage existe déjà dans la base !");
        } else {
            isbn_notif_label.setForeground(Color.green);
            isbn_notif_label.setText("Cet ouvrage n'existe pas, il peut être créé.");

            isbn_textfield.setEnabled(false);
            verifier_button.setEnabled(false);
            titre_textfield.setEnabled(true);
            auteurs_list.setEnabled(true);
            ajouter_auteurs_button.setEnabled(true);
            motscles_list.setEnabled(true);
            editeur_textfield.setEnabled(true);
            day_jspinner.setEnabled(true);
            month_jspinner.setEnabled(true);
            year_jspinner.setEnabled(true);
            valider_button.setEnabled(true);
        }
        }
    }//GEN-LAST:event_verifier_buttonMousePressed

    private void ajouter_auteurs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_auteurs_buttonActionPerformed
       CtrNouvAuteurOuvGUI ctr = new CtrNouvAuteurOuvGUI(parent_frame, true);
        ctr.menuPrincipal(biblio, this);
        ctr = null;   // suppression du controleur
    }//GEN-LAST:event_ajouter_auteurs_buttonActionPerformed

    private void valider_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider_buttonActionPerformed
        titre_notif_jlabel.setText(" ");
        auteur_notif_jlabel.setText(" ");
        editeur_notif_jlabel.setText(" ");
        motscles_notif_jlabel.setText(" ");

        // Saisie de toutes les infos de l'ouvrage

        String isbn = isbn_textfield.getText();
        Ouvrage ouv = biblio.unOuvrage(isbn);

        String titre = titre_textfield.getText();

        // on recupere la liste des auteurs selectionnées
        int selectionsAuteurs[] = auteurs_list.getSelectedIndices();
        Object selectedValuesAuteurs[] = auteurs_list.getSelectedValues();
        Set<Auteur> auteurs = new HashSet<Auteur>();
        for (int i = 0, n = selectionsAuteurs.length; i < n; i++) {
            String nomprenom = (String)selectedValuesAuteurs[i];
            nomprenom = nomprenom.replace(" ", "");
            Auteur aut = biblio.unAuteur(nomprenom);
            auteurs.add(aut);
        }

        // on récupère la liste des mots clés selectionnées
        int selectionsMotsCles[] = motscles_list.getSelectedIndices();
        Object selectedValuesMotsCles[] =motscles_list.getSelectedValues();
        Set<MotCle> motsCles = new HashSet<MotCle>();
        for (int i = 0, n = selectionsMotsCles.length; i < n; i++) {
            String motcle = (String)selectedValuesMotsCles[i];
            motcle = motcle.replace(" ", "");
            MotCle mc = biblio.unMotCle(motcle);
            motsCles.add(mc);
        }

        String editeur = editeur_textfield.getText();

        int day = Integer.parseInt(day_jspinner.getValue().toString());
        int month = Integer.parseInt(month_jspinner.getValue().toString());
        int year = Integer.parseInt(year_jspinner.getValue().toString());

        if (titre.isEmpty() || selectionsAuteurs.length == 0 || selectionsMotsCles.length==0 || editeur.isEmpty()){
            if (titre.isEmpty()){
                titre_notif_jlabel.setForeground(Color.red);
                titre_notif_jlabel.setText("Vous devez saisir un titre.");
            }
            if(selectionsAuteurs.length == 0) {
                auteur_notif_jlabel.setForeground(Color.red);
                auteur_notif_jlabel.setText("Vous devez sélectionner au moins un auteur.");
            }
            if (editeur.isEmpty()) {
                editeur_notif_jlabel.setForeground(Color.red);
                editeur_notif_jlabel.setText("Vous devez spécifier un éditeur.");
            }
            if(selectionsMotsCles.length==0) {
                motscles_notif_jlabel.setForeground(Color.red);
                motscles_notif_jlabel.setText("Vous devez sélectionner au moins un mot clé.");
            }

        } else {

            if (ouv == null) {
                 try {
                    java.util.GregorianCalendar dateEdition = new java.util.GregorianCalendar(year, month-1, day);
                    ouv = biblio.nouvelOuvrage(isbn, titre, editeur, dateEdition, auteurs, motsCles);
                    this.dispose();
                    // Création de la vue
                    VueOuvrageGUI vOuvGUI = new VueOuvrageGUI(parent_frame, true);
                    vOuvGUI.menuPrincipal(ouv);
                    vOuvGUI.elimineObserveur();
                    vOuvGUI = null;
                } catch( java.lang.NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(null, "La date doit etre de la forme : dd/mm/yy");
                }
            } else  {
               javax.swing.JOptionPane.showMessageDialog(null, "Cet ouvrage existe déjà dans la base");
            }
        }
    }//GEN-LAST:event_valider_buttonActionPerformed

    private void supprimer_auteur_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_auteur_buttonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_supprimer_auteur_buttonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CtrNouvOuvrageGUI dialog = new CtrNouvOuvrageGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ajouter_auteurs_button;
    private javax.swing.JButton annuler_button;
    private javax.swing.JLabel auteur_label;
    private javax.swing.JLabel auteur_notif_jlabel;
    private javax.swing.JList auteurs_list;
    private javax.swing.JLabel date_label;
    private javax.swing.JSpinner day_jspinner;
    private javax.swing.JLabel editeur_label;
    private javax.swing.JLabel editeur_notif_jlabel;
    private javax.swing.JTextField editeur_textfield;
    private javax.swing.JLabel isbn_label;
    private javax.swing.JLabel isbn_notif_label;
    private javax.swing.JTextField isbn_textfield;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner month_jspinner;
    private javax.swing.JLabel motscles_label;
    private javax.swing.JList motscles_list;
    private javax.swing.JLabel motscles_notif_jlabel;
    private javax.swing.JLabel sep_label2;
    private javax.swing.JLabel sep_label3;
    private javax.swing.JButton supprimer_auteur_button;
    private javax.swing.JLabel titre_label;
    private javax.swing.JLabel titre_notif_jlabel;
    private javax.swing.JTextField titre_textfield;
    private javax.swing.JButton valider_button;
    private javax.swing.JButton verifier_button;
    private javax.swing.JSpinner year_jspinner;
    // End of variables declaration//GEN-END:variables

}
