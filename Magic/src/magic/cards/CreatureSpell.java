/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.cards;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author maxime
 */
public class CreatureSpell extends Spell {
    protected int[] power = new int[2];
    
    //Constructeur creature
    public CreatureSpell(String name, int[] power, String type, String ssType, List<Mana> costs, String... effects) {
        super.name = name;
        this.power = power;
        super.typeCard = type;
        super.ssTypeCard.add(ssType);
        this.costs = costs;
        super.effect.addAll(Arrays.asList(effects));
    }

    public int[] getPower() {
        return power;
    }

    public void setPower(int[] power) {
        this.power = power;
    }

    protected String powerToString() {
        return this.power[0]+"|"+this.power[1];
    }
    
    @Override
    public String toString() {
        return "Instanciation de la carte [ "+this.name+", "+this.costManaToString()+" "+this.typeCard+" : "+this.ssTypeCard+" "+this.powerToString()+" ]";
    }
}
