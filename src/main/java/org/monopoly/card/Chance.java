package org.monopoly.card;

import org.monopoly.card.chance.Chance1;
import org.monopoly.game.queue.commonQueue;

public class Chance {
    
    private commonQueue<Card> chanceCardDeck;
    
    public Chance() {
        chanceCardDeck = new commonQueue<>();
        
        chanceCardDeck.enque(new Chance1());
    }
    
    

}
