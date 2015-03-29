/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.cards;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author maxime
 */
public class NonCreatureSpell extends Spell {
    
    //Constructeur spell non creature
    public NonCreatureSpell(String name, String type, List<Mana> costs, String... effect) {
        super.name = name;
        super.typeCard = type;
        super.costs = costs;
        super.effect.addAll(Arrays.asList(effect));
    }
    
    @Override
    public String toString() {
        return "Instanciation de la carte [ "+this.name+", "+this.costManaToString()+" "+this.typeCard+" ]";
    }
}
