/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import magic.cards.AbstractCard;
import magic.cards.CreatureSpell;
import magic.cards.EnumLand;
import magic.cards.Land;
import magic.cards.Mana;
import magic.cards.NonCreatureSpell;
import magic.dao.CreatureSpellDAO;
import magic.dao.LandDAO;

/**
 *
 * @author maxime
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = (int)(Math.random()*(4+1));
        Object[] lands = EnumSet.allOf(EnumLand.class).toArray();
        Land card = new Land(lands[value].toString());
        int power[] = {3,3};
        List<Mana> costs = new ArrayList<>();
        costs.add(Mana.GREEN);costs.add(Mana.GREEN);
        CreatureSpell card2 = new CreatureSpell("Terrocorne kalonien",power, "Créature", "bête", costs, "");
        System.out.println(card.toString());
        System.out.println(card2.toString());
        List<Mana> costs2 = new ArrayList<>();
        costs2.add(Mana.RED);costs2.add(Mana.RED);costs2.add(Mana.UNDEFINED);costs2.add(Mana.UNDEFINED);
        NonCreatureSpell card3 = new NonCreatureSpell("Charge à voltage", "Ephémère",costs2,"");
        System.out.println(card3.toString());
        LandDAO landDAO = new LandDAO();
        landDAO.createEntity(card);
    }
    
}
