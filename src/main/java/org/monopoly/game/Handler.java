package org.monopoly.game;

import org.apache.log4j.Logger;

public class Handler {
    private static Logger LOG = Logger.getLogger(Handler.class);
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
            Player player = ((Property) location).getPropertyOwner();            
            LOG.info(location.getName()+" "+"price: "+price+"\nRent "+rent+"\nOwner "+player);
        } else {
            LOG.info(location.getName());
        }
            
         
    }

}
