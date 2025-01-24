import java.util.ArrayList;

public class Team 
{
	static ArrayList<Player> teamPlayers = new ArrayList<Player>();
	
	public static boolean addPlayer(Player p)
	{
		teamPlayers.add(p);
		return true;
	}
	
	public static boolean removePlayer(String name)
	{
		int i = 0;
		while(i < teamPlayers.size())
		{
			if(teamPlayers.get(i).getName().equals(name))
			{
				teamPlayers.remove(i);
				break;
			}
			i++;
		}
		return true;
	}
	
	public static Player getPlayer(String name)
	{
		int i = 0;
		while(i < teamPlayers.size())
		{
			if(teamPlayers.get(i).getName().equals(name))
			{
				return teamPlayers.get(i);
			}
		}
		return null;
	}
	
	
	public static void displayPlayers()
	{
		System.out.println("Player:\tScore:");
		int i = 0;
		while(i < teamPlayers.size())
		{
			System.out.println(teamPlayers.get(i).getName() + "\t" + teamPlayers.get(i).getScore());
		}
	}
	
}	