package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance12 implements Card {
    
    private String description;
    
    public Chance12() {
        description = "U wordt aangeslagen voor straatgeld. € 4.000 per huis.  € 11.500 per hotel";
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
