import java.util.ArrayList;

public class Player {
	
    private ArrayList<Location> deeds;
    private String name;
    private int money;
    private int doubles;
    private boolean inJail;
    

    private boolean cardHolder;
    private boolean lastRollWasDoubles;

    private int numRailroad;
    private int currLocation;
    private int jailTime;
    private Dice die;

    private Player[]otherPlayers;
    private Board board;

	
}
