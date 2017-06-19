package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance6 implements Card {
    
    private String description;
    
    public Chance6() {
        description = "Ga verder naar Kalverstraat";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setCurrentLocation(39);

    }

}
