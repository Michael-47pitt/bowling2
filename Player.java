
public class Player {
	//Variables 
	String playerName = "";
	int playerScore = 0;
	
	
	//Methods
	public boolean createNewPlayer(String name){
		playerName = name;
		return true;
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