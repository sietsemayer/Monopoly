package org.monopoly.game;

/**
 * @author Sietse
 *
 */
public class Decide {

    /**
     * @return if the player decide yes or no
     */
    public static boolean decide() {
        return Math.random() < 0.5;
    }
}
