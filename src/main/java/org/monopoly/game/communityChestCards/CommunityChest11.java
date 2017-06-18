package org.monopoly.game.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest11 implements Card {
    
    private String description;
    
    public CommunityChest11() {
        description = "Betaal uw doktersrekening € 5.000,-";
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
