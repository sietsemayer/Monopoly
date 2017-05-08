package org.monopoly.game;

public class Dice {
    
    private int sides;
    
    public Dice(){
        sides = 6;
    }
    
    public int roll(){
        return (int)((Math.random() * sides) + 1);
    }

}
