package Team;
import java.util.Scanner;

public class TeamManager {
	team[] tarr = new team[50]; //50°³
	int index;
	
	public TeamManager() {
		index = 0;
	}
	
	public void DefaultData() {
		int teamID = index+1; // 1
		tarr[index++] = new team(teamID, "¾ÆÄ§ÀÌ´Ù");
		
		teamID = index+1; // 2
		tarr[index++] = new team(teamID, "Á¡½É¸Ô°í");
		
		teamID = index+1; //3 
		tarr[index++] = new team(teamID, "³î´Ù°¡ÀÚ");
		
		teamID = index+1; // 4
		tarr[index++] = new team(teamID, "²Þ²Û´Ù");
	}
	
	public void showAll() {
		System.out.println("-----------------------------------------------------");
		System.out.println("ID\t\tTeam ÀÌ¸§");
		for(int i=0;i<index;i++)
			tarr[i].ShowData();
		System.out.println("-----------------------------------------------------");
	}
	
	public team find(int n){
		for(int i=0;i<index;i++)
		{
			if(tarr[i].getTeamID()==n)
			{
				return tarr[i];
			}
		}
		System.out.println("");
		return null;
	}
}
