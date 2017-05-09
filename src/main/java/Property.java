
public class Property extends Location{
    
    private Player propertyOwner;
    private int propertyPrice;
    private int mortgageValue;
    private int rent;   
    private boolean monopoly; 
    private boolean mortgage;
    
    
    public Property(String name, Player propertyOwner, int propertyPrice, int mortgageValue, int rent, boolean monopoly,
            boolean mortgage) {
        super(name);
        this.propertyOwner = propertyOwner;
        this.propertyPrice = propertyPrice;
        this.mortgageValue = mortgageValue;
        this.rent = rent;
        this.monopoly = monopoly;
        this.mortgage = mortgage;
    }


    public Player getPropertyOwner() {
        return propertyOwner;
    }


    public void setPropertyOwner(Player propertyOwner) {
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


    public boolean isMonopoly() {
        return monopoly;
    }


    public void setMonopoly(boolean monopoly) {
        this.monopoly = monopoly;
    }


    public boolean isMortgage() {
        return mortgage;
    }


    public void setMortgage(boolean mortgage) {
        this.mortgage = mortgage;
    }
    
    
    

  
    

}
