/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.cards;

import java.util.ArrayList;

/**
 *
 * @author maxime
 */
public class Land extends AbstractCard {
    
    public Land(String name) {
        super.name = name;
        super.typeCard = "Terrain de base";
        super.ssTypeCard = new ArrayList<>();
        ssTypeCard.add(name);
    }
    
    @Override
    public String toString() {
       return "Instanciation de la carte [ "+this.name+", type : "+typeCard+" "+ssTypeCard.get(0)+" ]"; 
    }
}
