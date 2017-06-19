package org.monopoly.card;

import org.monopoly.card.communityChestCards.CommunityChest1;
import org.monopoly.card.communityChestCards.CommunityChest10;
import org.monopoly.card.communityChestCards.CommunityChest11;
import org.monopoly.card.communityChestCards.CommunityChest12;
import org.monopoly.card.communityChestCards.CommunityChest13;
import org.monopoly.card.communityChestCards.CommunityChest14;
import org.monopoly.card.communityChestCards.CommunityChest15;
import org.monopoly.card.communityChestCards.CommunityChest16;
import org.monopoly.card.communityChestCards.CommunityChest2;
import org.monopoly.card.communityChestCards.CommunityChest3;
import org.monopoly.card.communityChestCards.CommunityChest4;
import org.monopoly.card.communityChestCards.CommunityChest5;
import org.monopoly.card.communityChestCards.CommunityChest6;
import org.monopoly.card.communityChestCards.CommunityChest7;
import org.monopoly.card.communityChestCards.CommunityChest8;
import org.monopoly.card.communityChestCards.CommunityChest9;
import org.monopoly.game.queue.commonQueue;

public class CommunityChest {
    
  private commonQueue<Card> communityChestCarddeck;
    
    public CommunityChest(){
        communityChestCarddeck = new commonQueue<>();
        
        communityChestCarddeck.enque(new CommunityChest1());
        communityChestCarddeck.enque(new CommunityChest2());
        communityChestCarddeck.enque(new CommunityChest3());
        communityChestCarddeck.enque(new CommunityChest4());
        communityChestCarddeck.enque(new CommunityChest5());
        communityChestCarddeck.enque(new CommunityChest6());
        communityChestCarddeck.enque(new CommunityChest7());
        communityChestCarddeck.enque(new CommunityChest8());
        communityChestCarddeck.enque(new CommunityChest9());
        communityChestCarddeck.enque(new CommunityChest10());
        communityChestCarddeck.enque(new CommunityChest11());
        communityChestCarddeck.enque(new CommunityChest12());
        communityChestCarddeck.enque(new CommunityChest13());
        communityChestCarddeck.enque(new CommunityChest14());
        communityChestCarddeck.enque(new CommunityChest15());
        communityChestCarddeck.enque(new CommunityChest16());
        
    }

    public void shuffle() {
        // TODO Auto-generated method stub
        
    }


}
