import java.util.Scanner;

import Member.MemberManager;
import Team.TeamManager;

public class MainMenu {
	public MainMenu() {
		Scanner scan = new Scanner(System.in);
		MemberManager MM = new MemberManager();
		TeamManager TM = new TeamManager();
		
		TM.DefaultData();
		MM.DefaultData(TM);
		
		while (true){
			System.out.println("--------[메뉴]--------");
			System.out.println(" 1. 학생 멤버 추가");
			System.out.println(" 2. 학생 멤버 목록 출력\n");
			System.out.println(" 3. 멘토 멤버 추가");
			System.out.println(" 4. 멘토 멤버 목록 출력\n");
			System.out.println(" 5. 멤버 조회");
			System.out.println(" 6. 전체 멤버 목록 출력\n");
			System.out.println(" 7. Team 추가");
			System.out.println(" 8. Team 목록 출력");
			System.out.println(" 9. Team별 멤버 목록 출력\n");
			System.out.println(" 0. 종료");
			System.out.println("----------------------");
			System.out.printf("선택 >> ");
			int n = scan.nextInt();
			
			switch(n){
			case 1:
				MM.addStudent(TM);
				break;
			case 2:
				MM.ShowAll(1);
				break;
			case 3:
				MM.addMentor(TM);
				break;
			case 4:
				MM.ShowAll(2);
				break;
			case 5:
				MM.FindMember();
				break;
			case 6:
				MM.ShowAll(3);
				break;
			case 7:
				TM.addTeam();
				break;
			case 8:
				TM.showAll();
				break;
			case 9:
				TM.ShowByTeam(TM);
				break;
			case 0:
				return;
			default:
				System.out.println("잘못 입력하셨습니다 ...");
			}
		}
		
	}
}

