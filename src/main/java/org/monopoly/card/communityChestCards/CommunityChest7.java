package org.monopoly.card.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest7 implements Card {
    
    private String description;
    
    public CommunityChest7() {
        description = "Ga terug naar Dorpsstraat (Het Dorp)";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setCurrentLocation(1);
         

    }

}
