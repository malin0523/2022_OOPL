import java.util.Scanner;

import Member.MemberManager;
import Team.TeamManager;

public class MainMenu {
	public MainMenu() {
		Scanner scan = new Scanner(System.in);
		MemberManager MM = new MemberManager();
		TeamManager TM = new TeamManager();
		
		TM.DefaultData();
		MM.DefaultStudent(TM);
		MM.DefaultMentor(TM);
		
		while (true){
			System.out.println("--------[�޴�]--------");
			System.out.println(" 1. �л� ��� �߰�");
			System.out.println(" 2. �л� ��� ��� ���\n");
			System.out.println(" 3. ���� ��� �߰�");
			System.out.println(" 4. ���� ��� ��� ���\n");
			System.out.println(" 5. ��� ��ȸ");
			System.out.println(" 6. ��ü ��� ��� ���\n");
			System.out.println(" 0. ����");
			System.out.println("----------------------");
			System.out.printf("���� >> ");
			int n = scan.nextInt();
			
			switch(n){
			case 1:
				MM.addStudent(TM);
				break;
			case 2:
				MM.ShowStudent();
				break;
			case 3:
				MM.addMentor(TM);
				break;
			case 4:
				MM.ShowMentor();
				break;
			case 5:
				MM.FindMember();
				break;
			case 6:
				MM.ShowAll();
				break;
			case 0:
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ� ...");
			}
		}
		
	}
}

