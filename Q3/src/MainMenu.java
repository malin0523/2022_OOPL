import java.util.Scanner;
import Student.StudentManager;
import Team.TeamManager;

public class MainMenu {
	public MainMenu() {
		Scanner scan = new Scanner(System.in);
		StudentManager SM = new StudentManager();
		TeamManager TM = new TeamManager();
		
		SM.DefalutData(TM);
		TM.DefaultData();
		
		while (true)
		{
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
				SM.addStudent(TM);
				break;
			case 2:
				SM.ShowData();
				break;
			case 3:
				System.out.println("Q3 �̱��� ���");
				break;
			case 4:
				System.out.println("Q3 �̱��� ���");
				break;
			case 5:
				SM.findMember();
				break;
			case 6:
				SM.ShowData();
				break;
			case 0:
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ� ...");
			}
		}
		
	}
}

