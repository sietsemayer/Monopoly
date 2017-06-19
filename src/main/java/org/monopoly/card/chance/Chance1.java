package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance1 implements Card {
    
    private String description;
    
    public Chance1() {
        description = "Repareer uw huizen. Betaal voor elk huis € 2.500. Betaal voor elk hotel € 10.000";
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
