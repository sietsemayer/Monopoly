package org.monopoly.card;

import java.util.ArrayList;
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
import org.monopoly.game.queue.commonQueue;

public class Chance {

    private commonQueue<Card> chanceCardDeck;

    public Chance() {
        chanceCardDeck = new commonQueue<>();

        chanceCardDeck.enqueue(new Chance1());
        chanceCardDeck.enqueue(new Chance2());
        chanceCardDeck.enqueue(new Chance3());
        chanceCardDeck.enqueue(new Chance4());
        chanceCardDeck.enqueue(new Chance5());
        chanceCardDeck.enqueue(new Chance6());
        chanceCardDeck.enqueue(new Chance7());
        chanceCardDeck.enqueue(new Chance8());
        chanceCardDeck.enqueue(new Chance9());
        chanceCardDeck.enqueue(new Chance10());
        chanceCardDeck.enqueue(new Chance11());
        chanceCardDeck.enqueue(new Chance12());
        chanceCardDeck.enqueue(new Chance13());
        chanceCardDeck.enqueue(new Chance14());
        chanceCardDeck.enqueue(new Chance15());
        chanceCardDeck.enqueue(new Chance16());
    }

    public void shuffle() {
        ArrayList<Card> shuffler = new ArrayList<Card>();
        while (chanceCardDeck.getSize() != 0) {
            shuffler.add(chanceCardDeck.dequeue());
        }

        while (!shuffler.isEmpty()) {
            int n = shuffler.size();
            int randIndex = (int)(n * Math.random());
            chanceCardDeck.enqueue(shuffler.remove(randIndex));
        }

    }

}
