package org.monopoly.card;

import org.monopoly.game.Board;
import org.monopoly.game.Player;

public interface Card {
    
    public String getDescription();
    public void Act(Player player, Board board);

}
