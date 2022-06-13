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
		marr[index] = new Student(1, "ȫ�л�", TM.find(1), "����Ʈ����", 1);
		TM.addTeamMember(marr[index++], 1);
		marr[index] = new Student(2, "���л�", TM.find(2),"���Ӱ���", 2);
		TM.addTeamMember(marr[index++], 2);
		marr[index] = new Student(3, "���л�", TM.find(1),"��ǻ�Ͱ���", 3);
		TM.addTeamMember(marr[index++], 1);
		marr[index] = new Mentor(4, "ȫ����", TM.find(1), "Happy Co.");
		TM.addTeamMember(marr[index++], 1);
		marr[index] = new Mentor(5, "�ڸ���", TM.find(3), "(��)�ູ");
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
		System.out.printf(" - �̸�: ");
		name = scan.nextLine();
		System.out.printf(" - ����: ");
		major = scan.nextLine();
		System.out.printf(" - �г�: ");
		grade = scan.nextInt();
		
		TM.showAll();
		System.out.printf(" - Team ID : ");
		select = scan.nextInt();
	
		marr[index] = new Student(id, name, TM.find(select), major, grade);
		TM.addTeamMember(marr[index++], select);
		System.out.println("=> " + name + ": �л��� �߰��߽��ϴ�.");
	}
	
	public void addMentor(TeamManager TM) {
		Scanner scan = new Scanner(System.in);
		int id = index + 1;
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
		
		marr[index] = new Mentor(id, name, TM.find(select), company);
		TM.addTeamMember(marr[index++], select);
		System.out.println("=> " + name + ": ���並 �߰��߽��ϴ�.");
	}
	
	public void ShowAll(int n) {
		if(n == 1){//�л���
			System.out.println("-----------------------------------------------------");
			System.out.println("ID \t�̸�\tTeam\t����\t�г�");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<index;i++) {
				if(marr[i] instanceof Student) {
					marr[i].ShowData();
				}
			}
			System.out.println("-----------------------------------------------------");
		}
		else if (n == 2){//���丸 
			System.out.println("-----------------------------------------------------");
			System.out.println("ID\t�̸�\tTeam\tȸ��");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<index;i++) {
				if(marr[i] instanceof Mentor) {
					marr[i].ShowData();
				}
			}
			System.out.println("-----------------------------------------------------");
		}
		else {//��ü ���
			System.out.println("-----------------------------------------------------");
			System.out.println("����\tID\t�̸�\tTeam\t����/ȸ��\t�г�");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<index;i++) {
				if(marr[i] instanceof Student) {
					System.out.printf("�л�\t");
				}
				else {
					System.out.printf("����\t");
				}
				marr[i].ShowData();
			}
			System.out.println("-----------------------------------------------------");
		}
	}
	
	
	public void FindMember() {
		Scanner scan =new Scanner(System.in);
		System.out.printf("- �̸� >> ");
		String name = scan.nextLine();
		for(int i=0;i<index;i++)
		{
			String result = marr[i].getName();
			if(result.equals(name))
			{
				System.out.println("-----------------------------------------------------");
				System.out.println("����\tID\t�̸�\tTeam\t����/ȸ��\t�г�");
				System.out.println("-----------------------------------------------------");
				if(marr[i] instanceof Student) {
					System.out.printf("�л�\t");
				}
				else {
					System.out.printf("����\t");
				}
				marr[i].ShowData();
				System.out.println("-----------------------------------------------------");
			}
		}
		System.out.println("");
	}
}
