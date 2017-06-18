package org.monopoly.game.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest9 implements Card {
    
    private String description;
    
    public CommunityChest9() {
        description = "Verlaat de gevangenis zonder te betalen.";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        //TODO SMA: HOW TO IMPLEMENT THIS..

    }

}
