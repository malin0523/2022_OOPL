package Student;
import java.util.Scanner;
import Team.TeamManager;

public class StudentManager {
	student[] carr = new student[50]; //50��
	int index;
	
	public StudentManager(){
		index=0;
	}
	
	public void DefalutData(TeamManager TM) {
		carr[index++] = new student(1, "ȫ�л�", TM.find(1), "����Ʈ����", 1);
		carr[index++] = new student(2, "���л�", TM.find(2),"���Ӱ���", 2);
		carr[index++] = new student(3, "���л�", TM.find(1),"��ǻ�Ͱ���", 3);
	}
	
	public void addStudent(TeamManager TM){
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
	
		carr[index++] = new student(id, name, TM.find(select), major, grade);
		System.out.println("=> " + name + ": �л��� �߰��߽��ϴ�.");
	}
	
	public void ShowData() {
		System.out.println("-----------------------------------------------------");
		System.out.println("ID\t�̸�\tTeam\t����\t�г�");
		for(int i=0;i<index;i++)
			carr[i].ShowData();
		System.out.println("-----------------------------------------------------");
	}
}

