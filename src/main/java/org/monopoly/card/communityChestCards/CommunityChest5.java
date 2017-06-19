package org.monopoly.card.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest5 implements Card {
    
    private String description;
    
    public CommunityChest5() {
        description = "Betaal uw verzekeringspremie : 5.000,-";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() - 5000);

    }

}
