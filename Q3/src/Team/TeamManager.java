package Team;
import java.util.Scanner;

public class TeamManager {
	team[] tarr = new team[50]; //50��
	int index;
	
	public TeamManager() {
		index = 0;
	}
	
	public void DefaultData() {
		int teamID = index+1; // 1
		tarr[index++] = new team(teamID, "��ħ�̴�");
		
		teamID = index+1; // 2
		tarr[index++] = new team(teamID, "���ɸ԰�");
		
		teamID = index+1; //3 
		tarr[index++] = new team(teamID, "��ٰ���");
		
		teamID = index+1; // 4
		tarr[index++] = new team(teamID, "�޲۴�");
	}
	
	public void showAll() {
		System.out.println("-----------------------------------------------------");
		System.out.println("ID\t\tTeam �̸�");
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
