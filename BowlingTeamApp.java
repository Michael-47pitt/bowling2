import java.util.Scanner;

public class BowlingTeamApp 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;		//loop control
		int action = 0;
		
		System.out.print("1. Add player\n" + "2. Remove player\n" + 
			"3. View all players and scores\n" + "4. Update a player's score\n" + "5. Exit app\n");
		//main loop
		do
		{
			
			//prompt action number
			System.out.print("Enter an action number: ");
			action = input.nextInt();
			String name;
			//decide action
			switch (action) {
				case 1: 	System.out.print("Enter player name to add: ");
							input.nextLine();
							name = input.nextLine();
							System.out.print("Enter player score: ");
							int score = input.nextInt();
							addPlayer(name, score);
							break;
				case 2: 	System.out.print("Enter player name to remove: ");
							input.nextLine();
							name = input.nextLine();
							removePlayer(name);
							break;
				case 3: 	view();
							break;
				case 4: 	System.out.print("Enter name of player to update: ");
							input.nextLine();
							name = input.nextLine();
							System.out.print("Enter updated score: ");
							int newScore = input.nextInt();
							updateScore(Team.getPlayer(name), newScore);
							break;
				case 5:		loop = false;
							break;
				default: 	System.out.println("ERROR: Invalid input. Please try again.");
			}	
		} while (loop);
		
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