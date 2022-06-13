package Student;
import java.util.Scanner;
import Team.TeamManager;

public class StudentManager {
	student[] carr = new student[50]; //50개
	int index;
	
	public StudentManager(){
		index=0;
	}
	
	public void DefalutData(TeamManager TM) {
		carr[index++] = new student(1, "홍학생", TM.find(1), "소프트웨어", 1);
		carr[index++] = new student(2, "김학생", TM.find(2),"게임공학", 2);
		carr[index++] = new student(3, "박학생", TM.find(1),"컴퓨터공학", 3);
	}
	
	public void addStudent(TeamManager TM){
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
	
		carr[index++] = new student(id, name, TM.find(select), major, grade);
		System.out.println("=> " + name + ": 학생을 추가했습니다.");
	}
	
	public void ShowData() {
		System.out.println("-----------------------------------------------------");
		System.out.println("ID\t이름\tTeam\t전공\t학년");
		for(int i=0;i<index;i++)
			carr[i].ShowData();
		System.out.println("-----------------------------------------------------");
	}
}

