package org.monopoly.card.chance;

import org.monopoly.card.Card;
import org.monopoly.game.Board;
import org.monopoly.game.Player;

public class Chance10 implements Card {
    
    private String description;
    
    public Chance10() {
        description = "Ga verder naar Barteljorisstraat. Indien u langs Start komt ontvangt u € 20.000";
    }

    @Override
    public String getDescription() {        
        return description;
    }

    @Override
    public void Act(Player player, Board board) {
        //SMA TODO IMPLEMENT

    }

}
