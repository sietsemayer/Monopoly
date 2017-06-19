package org.monopoly.game.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest16 implements Card {
    
    private String description;
    
    public CommunityChest16() {
        description = "U ontvangt rente van 7% preferente aandelen : € 2.500,-";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setCurrentLocation(0);
        player.setMoney(player.getMoney() + 2500);

    }

}
