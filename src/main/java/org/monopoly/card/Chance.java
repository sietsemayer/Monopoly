package org.monopoly.card;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.monopoly.card.chance.Chance1;
import org.monopoly.card.chance.Chance10;
import org.monopoly.card.chance.Chance11;
import org.monopoly.card.chance.Chance12;
import org.monopoly.card.chance.Chance13;
import org.monopoly.card.chance.Chance14;
import org.monopoly.card.chance.Chance15;
import org.monopoly.card.chance.Chance16;
import org.monopoly.card.chance.Chance2;
import org.monopoly.card.chance.Chance3;
import org.monopoly.card.chance.Chance4;
import org.monopoly.card.chance.Chance5;
import org.monopoly.card.chance.Chance6;
import org.monopoly.card.chance.Chance7;
import org.monopoly.card.chance.Chance8;
import org.monopoly.card.chance.Chance9;

public class Chance {

    private static Logger LOG = Logger.getLogger("chanceCardDeck");
    private List<Card> chanceCardDeck;

    public Chance() {
        chanceCardDeck = new ArrayList<>();

        chanceCardDeck.add(new Chance1());
        chanceCardDeck.add(new Chance2());
        chanceCardDeck.add(new Chance3());
        chanceCardDeck.add(new Chance4());
        chanceCardDeck.add(new Chance5());
        chanceCardDeck.add(new Chance6());
        chanceCardDeck.add(new Chance7());
        chanceCardDeck.add(new Chance8());
        chanceCardDeck.add(new Chance9());
        chanceCardDeck.add(new Chance10());
        chanceCardDeck.add(new Chance11());
        chanceCardDeck.add(new Chance12());
        chanceCardDeck.add(new Chance13());
        chanceCardDeck.add(new Chance14());
        chanceCardDeck.add(new Chance15());
        chanceCardDeck.add(new Chance16());
        LOG.info("Added  " + chanceCardDeck.size() + " to the chance card Deck");
    }

    public List<Card> getChanceCardDeckList() {
        return chanceCardDeck;
    }
}
