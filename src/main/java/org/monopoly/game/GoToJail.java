package org.monopoly.game;

public class GoToJail extends Location {
    
    public GoToJail(String location) {
      super("Go to jail!");
    }
    
    public void goToJail(Player player){
        player.setCurrentLocation(1);
        player.setCurrentLocation(10);
        player.setInJail(true);
        
    }

}
