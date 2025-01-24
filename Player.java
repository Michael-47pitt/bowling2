
public class Player {
	//Variables 
	String playerName = "";
	int playerScore = 0;
	
	
	//Methods
	public Player(String name){
		playerName = name;
		playerScore=0;
	}
	
	public int updateScore(int score){
		playerScore = score;
		return playerScore;
	}
	
	public String getName(){
		return playerName;
	}
	
	public int getScore(){
		return playerScore;
	}
	
	//This is added from the new branch
}