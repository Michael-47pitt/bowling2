import java.util.Scanner;

public class BowlingTeamApp 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;		//loop control
		int action = 0;
		
		//main loop
		while(loop)
		{
			//interface print
			System.out.print("1. Add player\n" + "2. Remove player\n" + 
			"3. View all players and scores\n" + "4. Update a player's score\n" + "5. Exit app\n");
			
			//prompt action number
			System.out.println("Enter an action number: ");
			action = input.nextInt();
			String name = "";
			//decide action
			switch (action) {
				case 1: 	System.out.print("Enter player name to add: ");
							name = input.nextLine();
							System.out.print("Enter player score: ");
							int score = input.nextInt();
							addPlayer(name, score);
				case 2: 	System.out.print("Enter player name to remove: ");
							name = input.nextLine();
							removePlayer(name);
				case 3: 	view();
				case 4: 	System.out.print("Enter name of player to update: ");
							name = input.nextLine();
							System.out.print("Enter updated score: ");
							int newScore = input.nextInt();
							updateScore(Team.getPlayer(name), newScore);
				case 5:		loop = false;
				default: 	System.out.println("ERROR: Invalid input. Please try again.");
			}	
		}
		
	}
	
	public static void addPlayer(String name, int score)
	{
		//create player and add to the team
		Player temp = new Player(name);
		temp.updateScore(score);
		Team.addPlayer(temp);
		
		System.out.println(name + " was added to the team");
	}
	
	public static void removePlayer(String name)
	{
		//remove player from the team
		Team.removePlayer(name);
		System.out.println(name + " was removed from the team");
	}
	
	public static void view()
	{
		Team.displayPlayers();
	}
	
	public static void updateScore(Player p, int score)
	{
		p.updateScore(score);
	}
}