package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance3 implements Card {
    
    private String description;
    
    public Chance3() {
        description = "U heeft een kruiswoordpuzzel gewonnen. U ontvangt € 10.000";
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
