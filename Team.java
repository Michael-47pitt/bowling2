import java.util.ArrayList;

public class Team 
{
	ArrayList<Player> teamPlayers = new ArrayList<Player>();
	
	public boolean addPlayer(Player p)
	{
		teamPlayers.add(p);
		return true;
	}
	
	public boolean removePlayer(String name)
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
	
	public void displayPlayers()
	{
		System.out.println("Player:\tScore:");
		int i = 0;
		while(i < teamPlayers.size())
		{
			System.out.println(teamPlayers.get(i).getName() + "\t" + teamPlayers.get(i).getScore());
		}
	}
	
}	