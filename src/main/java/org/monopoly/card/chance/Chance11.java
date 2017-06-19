package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance11 implements Card {
    
    private String description;
    
    public Chance11() {
        description = "Opgebracht wegens dronkenschap. Betaal € 2.000 boete";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        player.setMoney(player.getMoney() - 2000);

    }

}
