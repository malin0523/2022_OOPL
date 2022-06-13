import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Team[] Tarr = new Team[4];
		int index = 0;
		
		Tarr[index++] = new Team (1, "æ∆ƒß¿Ã¥Ÿ");
		Tarr[index++] = new Team (2, "¡°Ω…∏‘∞Ì");
		Tarr[index++] = new Team (3, "≥Ó¥Ÿ∞°¿⁄");
		Tarr[index++] = new Team (4, "≤ﬁ≤€¥Ÿ");
		
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.printf("- Team ID >>");
			int n = scan.nextInt();
			for (int i = 0; i<n; i++) {
				if (n == Tarr[i].id) {
					System.out.println("<√£¿∫ Team>");
					System.out.println("-----------------------------------");
					System.out.println("ID\t\tTeam ¿Ã∏ß");
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