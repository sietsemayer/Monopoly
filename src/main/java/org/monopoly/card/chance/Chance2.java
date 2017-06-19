package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance2 implements Card {
    
    private String description;
    
    public Chance2() {
        description = "Reis naar station West. Indien u langs Start komt, ontvangt u € 20.000";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        //TODO SMA IMPLEMENT ACTION

    }

}
