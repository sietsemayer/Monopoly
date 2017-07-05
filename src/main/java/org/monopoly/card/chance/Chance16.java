package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance16 implements Card {
    
    private String description;
    
    public Chance16() {
        description = "Ga drie plaatsen terug";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {        
        player.setCurrentLocation(player.getCurrentLocation() -3);
    }

}
