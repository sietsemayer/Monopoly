package org.monopoly.card;

import java.util.ArrayList;

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

    public CommunityChest() {
        communityChestCarddeck = new commonQueue<>();

        communityChestCarddeck.enqueue(new CommunityChest1());
        communityChestCarddeck.enqueue(new CommunityChest2());
        communityChestCarddeck.enqueue(new CommunityChest3());
        communityChestCarddeck.enqueue(new CommunityChest4());
        communityChestCarddeck.enqueue(new CommunityChest5());
        communityChestCarddeck.enqueue(new CommunityChest6());
        communityChestCarddeck.enqueue(new CommunityChest7());
        communityChestCarddeck.enqueue(new CommunityChest8());
        communityChestCarddeck.enqueue(new CommunityChest9());
        communityChestCarddeck.enqueue(new CommunityChest10());
        communityChestCarddeck.enqueue(new CommunityChest11());
        communityChestCarddeck.enqueue(new CommunityChest12());
        communityChestCarddeck.enqueue(new CommunityChest13());
        communityChestCarddeck.enqueue(new CommunityChest14());
        communityChestCarddeck.enqueue(new CommunityChest15());
        communityChestCarddeck.enqueue(new CommunityChest16());

    }

    public void shuffle() {
        ArrayList<Card> shuffler = new ArrayList<>();
        while (communityChestCarddeck.getSize() != 0) {
            shuffler.add(communityChestCarddeck.dequeue());
        }
        while (!shuffler.isEmpty()) {
            int n = shuffler.size();
            int randomIndex = (int)(n * Math.random());
            communityChestCarddeck.enqueue(shuffler.remove(randomIndex));

        }

    }

}
