package cs1736;

import com.google.gson.Gson;

public class Player {

    //Variables 
    String playerName = "";
    int playerScore = 0;

    Gson gson = new Gson();

    //Methods
    public boolean createNewPlayer(String name) {
        playerName = name;
        return true;
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

}
