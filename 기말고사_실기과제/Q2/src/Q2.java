import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Team[] Tarr = new Team[4];
		int index = 0;
		
		Tarr[index++] = new Team (1, "��ħ�̴�");
		Tarr[index++] = new Team (2, "���ɸ԰�");
		Tarr[index++] = new Team (3, "��ٰ���");
		Tarr[index++] = new Team (4, "�޲۴�");
		
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.printf("- Team ID >>");
			int n = scan.nextInt();
			for (int i = 0; i<n; i++) {
				if (n == Tarr[i].id) {
					System.out.println("<ã�� Team>");
					System.out.println("-----------------------------------");
					System.out.println("ID\t\tTeam �̸�");
					System.out.println("-----------------------------------");
					Tarr[i].ShowData();
					System.out.println("-----------------------------------");
				}
			}
			
		}
	}
}

class Team{
	int id;
	String name;
	
	Team(int _id, String _name){
		id = _id;
		name = _name;
	}
	
	public void ShowData() {
		System.out.println(id + "\t\t" + name);
	}
	
	public int getGroupID() {
		return id;
	}
}