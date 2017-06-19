package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance7 implements Card {
    
    private String description;
    
    public Chance7() {
        description = "Uw bouwverzekering vervalt. U ontvangt € 15.000";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() + 15000);

    }

}
