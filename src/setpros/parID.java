/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setpros;

import java.util.Comparator;

/**
 *
 * @author Majd Tabessi
 */
public class parID implements Comparator<Enseignant>{

    @Override
    public int compare(Enseignant E1, Enseignant E2) {
        return E1.getId() - E2.getId();
    }
    
}
