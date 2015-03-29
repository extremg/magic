/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author maxime
 */
public abstract class Spell extends AbstractCard {
    protected List<Mana> costs = new ArrayList<>();
    protected List<String> effect = new ArrayList<>();

    public List<Mana> getCosts() {
        return costs;
    }

    public void setCosts(List<Mana> costs) {
        this.costs = costs;
    }

    public List<String> getEffect() {
        return effect;
    }

    public void setEffect(List<String> effect) {
        this.effect = effect;
    }
    
    protected String costManaToString() {
        StringBuilder res = new StringBuilder();
        if(this.costs.size() > 1) {
            this.costs.stream().forEach((mana) -> {
                res.append(mana).append(", ");
            });
        } else {
            res.append(this.costs.get(0));
        }
        return res.toString();
    }
    
    protected void updateCost(List<Mana> newCosts) {
        newCosts.stream().forEach((mana) -> {
            this.costs.add(mana);
        });
    }
}
