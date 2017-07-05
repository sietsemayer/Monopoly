package org.monopoly.game;

import java.util.Random;

public class Dice {
    
    private Dice(){        
    }
    
    public static int diceThrow(){
        Random random = new Random();
        int numberOfEyes = random.nextInt(5);
        return (numberOfEyes +1);
    }
}
