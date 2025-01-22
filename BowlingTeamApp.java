import java.util.Scanner;

public class BowlingTeamApp 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		int loopStatus = 5;
		
		while(loopStatus==5)
		{
			System.out.println("Enter a number based
		}
		
	}
	
	public void addPlayer(String name, int score)
	{
		//create player and add to the team
		Player temp = createNewPlayer(name);
		temp.updateScore(score);
		addPlayer(temp);
		
		System.out.println(name + " was added to the team");
	}
	
	public void removePlayer(String name)
	{
		//remove player from the team
		removePlayer(name);
		System.out.println(name + " was removed from the team");
	}
	
	public boolean view()
	{
		return true;
	}
	
	public boolean updateScore()
	{
		return true;
	}
}