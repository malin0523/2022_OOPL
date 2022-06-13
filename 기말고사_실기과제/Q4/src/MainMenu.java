import java.util.Scanner;

import Mentor.MentorManager;
import Student.StudentManager;
import Team.TeamManager;

public class MainMenu {
	public MainMenu() {
		Scanner scan = new Scanner(System.in);
		StudentManager SM = new StudentManager();
		TeamManager TM = new TeamManager();
		MentorManager MM = new MentorManager();
		
		TM.DefaultData();
		MM.DefaultData(TM);
		SM.DefalutData(TM);
		
		while (true){
			System.out.println("--------[메뉴]--------");
			System.out.println(" 1. 학생 멤버 추가");
			System.out.println(" 2. 학생 멤버 목록 출력\n");
			System.out.println(" 3. 멘토 멤버 추가");
			System.out.println(" 4. 멘토 멤버 목록 출력\n");
			System.out.println(" 5. 멤버 조회");
			System.out.println(" 6. 전체 멤버 목록 출력\n");
			System.out.println(" 0. 종료");
			System.out.println("----------------------");
			System.out.printf("선택 >> ");
			int n = scan.nextInt();
			
			switch(n){
			case 1:
				SM.addStudent(TM);
				break;
			case 2:
				SM.ShowData();
				break;
			case 3:
				MM.addMentor(TM);
				break;
			case 4:
				MM.ShowData();
				break;
			case 5:
				System.out.println("Q4 미구현 기능");
				break;
			case 6:
				System.out.println("Q4 미구현 기능");
				break;
			case 0:
				return;
			default:
				System.out.println("잘못 입력하셨습니다 ...");
			}
		}
		
	}
}

