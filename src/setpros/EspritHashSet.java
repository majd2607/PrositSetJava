/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpros;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Majd Tabessi
 */
public class EspritHashSet implements GestionEnseignant {

    Set<Enseignant> hashSetEnseignant;

    public EspritHashSet() {
        this.hashSetEnseignant = new HashSet<Enseignant>();
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        hashSetEnseignant.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hashSetEnseignant.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : hashSetEnseignant) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hashSetEnseignant.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(hashSetEnseignant);
    }

}
