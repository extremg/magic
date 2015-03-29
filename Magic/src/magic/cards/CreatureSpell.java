/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.cards;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author maxime
 */
public class CreatureSpell extends Spell implements Serializable {
    protected String power;
    protected String toughness;
    
    //Constructeur creature
    public CreatureSpell(String name, int[] power, String type, String ssType, List<Mana> costs, String... effects) {
        super.name = name;
        this.power = String.valueOf(power[0]);
        this.toughness = String.valueOf(power[1]);
        super.typeCard = type;
        super.ssTypeCard.add(ssType);
        this.costs = costs;
        super.effect.addAll(Arrays.asList(effects));
    }

    public String getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = String.valueOf(power);
    }

    protected String ptToString() {
        return this.power+"|"+this.toughness;
    }
    
    @Override
    public String toString() {
        return "Instanciation de la carte [ "+this.name+", "+this.costManaToString()+" "+this.typeCard+" : "+this.ssTypeCard+" "+this.ptToString()+" ]";
    }
}
