package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance9 implements Card {
    
    private String description;
    
    public Chance9() {
        description = "Verlaat de gevangenis zonder te betalen";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        //SMA TODO : IMPLEMENT ACTION
    }

}
