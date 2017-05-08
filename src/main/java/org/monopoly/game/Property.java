package org.monopoly.game;


public class Property extends Location {

    private Player propertyOwner;
    private int propertyPrice;
    private int mortgageValue;    
    private int rent;
    private boolean mortgage;
    private boolean monopoly;
    
    public Property(String name, int propertyPrice, int mortgageValue, int rent) {
        super(name);
        this.propertyPrice = propertyPrice;
        this.mortgageValue = mortgageValue;
        this.rent = rent;
        this.mortgage = false;
        this.monopoly = false;
        this.propertyOwner = null;
    }
    
    public Player getPropertyOwner(){
        return this.propertyOwner;
    }
    
    public void setPropertyOwner(Player propertyOwner){
        this.propertyOwner = propertyOwner;
    }

    public int getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(int propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public int getMortgageValue() {
        return mortgageValue;
    }

    public void setMortgageValue(int mortgageValue) {
        this.mortgageValue = mortgageValue;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public boolean isMortgage() {
        return mortgage;
    }

    public void setMortgage(boolean mortgage) {
        this.mortgage = mortgage;
    }

    public boolean isMonopoly() {
        return monopoly;
    }

    public void setMonopoly(boolean monopoly) {
        this.monopoly = monopoly;
    }
    
    public String getOwnersName(){
        if(propertyOwner.equals(null)){
            return "none";
        } else {
            return propertyOwner.getName();
        }
    }
    
}
