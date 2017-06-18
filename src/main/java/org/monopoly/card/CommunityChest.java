package org.monopoly.card;

import org.monopoly.game.communityChestCards.CommunityChest1;
import org.monopoly.game.communityChestCards.CommunityChest10;
import org.monopoly.game.communityChestCards.CommunityChest11;
import org.monopoly.game.communityChestCards.CommunityChest12;
import org.monopoly.game.communityChestCards.CommunityChest13;
import org.monopoly.game.communityChestCards.CommunityChest14;
import org.monopoly.game.communityChestCards.CommunityChest15;
import org.monopoly.game.communityChestCards.CommunityChest16;
import org.monopoly.game.communityChestCards.CommunityChest2;
import org.monopoly.game.communityChestCards.CommunityChest3;
import org.monopoly.game.communityChestCards.CommunityChest4;
import org.monopoly.game.communityChestCards.CommunityChest5;
import org.monopoly.game.communityChestCards.CommunityChest6;
import org.monopoly.game.communityChestCards.CommunityChest7;
import org.monopoly.game.communityChestCards.CommunityChest8;
import org.monopoly.game.communityChestCards.CommunityChest9;
import org.monopoly.game.queue.commonQueue;

public class CommunityChest {
    
  private commonQueue<Card> deck;
    
    public CommunityChest(){
        deck = new commonQueue<>();
        
        deck.enque(new CommunityChest1());;
        deck.enque(new CommunityChest2());;
        deck.enque(new CommunityChest3());;
        deck.enque(new CommunityChest4());;
        deck.enque(new CommunityChest5());;
        deck.enque(new CommunityChest6());;
        deck.enque(new CommunityChest7());;
        deck.enque(new CommunityChest8());;
        deck.enque(new CommunityChest9());;
        deck.enque(new CommunityChest10());;
        deck.enque(new CommunityChest11());;
        deck.enque(new CommunityChest12());;
        deck.enque(new CommunityChest13());;
        deck.enque(new CommunityChest14());;
        deck.enque(new CommunityChest15());;
        deck.enque(new CommunityChest16());;
        
    }

    public void shuffle() {
        // TODO Auto-generated method stub
        
    }


}
