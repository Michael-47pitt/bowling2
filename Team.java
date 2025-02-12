import java.util.ArrayList;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.io.FileWriter;

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
			i++;
		}
	}
	/*
	public static void save()
	{
		Gson gson = new GsonBuilder.setPrettyPrinting().create();
		try (FileWriter writer = new FileWriter("players.json"))
		{
			gson.toJson(teamPlayers, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void load()
	{
		Gson gson = new Gson();
		Type listType = new TypeToken<List<Player>>() {}.getType();
		
		try (FileReader reader = new FileReader("players.json")
		{
			List<Player> players = gson.fromJson(reader, listType);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		*/
}	