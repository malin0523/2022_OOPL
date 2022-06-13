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
		marr[index++] = new mentor (4, "ȫ����", TM.find(1), "Happy Co.");
		marr[index++] = new mentor (5, "�ڸ���", TM.find(3), "(��)�ູ");
	}
	
	public void addMentor(TeamManager TM) {
		Scanner scan = new Scanner(System.in);
		int id = index + 4;
		String name;
		String company;
		int select;
		
		System.out.println(" - ID: " + id);
		System.out.printf(" - �̸�: ");
		name = scan.nextLine();
		System.out.printf(" - ȸ��: ");
		company = scan.nextLine();
		
		TM.showAll();
		System.out.printf(" - Team ID : ");
		select = scan.nextInt();
		
		marr[index++] = new mentor(id, name, TM.find(select), company);
		System.out.println("=> " + name + ": ���並 �߰��߽��ϴ�.");
	}
	
	public void ShowData() {
		System.out.println("-----------------------------------------------------");
		System.out.println("ID\t�̸�\tTeam\tȸ��");
		for(int i=0;i<index;i++)
			marr[i].ShowData();
		System.out.println("-----------------------------------------------------");
	}
}
