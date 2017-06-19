package org.monopoly.game.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest14 implements Card {
    
    private String description;
    
    public CommunityChest14() {
        description = "GA DIRECT NAAR DE GEVANGENIS/ GA NIET DOOR START. U ONTVANGT GEEN €20.000!";
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
