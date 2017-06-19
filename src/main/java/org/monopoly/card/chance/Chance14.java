package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance14 implements Card {
    
    private String description;
    
    public Chance14() {
        description = "Ga verder naar start";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setCurrentLocation(0);
    }

}
