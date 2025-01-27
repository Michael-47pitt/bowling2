package cs1736;

import com.google.gson.Gson;

public class Player {

    //Variables 
    String playerName = "";
    int playerScore = 0;
    Gson gson = new Gson();

    //Methods
    public Player(String name) {
        playerName = name;
        
    }

    public int updateScore(int score) {
        playerScore = score;
        return playerScore;
    }

    public String getName() {
        return playerName;
    }

    public int getScore() {
        return playerScore;
    }

    public void setName(String n) {
        playerName = n;
    }

    public void setScore(int s) {
        playerScore = s;
    }

    public String playerToJson(Player p) {
        String playerJSON = gson.toJson(p);
        return playerJSON;
    }

}
