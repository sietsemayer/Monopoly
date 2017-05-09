package org.monopoly.game;

import org.apache.log4j.Logger;
import org.omg.CORBA.PUBLIC_MEMBER;

public class App {
    private static final Logger LOG = Logger.getLogger(App.class);
   
    public static void main(String[] args) {
        LOG.info("Hello World");
        System.out.println("Hello World");
       
        Board board =  new Board();
        Player player1 = new Player(board);
        Player player2 = new Player(board);
        Player player3 = new Player(board);
        Player player4 = new Player(board);
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
       play(player1, player2, board);
        
    }

    private static void play(Player player1, Player player2, Board board) {
       player1.rollDice();
       LOG.info("player1");
        
    

      
        
    }
    

}
