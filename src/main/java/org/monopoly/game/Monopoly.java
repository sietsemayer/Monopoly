package org.monopoly.game;

 

 
import java.util.LinkedList;
import java.util.Queue;

import org.apache.log4j.Logger;

public class Monopoly {
    private static Logger LOG = Logger.getLogger(Monopoly.class);
    private Queue<Player> playersQueue = new LinkedList<>(); 
    public Monopoly(int numberOfPlayers) {
       Preparation preparation = new Preparation();
       preparation.PrepareGame();    
       
       PlayGame(numberOfPlayers);
    }

 

    private void PlayGame(int numberOfPlayers) {
       
        playersQueue.add(new Player(1, "Boat"));
        playersQueue.add(new Player(2, "Car"));
        playersQueue.add(new Player(3, "Thimbleful"));
        playersQueue.add(new Player(4, "Boat"));
                	
            Play();
        	
        

    }
    
    private synchronized void Play() {
        if(playersQueue.peek().isInJail()){
            LOG.info("Player "+playersQueue.peek().getPlayerObject()+ "is in jail");
        }
        playersQueue.peek().roll();
        int steps = playersQueue.peek().roll();
        LOG.info("Last roll was double "+playersQueue.peek().LastRoleWasDouble());
        
        
        move(steps);
        if(playersQueue.peek().getCurrentLocation())
        
    }



    private void move(int steps) {
		int currentloc = playersQueue.peek().getCurrentLocation();
		if(currentloc + steps < 39){
			playersQueue.peek().setCurrentLocation((currentloc + steps) - 39);
		} else {
			playersQueue.peek().setCurrentLocation(currentloc + steps);
		}
		
		
	}



	public static void main(String[] args) {
        LOG.info("Starting the game!");
        new Monopoly(4);
    }
   
   
   

}
