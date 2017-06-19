package org.monopoly.card.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest2 implements Card {
    
    private String description;
    
    public CommunityChest2() {
        description = "Betaal het ziekenhuis : € 10.000,-";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() -10000);

    }

}
