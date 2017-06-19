package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance8 implements Card {
    
    private String description;
    
    public Chance8() {
        description = "Ga direct naar de gevangenis. Ga niet door start u ontvangt geen € 20.000";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setCurrentLocation(10);
        player.setInJail(true);

    }

}
