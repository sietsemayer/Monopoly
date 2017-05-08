package org.monopoly.game;

public class Tax extends Location{
    
    private int amount;
    
    public Tax(String name, int amount) {
        super(name);
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void payTax(Player player){
        player.setMoney(player.getMoney() - amount);
    }
    

}
