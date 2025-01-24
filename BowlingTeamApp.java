import java.util.Scanner;

public class BowlingTeamApp 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		int loop = true;		//loop control
		int action = 0;
		
		//main loop
		while(loopStatus)
		{
			//interface print
			System.out.print("1. Add player\n" + "2. Remove player\n" + 
			"3. View all players and scores\n" + "4. Update a player's score\n" + "5. Exit app\n");
			
			//prompt action number
			System.out.println("Enter an action number: ");
			action = input.nextInt();
			
			//decide action
			switch (action) {
				case 1: 	System.out.println("Enter player name to add: ");
							String name = input.nextLine();
							System.out.println("Enter player score: ");
							int score = input.nextInt();
							addPlayer(name, score);
				case 2: 	System.out.println("Enter player name to remove: ");
							String name = input.nextLine();
							removePlayer(name);
				case 3: 	view();
				case 4: 	System.out.println("Enter name of player to update: ");
							String name = input.nextLine();
							System.out.println("Enter updated score: ");
							int newScore = input.nextInt();
							updateScore(Team.getPlayer(name), newScore);
				case 5:		loopStatus = false;
				default: 	System.out.println("ERROR: Invalid input. Please try again.");
				
		}
		
	}
	
	public static void addPlayer(String name, int score)
	{
		//create player and add to the team
		Player temp = createNewPlayer(name);
		temp.updateScore(score);
		addPlayer(temp);
		
		System.out.println(name + " was added to the team");
	}
	
	public static void removePlayer(String name)
	{
		//remove player from the team
		removePlayer(name);
		System.out.println(name + " was removed from the team");
	}
	
	public static void view()
	{
		displayPlayers();
	}
	
	public static void updateScore(Player p, int score)
	{
		p.updateScore(score);
	}
}