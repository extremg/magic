/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.cards;

import java.util.List;

/**
 *
 * @author maxime
 */
public class Deck {
    protected int capacity;
    protected List<AbstractCard> cards;
    
    public Deck(int numberOfCard) {
        this.capacity = numberOfCard;
    }
    
    public void putCardInDeck(AbstractCard card) {
        this.cards.add(card);
    }
}
