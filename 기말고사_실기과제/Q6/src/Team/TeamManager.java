package Team;
import java.util.Scanner;
import Member.*;

public class TeamManager {
	team[] tarr = new team[50]; //50개
	int index;
	
	public TeamManager() {
		index = 0;
	}
	
	public void DefaultData() {
		int teamID = index+1; // 1
		tarr[index++] = new team(teamID, "아침이다");
		
		teamID = index+1; // 2
		tarr[index++] = new team(teamID, "점심먹고");
		
		teamID = index+1; //3 
		tarr[index++] = new team(teamID, "놀다가자");
		
		teamID = index+1; // 4
		tarr[index++] = new team(teamID, "꿈꾼다");
	}
	
	public void showAll() {
		System.out.println("<모든 Team 목록>");
		System.out.println("-----------------------------------------------------");
		System.out.println("ID\t\tTeam 이름");
		for(int i=0;i<index;i++)
			tarr[i].ShowData();
		System.out.println("-----------------------------------------------------");
	}
	
	public team find(int n) {
		for(int i=0;i<index;i++) {
			if(tarr[i].getTeamID()==n) {
				return tarr[i];
			}
		}
		System.out.println("");
		return null;
	}
	
	public void addTeamMember(Member member, int teamID) {
		Member[] marr = tarr[teamID-1].getMList();
		int index = tarr[teamID-1].getIndex();
		marr[index] = member;
		tarr[teamID-1].ppIndex();
	}
	public void addTeam() {
		Scanner scan = new Scanner(System.in);
		int id = index + 1;
		String name;
		
		System.out.println("<Team 추가>");
		System.out.println(" - ID : " + id);
		System.out.printf(" - 타이틀 : ");
		name = scan.nextLine();
		
		tarr[index++] = new team(id, name);
		System.out.println("=> " + name + ": Team을 추가했습니다.");
	}
	
	public void ShowByTeam(TeamManager TM) {
		Scanner scan = new Scanner(System.in);
		int select;
		
		TM.showAll();
		System.out.printf(" - Team ID : ");
		select = scan.nextInt() - 1;
		int teamIndex = tarr[select].getIndex();
		
		System.out.println("<<"+ tarr[select].getName()+" : 멤버 목록>>");
		System.out.println("-----------------------------------------------------");
		System.out.println("구분\tID\t이름\tTeam\t전공/회사\t학년");
		System.out.println("-----------------------------------------------------");
		
		for(int i=0; i < teamIndex; i++) {
			if(tarr[select].getMList()[i] instanceof Student) {
				System.out.printf("학생\t");
			}
			else if(tarr[select].getMList()[i] instanceof Mentor) {
				System.out.printf("멘토\t");
			}
			tarr[select].getMList()[i].ShowData();
		}
	}
}
