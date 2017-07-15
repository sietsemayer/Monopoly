package org.monopoly.game;

 

 
import java.util.LinkedList;
import java.util.Queue;

import org.apache.log4j.Logger;

public class Monopoly {
    private static Logger LOG = Logger.getLogger(Monopoly.class);
    
    private Queue<Player> playersQueue = new LinkedList<>();
    private Player currentPlayer;
    
    /**
     * @param numberOfPlayers
     */
    public Monopoly(int numberOfPlayers) {
       Preparation preparation = new Preparation();
       preparation.PrepareGame(); 
       createPlayers();
       Play();
    }

    private void createPlayers() {
       
        playersQueue.add(new Player("Jan",1, "Boat"));
        playersQueue.add(new Player("Wim",2, "Car"));
        playersQueue.add(new Player("Henk",3, "Thimbleful"));
        playersQueue.add(new Player("Piet",4, "Boat"));
        
        
        getnextPlayer
        Check if player is in jail (if in jail check if player has a card an want to use it)
        throw dice
        move payer
        check if straat is available ( if street is used calculate price) and pay other player
        
        
        
        
        
        
    }
    
    private synchronized void Play() {

        this.currentPlayer = playersQueue.peek(); 
        LOG.info(this.currentPlayer.getName());
        
        if(playersQueue.peek().isInJail()){
            LOG.info("Player "+currentPlayer.getPlayerObject()+ "is in jail");
        }
        int steps = playersQueue.peek().roll();
        LOG.info("Last roll was double "+currentPlayer.LastRoleWasDouble());
        LOG.info("Last roll was "+ steps);
        
        
        
        move(steps);
        c
        
    }

    private void move(int steps) {
		int currentlocation = currentPlayer.getCurrentLocation();
		 if(playersQueue.peek().getCurrentLocation() + steps > 39){
		     moveOverStart();
	            currentPlayer.setCurrentLocation((currentlocation + steps) - 39);
	        } else {
	            currentPlayer.setCurrentLocation((currentlocation + steps));
	        }
		
		
	}
    private void moveOverStart(){
        LOG.info(currentPlayer.getName() + "receives € 20000");
        currentPlayer.setMoney(currentPlayer.getMoney() + 20000);
    }



	public static void main(String[] args) {
        LOG.info("Starting the game!");
        new Monopoly(4);
    }
   
   
   

}
