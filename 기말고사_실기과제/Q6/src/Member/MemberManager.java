package Member;
import java.util.Scanner;

import Member.Member;
import Team.TeamManager;

public class MemberManager {
	Member[] marr = new Member[50];
	int index;
	
	public MemberManager() {
		index = 0;
	}
	
	public void DefaultData(TeamManager TM) {
		marr[index] = new Student(1, "홍학생", TM.find(1), "소프트웨어", 1);
		TM.addTeamMember(marr[index++], 1);
		marr[index] = new Student(2, "김학생", TM.find(2),"게임공학", 2);
		TM.addTeamMember(marr[index++], 2);
		marr[index] = new Student(3, "박학생", TM.find(1),"컴퓨터공학", 3);
		TM.addTeamMember(marr[index++], 1);
		marr[index] = new Mentor(4, "홍멘토", TM.find(1), "Happy Co.");
		TM.addTeamMember(marr[index++], 1);
		marr[index] = new Mentor(5, "박멘토", TM.find(3), "(주)행복");
		TM.addTeamMember(marr[index++], 3);
	}
	
	public void addStudent(TeamManager TM) {
		Scanner scan = new Scanner(System.in);
		int id = index + 1;
		String name;
		String major;
		int grade;
		int select;
		
		System.out.println(" - ID: " + id);
		System.out.printf(" - 이름: ");
		name = scan.nextLine();
		System.out.printf(" - 전공: ");
		major = scan.nextLine();
		System.out.printf(" - 학년: ");
		grade = scan.nextInt();
		
		TM.showAll();
		System.out.printf(" - Team ID : ");
		select = scan.nextInt();
	
		marr[index] = new Student(id, name, TM.find(select), major, grade);
		TM.addTeamMember(marr[index++], select);
		System.out.println("=> " + name + ": 학생을 추가했습니다.");
	}
	
	public void addMentor(TeamManager TM) {
		Scanner scan = new Scanner(System.in);
		int id = index + 1;
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
		
		marr[index] = new Mentor(id, name, TM.find(select), company);
		TM.addTeamMember(marr[index++], select);
		System.out.println("=> " + name + ": 멘토를 추가했습니다.");
	}
	
	public void ShowAll(int n) {
		if(n == 1){//학생만
			System.out.println("-----------------------------------------------------");
			System.out.println("ID \t이름\tTeam\t전공\t학년");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<index;i++) {
				if(marr[i] instanceof Student) {
					marr[i].ShowData();
				}
			}
			System.out.println("-----------------------------------------------------");
		}
		else if (n == 2){//멘토만 
			System.out.println("-----------------------------------------------------");
			System.out.println("ID\t이름\tTeam\t회사");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<index;i++) {
				if(marr[i] instanceof Mentor) {
					marr[i].ShowData();
				}
			}
			System.out.println("-----------------------------------------------------");
		}
		else {//전체 출력
			System.out.println("-----------------------------------------------------");
			System.out.println("구분\tID\t이름\tTeam\t전공/회사\t학년");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<index;i++) {
				if(marr[i] instanceof Student) {
					System.out.printf("학생\t");
				}
				else {
					System.out.printf("멘토\t");
				}
				marr[i].ShowData();
			}
			System.out.println("-----------------------------------------------------");
		}
	}
	
	
	public void FindMember() {
		Scanner scan =new Scanner(System.in);
		System.out.printf("- 이름 >> ");
		String name = scan.nextLine();
		for(int i=0;i<index;i++)
		{
			String result = marr[i].getName();
			if(result.equals(name))
			{
				System.out.println("-----------------------------------------------------");
				System.out.println("구분\tID\t이름\tTeam\t전공/회사\t학년");
				System.out.println("-----------------------------------------------------");
				if(marr[i] instanceof Student) {
					System.out.printf("학생\t");
				}
				else {
					System.out.printf("멘토\t");
				}
				marr[i].ShowData();
				System.out.println("-----------------------------------------------------");
			}
		}
		System.out.println("");
	}
}
