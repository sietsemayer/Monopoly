package org.monopoly.game.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest13 implements Card {
    
    private String description;
    
    public CommunityChest13() {
        description = "U overgissing van de bank in uw voordeel. U ontvangt € 20.000,-";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setCurrentLocation(0);
        player.setMoney(player.getMoney() + 20000);

    }

}
