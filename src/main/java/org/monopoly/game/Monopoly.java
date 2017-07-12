package org.monopoly.game;

 

 
import java.util.LinkedList;
import java.util.Queue;

import org.apache.log4j.Logger;

public class Monopoly {
    private static Logger LOG = Logger.getLogger(Monopoly.class);
    
    private Queue<Player> playersQueue = new LinkedList<>();
    private Player currentPlayer;
    
    public Monopoly(int numberOfPlayers) {
       Preparation preparation = new Preparation();
       preparation.PrepareGame();    
       
       PlayGame(numberOfPlayers);
    }

 

    private void PlayGame(int numberOfPlayers) {
       
        playersQueue.add(new Player("Jan",1, "Boat"));
        playersQueue.add(new Player("Wim",2, "Car"));
        playersQueue.add(new Player("Henk",3, "Thimbleful"));
        playersQueue.add(new Player("Piet",4, "Boat"));
                	
            Play();
        	
        

    }
    
    private synchronized void Play() {

        this.currentPlayer = playersQueue.peek(); 
        
        if(playersQueue.peek().isInJail()){
            LOG.info("Player "+currentPlayer.getPlayerObject()+ "is in jail");
        }
        playersQueue.peek().roll();
        int steps = playersQueue.peek().roll();
        LOG.info("Last roll was double "+currentPlayer.LastRoleWasDouble());
        
        
        
        
        move(steps);
       
        
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
