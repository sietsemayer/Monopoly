package org.monopoly.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.monopoly.card.Card;
import org.monopoly.card.Chance;

public class ShuffleCards {
    private static Logger LOG = Logger.getLogger("chanceCardDeck");
    
    private ShuffleCards(){
        //Empty constructor 
        //this class is not meant to be instantiated!
    }
    
    public static void shuffle(List<Card> deck) {
        if(deck instanceof Chance){
            LOG.info("The chance Cards are being shuffled");
        } else {
            LOG.info("The communityChest Cards are being shuffled");
        }
        
        Collection<Card> tempCardList = new ArrayList<>();
        while (!deck.isEmpty()) {
            int locationInDeck = (int)(Math.random() * deck.size());
            tempCardList.add(deck.get(locationInDeck));
            deck.remove(locationInDeck);            
        }
        deck = (List<Card>)tempCardList;
       
    }
    
}
