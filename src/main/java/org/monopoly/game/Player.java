package org.monopoly.game;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class Player {    
	private static Logger LOG = Logger.getLogger("Player.class");
 
    private int playerNumber;
    private String playerObject;
    private List<Location>locations;   
    private int money;
    private int doublesRolledThisTurn;    
    private int currentLocation;
    private int jailTime;
    private boolean inJail;
    private boolean lastRoleWasDouble;

    
    public Player(int playerNumber, String playerObject) {       
        this.playerNumber = playerNumber;
        this.playerObject = playerObject;
        this.locations = new LinkedList<>();
        this.money = 150_000;
        this.doublesRolledThisTurn = 0;
        this.currentLocation = 0;
        this.jailTime = 0;
        this.inJail = false;
        this.lastRoleWasDouble = false;
    }


    public int getPlayerNumber() {
        return playerNumber;
    }


    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }


    public String getPlayerObject() {
        return playerObject;
    }


    public void setPlayerObject(String playerObject) {
        this.playerObject = playerObject;
    }


    public List<Location> getLocations() {
        return locations;
    }


    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }


    public int getMoney() {
        return money;
    }


    public void setMoney(int money) {
        this.money = money;
    }


    public int getDoublesRolledThisTurn() {
        return doublesRolledThisTurn;
    }


    public void setDoublesRolledThisTurn(int doublesRolledThisTurn) {
        this.doublesRolledThisTurn = doublesRolledThisTurn;
    }


    public int getCurrentLocation() {
        return currentLocation;
    }


    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }


    public int getJailTime() {
        return jailTime;
    }


    public void setJailTime(int jailTime) {
        this.jailTime = jailTime;
    }


    public boolean isInJail() {
        return inJail;
    }


    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }


    public boolean LastRoleWasDouble() {
        return lastRoleWasDouble;
    }


    public void setLastRoleWasDouble(boolean lastRoleWasDouble) {
        this.lastRoleWasDouble = lastRoleWasDouble;
    }    
    
    public int roll() {
    	int roll1 = Dice.diceThrow();
    	LOG.info("Dice1 "+roll1);
    	int roll2 = Dice.diceThrow();
    	LOG.info("Dice2 "+roll2);
    	
    	if(roll1 == roll2) {
    		this.doublesRolledThisTurn++;
    		lastRoleWasDouble = true;
    	}
    	return (roll1 + roll2);
    }
    
    public boolean lastRollWasDoubles(){
    	return lastRoleWasDouble;
    }
    
    public void resetPlayer(){
    	lastRoleWasDouble = false;
    	doublesRolledThisTurn = 0;
    }
    
    //TODO SMA: Players can be Iron, Wheelbarrow, Dog, Cannon, Car, Hat, Shoe, Boat, thimbleful 
}
