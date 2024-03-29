package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance15 implements Card {
    
    private String description;
    
    public Chance15() {
        description = "Betaal schoolgeld � 15.000";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() - 15000);
    }

}
