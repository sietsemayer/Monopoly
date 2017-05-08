package org.monopoly.game;
import java.util.ArrayList;

public class Player {
    
    private Player[] otherPlayers;
    private ArrayList<Location>locations;
    private Board board;
    private Dice dice;    
    private String name;
    private int money;
    private int doubles;    
    private int currentLocation;
    private int numRailroad;
    private int jailTime;
    private boolean inJail;
    private boolean lastRoleWasDouble;
    private boolean cardHolder;
        
    public Player(Board board) {
        super();
        this.otherPlayers = null;
        this.locations = new ArrayList<>();
        this.board = board;
        this.money = 1500;
        this.doubles = 0;
        this.currentLocation = 0;
        this.numRailroad = 0;
        this.jailTime = 0;
        this.inJail = false;
        this.lastRoleWasDouble = false;
        this.cardHolder = false;
    }
    
    public Player(String name, Board board) {
        super();
        this.otherPlayers = null;
        this.locations = new ArrayList<>();
        this.board = board;
        this.name = name;
        this.money = 1500;
        this.doubles = 0;
        this.currentLocation = 0;
        this.numRailroad = 0;
        this.jailTime = 0;
        this.inJail = false;
        this.lastRoleWasDouble = false;
        this.cardHolder = false;
    }

    public Player[] getOtherPlayers() {
        return otherPlayers;
    }

    public void setOtherPlayers(Player[] otherPlayers) {
        this.otherPlayers = otherPlayers;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getNumRailroad() {
        return numRailroad;
    }

    public void setNumRailroad(int numRailroad) {
        this.numRailroad = numRailroad;
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

    public boolean isLastRoleWasDouble() {
        return lastRoleWasDouble;
    }

    public void setLastRoleWasDouble(boolean lastRoleWasDouble) {
        this.lastRoleWasDouble = lastRoleWasDouble;
    }

    public boolean isCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(boolean cardHolder) {
        this.cardHolder = cardHolder;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + "]";
    }
    
    
    
    

    
   
    
    

}
