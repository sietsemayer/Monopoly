package org.monopoly.card.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest4 implements Card {
    
    private String description;
    
    public CommunityChest4() {
        description = "U bent jarig en ontvangt van iedere speler € 1.000,-";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() + 0);
        //SMA TODO COLLECT MONEY!!
    }

}
