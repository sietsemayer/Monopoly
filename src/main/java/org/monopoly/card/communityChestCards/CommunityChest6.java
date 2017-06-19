package org.monopoly.game.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest6 implements Card {
    
    private String description;
    
    public CommunityChest6() {
        description = "Restitutie van inkomsten belasting. U ontvangt € 2.000,-";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setCurrentLocation(0);
        player.setMoney(player.getMoney() + 2000);

    }

}
