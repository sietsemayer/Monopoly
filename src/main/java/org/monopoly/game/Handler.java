package org.monopoly.game;


public class Handler {
    
    public int locationOnBoard, price, rent;
    private Location location;
    
    public Handler(int locationOnBoard, int price, int rent, Location location, Board board){
        
        this.locationOnBoard = locationOnBoard;        
        this.price = price;
        this.rent = rent;
        this.location = location;        
    }
    
    public void action(){
        if(location instanceof Property){
            //FIXME SMA : FIX ME!!
//            Player player = ((Property) location).getPropertyOwner();            
//            System.out.println(location.getName()+" "+"price: "+price+"\nRent "+rent+"\nOwner "+player);
        } else {
            System.out.println(location.getName());
        }
            
         
    }

}
