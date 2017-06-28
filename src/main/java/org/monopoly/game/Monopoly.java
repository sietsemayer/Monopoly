package org.monopoly.game;

 

 
import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.monopoly.card.CommunityChest;
import org.monopoly.game.queue.commonQueue;

public class Monopoly {
    private static Logger LOG = Logger.getLogger(Monopoly.class);
    
    public Board board;
    private commonQueue<Player> player;
    private Chance chance;
    private CommunityChest communityChest;
    private Collection <Integer> locationOfPlayers;
    
    
    public Monopoly(int numberOfPlayers) {

        LOG.info(numberOfPlayers + "number of players");
        board = new Board();
        player = new commonQueue<>();
        
        for (int i = 1; i <= numberOfPlayers; i++) {
            player.enqueue(new Player("Player "+i, board));
            
        }
        
        for(int i = 1; i <= numberOfPlayers; i++) {
            player.enqueue(new Player("PLLayer "+i, board));
        }
        
        for(int i = 0; i < player.getSize(); i++ ){
            
            Player temp = player.dequeue();
            
            Player[] otherPLayers = new Player[player.getSize()];
            
            for(int k = 0; k < player.getSize(); k++){
                otherPLayers[k] = player.dequeue();
                player.enqueue(otherPLayers[k]);
            }
            
            temp.setOtherPlayers(otherPLayers);
            player.enqueue(temp);          
        }
        
        chance = new Chance();
        chance.shuffle();
        communityChest = new CommunityChest();
        communityChest.shuffle();
        
        
        locationOfPlayers = new ArrayList<>();
        for(int i = 0; i < player.getSize(); i++){
            locationOfPlayers.add(0);
        }
      
        

    }

    public static void main(String[] args) {
        LOG.info("Starting the game!");
        new Monopoly(4);
    }
   
   
   

}
