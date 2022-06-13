package Team;
import java.util.Scanner;
import Member.*;

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
		System.out.println("<��� Team ���>");
		System.out.println("-----------------------------------------------------");
		System.out.println("ID\t\tTeam �̸�");
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
		
		System.out.println("<Team �߰�>");
		System.out.println(" - ID : " + id);
		System.out.printf(" - Ÿ��Ʋ : ");
		name = scan.nextLine();
		
		tarr[index++] = new team(id, name);
		System.out.println("=> " + name + ": Team�� �߰��߽��ϴ�.");
	}
	
	public void ShowByTeam(TeamManager TM) {
		Scanner scan = new Scanner(System.in);
		int select;
		
		TM.showAll();
		System.out.printf(" - Team ID : ");
		select = scan.nextInt() - 1;
		int teamIndex = tarr[select].getIndex();
		
		System.out.println("<<"+ tarr[select].getName()+" : ��� ���>>");
		System.out.println("-----------------------------------------------------");
		System.out.println("����\tID\t�̸�\tTeam\t����/ȸ��\t�г�");
		System.out.println("-----------------------------------------------------");
		
		for(int i=0; i < teamIndex; i++) {
			if(tarr[select].getMList()[i] instanceof Student) {
				System.out.printf("�л�\t");
			}
			else if(tarr[select].getMList()[i] instanceof Mentor) {
				System.out.printf("����\t");
			}
			tarr[select].getMList()[i].ShowData();
		}
	}
}
