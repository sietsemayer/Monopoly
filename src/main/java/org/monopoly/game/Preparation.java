package org.monopoly.game;

import org.apache.log4j.Logger;
import org.monopoly.card.Chance;
import org.monopoly.card.CommunityChest;
import org.monopoly.util.ShuffleCards;

public class Preparation {
    private static Logger LOG = Logger.getLogger("Preparation");
    
    protected Preparation(){
        
    }

    Chance chance = new Chance();
    CommunityChest communityChest = new CommunityChest();
    
    public void PrepareGame(){
        LOG.info("Shuffle communitychest cards.");
        ShuffleCards.shuffle(communityChest.getcommunityChestCarddeckList());
        LOG.info("Shuffle chance cards.");
        ShuffleCards.shuffle(chance.getChanceCardDeckList());
        
        
    }
    
    
    
    
    
    
    

}
