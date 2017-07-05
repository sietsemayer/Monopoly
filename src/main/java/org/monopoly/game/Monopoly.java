package org.monopoly.game;

 

 
import org.apache.log4j.Logger;

public class Monopoly {
    private static Logger LOG = Logger.getLogger(Monopoly.class);
    
//    public Board board;
//    public Game game;
//    private commonQueue<Player> player;
//    private Chance chance;
//    private CommunityChest communityChest;
//    private Collection <Integer> locationOfPlayers;
//
//    private final int NUMBEROFTURNS;
//    private int numberOfPlayers;

    
    public Monopoly(int numberOfPlayers) {
       Preparation preparation = new Preparation();
       preparation.PrepareGame();
       
        
        
    
    }

//        LOG.info(numberOfPlayers + "number of players");
//        board = new Board();
//        player = new commonQueue<>();
//        game = new Game();
//        
//        for (int i = 1; i <= numberOfPlayers; i++) {
//            player.enqueue(new Player("Player "+i, board));
//            
//        }
//        
//        for(int i = 1; i <= numberOfPlayers; i++) {
//            player.enqueue(new Player("PLLayer "+i, board));
//        }
//        
//        for(int i = 0; i < player.getSize(); i++ ){
//            
//            Player temp = player.dequeue();
//            
//            Player[] otherPLayers = new Player[player.getSize()];
//            
//            for(int k = 0; k < player.getSize(); k++){
//                otherPLayers[k] = player.dequeue();
//                player.enqueue(otherPLayers[k]);
//            }
//            
//            temp.setOtherPlayers(otherPLayers);
//            player.enqueue(temp);          
//        }
//        
//        chance = new Chance();
//        chance.shuffle();
//        communityChest = new CommunityChest();
//        communityChest.shuffle();
//        
//        
//        locationOfPlayers = new ArrayList<>();
//        for(int i = 0; i < player.getSize(); i++){
//            locationOfPlayers.add(0);
//        }             
//        
//        this.NUMBEROFTURNS = 9999999;      
//        this.numberOfPlayers = numberOfPlayers;
//
//    }
//    
//    public synchronized void start(){
//        game.update(locationOfPlayers);
//    }
//    
//    public synchronized void stop(){
//        Collection<Player> temp = new ArrayList<>();
//        temp.add(player.dequeue());
//        int playersListsize = player.getSize(); 
//       
//    }

    public static void main(String[] args) {
        LOG.info("Starting the game!");
        new Monopoly(4);
    }
   
   
   

}
