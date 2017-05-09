package org.monopoly.game;

public class Start extends Location {
    
    public Start() {
        super("Start");        
    }

    public void giveMoneyToPlayer(Player player){
        player.setMoney(player.getMoney() + 20000);
    }

}
