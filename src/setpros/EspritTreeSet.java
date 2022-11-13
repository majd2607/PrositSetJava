/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpros;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Majd Tabessi
 */
public class EspritTreeSet implements GestionEnseignant {

    Set<Enseignant> treeSetEnseignant;

    public EspritTreeSet() {
        this.treeSetEnseignant = new TreeSet(new parID());
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        treeSetEnseignant.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return treeSetEnseignant.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : treeSetEnseignant) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        treeSetEnseignant.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(treeSetEnseignant);
    }

}
