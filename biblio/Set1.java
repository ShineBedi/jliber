
package biblio;

import java.lang.*;
import java.util.*;

public class Set1 extends Vector {

/******************************************************************************
Classe ENSEMBLE :

Methode "addElement" redefinie pour assurer l'unicite des elements de l'ensemble

Operations ensemblistes : intersection, union, difference
*******************************************************************************/

//****************************
//     Constructeur
//****************************
public Set1() {}

// ***************************
//      Methodes Publiques
// ***************************
public void addElement( Object elem)  {
// ajout de l'element elem si l'ensemble this ne le contient pas

if (!this.contains(elem))
        super.addElement(elem);
} //addElement

//****************************
public Set1 intersect (Set1 ens) {
// Intersection de l'ensemble this avec l'ensemble ens

Set1 result = new Set1();
Set1 to_remove = new Set1();

if (!this.isEmpty() & !ens.isEmpty())  {
        // copie de l'ensemble this dans result
        result = (Set1) this.clone();

        for (int i =0; i <result.size() ; i++)  {
                Object elem1 = (Object) result.elementAt(i);
                if (!ens.contains(elem1)) to_remove.addElement(elem1);
         }
}

for (int i=0; i<to_remove.size(); i++)
        result.removeElement(to_remove.elementAt(i));

return result ;

} // Fin intersect

//****************************
public Set1 union (Set1 ens) {
// Union de l'ensemble this avec l'ensemble ens

Set1 result = new Set1();

if (this.isEmpty())
        // copie de l'ensemble ens dans result
        result = (Set1) ens.clone();
else
        if (ens.isEmpty())
                // copie de l'ensemble this dans result
                result = (Set1) this.clone();
        else {
                // copie de l'ensemble this dans result
                result = (Set1) this.clone();

                for (int i1 =0; i1 <ens.size() ; i1++)  {
                        Object elem1 = (Object) ens.elementAt(i1);
                        if (!result.contains(elem1)) result.addElement(elem1);
                    }
        }
return result ;
}  // Fin union

//****************************
public Set1 diff (Set1 ens) {
// Difference entre l'ensemble this et l'ensemble ens

Set1 result = new Set1();
Set1 to_remove = new Set1();

if (!this.isEmpty())  {
        // copie de l'ensemble this dans result
        result = (Set1) this.clone();

        for (int i1 =0; i1 <result.size() ; i1++)  {
                Object elem1 = (Object) result.elementAt(i1);
                if (ens.contains(elem1)) to_remove.addElement(elem1);
        }
}

for (int i=0; i<to_remove.size(); i++)
        result.removeElement(to_remove.elementAt(i));

return result ;
}  // Fin diff

}  // FinClasse Set1

