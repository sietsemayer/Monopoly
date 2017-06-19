package org.monopoly.card.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest10 implements Card {
    
    private String description;
    
    public CommunityChest10() {
        description = "Betaal € 1.000,- boete of neem een Kans kaart";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        //TODO SMA : IMPLEMENT THIS CARD!

    }

}
