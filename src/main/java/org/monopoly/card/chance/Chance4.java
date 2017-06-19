package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance4 implements Card {
    
    private String description;
    
    public Chance4() {
        description = "Boete voor te snel rijden. Betaal € 1.500";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() - 1500);

    }

}
