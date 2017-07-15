package org.monopoly.game;

 

 
import java.util.LinkedList;
import java.util.Queue;

import org.apache.log4j.Logger;

/**
 * @author Sietse
 *
 */
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
//        check if straat is available ( if street is used calculate price) and pay other player
    }
    
    private synchronized void Play() {       
        this.currentPlayer = playersQueue.peek();
        LOG.info(this.currentPlayer.getName());
        //RESETTING THE PLAYER
        currentPlayer.setDoublesRolledThisTurn(0);
        currentPlayer.setLastRoleWasDouble(false);        
        
        if(currentPlayer.isInJail()){
            LOG.info("Player "+currentPlayer.getPlayerObject()+ "is in jail");
            CanTheplayerGetOutOfJail(currentPlayer);
            NextPlayer();
        }       
        ThrowDice();
    }

    private void ThrowDice() {
        int steps = currentPlayer.roll();
        LOG.info("Last roll was double "+currentPlayer.LastRoleWasDouble());
        LOG.info("Last roll was "+ steps);       
        updateplayersLocation(steps);
    }

    private void updateplayersLocation(int steps) {
        int currentlocation = currentPlayer.getCurrentLocation();
        if(playersQueue.peek().getCurrentLocation() + steps > 39){
            moveOverStart();
               currentPlayer.setCurrentLocation((currentlocation + steps) - 39);
           } else {
               currentPlayer.setCurrentLocation((currentlocation + steps));
           }
       
        buyPayorDoNothing();        
        if(currentPlayer.LastRoleWasDouble()) {
            currentPlayer.setLastRoleWasDouble(false);
            ThrowDice();
        }
    }

    private void buyPayorDoNothing() {
        // TODO Auto-generated method stub
        
    }

    private void NextPlayer() {
        // TODO Auto-generated method stub
        
    }

    private void CanTheplayerGetOutOfJail(Player currentPlayer) {
        if(currentPlayer.getJailTime() == 4){
            LOG.info("This is the last time you can get out of jail. If it does not work, the game ends.");
        }
       if(currentPlayer.hasGetOutOfJailFreeCardCommunityChest()) {
           LOG.info("The player has a community chest card to get out of jail. Is it used?");
           if(Decide.decide()) {
               LOG.info("Player gets out of jail by using his comminuty chest card to get out of jail for free.");
               currentPlayer.setInJail(false);
               currentPlayer.setJailTime(0);
           }
       }
       if(currentPlayer.hasGetOutOfJailFreeCardChance() & currentPlayer.isInJail()){
           LOG.info("The player has a chance chest card to get out of jail. Is it used?");
           if(Decide.decide()) {
               LOG.info("Player gets out of jail by using his chance card to get out of jail for free.");
               currentPlayer.setInJail(false);
               currentPlayer.setJailTime(0);
           }           
       }
       if(currentPlayer.getMoney() > 5000) {
           LOG.info("The player gets the opportunity to get out of jail by paying €5.000");
           if(Decide.decide()){
               LOG.info("The player pay €5000 to get out of jail.");
               currentPlayer.setInJail(false);
               currentPlayer.setJailTime(0);               
           }
       }
       
       currentPlayer.setJailTime(currentPlayer.getJailTime() + 1);       
       if(currentPlayer.getJailTime() == 5) {
           gameOver();
       }
        
    }

    private void gameOver() {
        // TODO Auto-generated method stub
        
    }

    private void move(int steps) {
		
		
		
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
