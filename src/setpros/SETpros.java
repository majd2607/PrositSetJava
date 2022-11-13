/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpros;

/**
 *
 * @author Majd Tabessi
 */
public class SETpros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Enseignant e1 = new Enseignant(108, "tabessi", "majd");
        Enseignant e2 = new Enseignant(15, "wahch", "hama");
        Enseignant e3 = new Enseignant(5, "khouni", "stal");
        
        EspritHashSet EHS = new EspritHashSet();
        System.out.println("*************** HashSet ***************");
        EHS.ajouterEnseignant(e1);
        EHS.ajouterEnseignant(e2);
        EHS.ajouterEnseignant(e3);
        EHS.displayEnseignants();
        
        System.out.println("*************** TreeSet ***************");
        EspritTreeSet ETS = new EspritTreeSet();
        ETS.ajouterEnseignant(e1);
        ETS.ajouterEnseignant(e2);
        ETS.ajouterEnseignant(e3);
        ETS.displayEnseignants();
        
    }

}
