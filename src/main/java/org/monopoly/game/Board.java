package org.monopoly.game;

import org.apache.log4j.Logger;

public class Board {
    private static final  Logger LOG = Logger.getLogger(Board.class);
    private Location[] board = new Location[40];

    public Board() {        
        board[0] = new Start();
        board[1] = new Estate("Dorpstraat, Het Dorp", "magenta", 5000, 5000, 6000, 3000, 200, 1000, 3000, 9000, 16000, 25000);
        board[2] = new Location("Algemeen fonds");
        board[3] = new Estate("Brink, Het Dorp", "magenta", 5000, 5000, 6000, 3000, 400, 2000, 6000, 18000, 32000, 45000);
        board[4] = new Tax("Inkomsten belasting", 20000);
        board[5] = new Railroad("Station Zuid", 20000, 2500, 10000);
        board[6] = new Estate("Steenstraat, Arnhem", "cyan", 5000, 5000, 10000, 5000, 600, 3000, 9000, 27000, 40000, 55000);
        board[7] = new Location("Kans");
        board[8] = new Estate("Ketelstraat, Arnhem", "cyan", 5000, 5000, 10000, 5000, 600, 3000, 9000, 27000, 40000, 55000);
        board[9] = new Estate("Velperplein, Arnhem", "cyan", 5000, 5000, 12000, 6000, 800, 4000, 1000, 30000, 45000, 60000);
        board[10] = new Location("Gevangenis");
        board[11] = new Estate("Barteljorisstraat, Haarlem", "purple", 10000, 10000, 14000, 7000, 1000, 5000, 15000, 45000, 62500, 75000);
        board[12] = new Utility("Elektriciteitsbedrijf", 15000, 7500, 2000);
        board[13] = new Estate("Zijlweg, Haarlem", "purple", 10000, 10000, 14000, 7000, 1000, 5000, 15000, 45000, 62500, 75000);
        board[14] = new Estate("Houtstraat, Haarlem", "purple", 10000, 10000, 16000, 8000, 1200, 6000, 18000, 50000, 70000, 90000);
        board[15] = new Railroad("Station West", 20000, 2500, 10000);
        board[16] = new Estate("Neude, Utrecht", "orange", 10000, 10000, 18000, 9000, 1400, 7000, 20000, 55000, 75000, 95000);
        board[17] = new Location("Community Chest");
        board[18] = new Estate("Biltstraat, Utrecht", "orange", 10000, 10000, 18000, 9000, 1400, 7000, 20000, 55000, 75000, 95000);
        board[19] = new Estate("Vreeburg, utrecht", "orange", 10000, 10000, 20000, 10000, 1600, 8000, 22000, 60000, 80000, 100000);
        board[20] = new Location("Vrij parkeren");
        board[21] = new Estate("A-Kerkhof, Groningen", "red", 15000, 15000, 22000, 11000, 1800, 9000, 25000, 70000, 87500, 105000);
        board[22] = new Estate("Grote Markt, Groningen", "red", 15000, 15000, 22000, 11000, 1800, 9000, 25000, 70000, 87500, 105000);
        board[23] = new Estate("Heersnstraat, Groningen", "red", 15000, 15000, 24000, 12000, 2000, 10000, 30000, 75000, 92500, 110000);
        board[24] = new Railroad("Station West", 20000, 2500, 10000);
        board[25] = new Location("Kans");
        board[26] = new Estate("Spui, 's-Gravenhage", "yellow", 15000, 15000, 26000, 13000, 2200, 11000, 33000, 80000, 97500, 11500);
        board[27] = new Estate("Plein, 's-Gravenhage", "yellow", 15000, 15000, 26000, 13000, 2200, 11000, 33000, 80000, 97500, 11500);
        board[28] = new Utility("Waterleidingbedrijf", 15000, 7500, 2000);
        board[29] = new Estate("Lange Poten, 's-GravenHage", "yellow", 15000, 15000, 28000, 14000, 2400, 12000, 36000, 85000, 102500, 120000);
        board[12] = new Utility("Waterleidingbedrijf", 15000, 7500, 2000);
        board[30] = new GoToJail("Ga naar de gevangenis");
        board[31] = new Estate("Hofplein, Rotterdam","green", 20000, 20000, 30000, 15000, 26000, 13000, 39000, 90000, 110000, 127500);
        board[32] = new Estate("Blaak, Rotterdam","green", 20000, 20000, 30000, 15000, 26000, 13000, 39000, 90000, 110000, 127500);
        board[33] = new Location("Algemeen fonds");
        board[34] = new Estate("Coolsingel, Rotterdam", "green", 20000, 20000, 32000, 16000, 2800, 15000, 45000, 100000, 120000, 140000);
        board[35] = new Railroad("Station Oost", 20000, 2500, 10000);
        board[36] = new Location("Chance");
        board[37] = new Estate("Leidschestraat, Amsterdam", "darkblue", 20000, 20000, 35000, 17500, 3500, 17500, 50000, 110000, 130000, 150000);
        board[38] = new Tax("Extra belasting", 10000);
        board[39] = new Estate("Kalverstraat, Amsterdam", "darkblue", 20000, 20000, 40000, 20000, 5000, 20000, 60000, 1400000, 170000, 200000);

    }

    public Location getLocation(int locationOnBoard) {
        return board[locationOnBoard];
    }

}
