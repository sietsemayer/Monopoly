package org.monopoly.card.communityChestCards;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class CommunityChest3 implements Card {
    
    private String description;
    
    public CommunityChest3() {
        description = "U heeft de tweede prijs in een schoonheidswedstrijd gewonnen. U ontvangt € 1.000,-";
    }

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() + 1000);

    }

}
