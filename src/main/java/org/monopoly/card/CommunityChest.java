package org.monopoly.card;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
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

public class CommunityChest {
    private static Logger LOG = Logger.getLogger("CommunityChestCarddeck");
    private static List<Card> communityChestCardDeck;

    public CommunityChest() {
        communityChestCardDeck = new ArrayList<>();

        communityChestCardDeck.add(new CommunityChest1());
        communityChestCardDeck.add(new CommunityChest2());
        communityChestCardDeck.add(new CommunityChest3());
        communityChestCardDeck.add(new CommunityChest4());
        communityChestCardDeck.add(new CommunityChest5());
        communityChestCardDeck.add(new CommunityChest6());
        communityChestCardDeck.add(new CommunityChest7());
        communityChestCardDeck.add(new CommunityChest8());
        communityChestCardDeck.add(new CommunityChest9());
        communityChestCardDeck.add(new CommunityChest10());
        communityChestCardDeck.add(new CommunityChest11());
        communityChestCardDeck.add(new CommunityChest12());
        communityChestCardDeck.add(new CommunityChest13());
        communityChestCardDeck.add(new CommunityChest14());
        communityChestCardDeck.add(new CommunityChest15());
        communityChestCardDeck.add(new CommunityChest16());
        LOG.info("Added " + communityChestCardDeck.size() + " to the communityChest card Deck");

    }

    public List<Card> getcommunityChestCarddeckList() {
        return communityChestCardDeck;

    }

}
