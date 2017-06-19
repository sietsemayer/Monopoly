package org.monopoly.card.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest8 implements Card {
    
    private String description;
    
    public CommunityChest8() {
        description = "Lijfrente vervalt. U ontvangt € 10.000,-";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() + 10000);

    }

}
