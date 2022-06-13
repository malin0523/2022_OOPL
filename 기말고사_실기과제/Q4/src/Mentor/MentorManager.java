package Mentor;
import java.util.Scanner;

import Student.student;
import Team.TeamManager;;

public class MentorManager {
	mentor[] marr = new mentor[50];
	int index;
	
	public MentorManager() {
		index = 0;
	}
	
	public void DefaultData (TeamManager TM) {
		marr[index++] = new mentor (4, "홍멘토", TM.find(1), "Happy Co.");
		marr[index++] = new mentor (5, "박멘토", TM.find(3), "(주)행복");
	}
	
	public void addMentor(TeamManager TM) {
		Scanner scan = new Scanner(System.in);
		int id = index + 4;
		String name;
		String company;
		int select;
		
		System.out.println(" - ID: " + id);
		System.out.printf(" - 이름: ");
		name = scan.nextLine();
		System.out.printf(" - 회사: ");
		company = scan.nextLine();
		
		TM.showAll();
		System.out.printf(" - Team ID : ");
		select = scan.nextInt();
		
		marr[index++] = new mentor(id, name, TM.find(select), company);
		System.out.println("=> " + name + ": 멘토를 추가했습니다.");
	}
	
	public void ShowData() {
		System.out.println("-----------------------------------------------------");
		System.out.println("ID\t이름\tTeam\t회사");
		for(int i=0;i<index;i++)
			marr[i].ShowData();
		System.out.println("-----------------------------------------------------");
	}
}
