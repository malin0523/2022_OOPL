//2017156005 김범준 Q1
public class Q1 {

	public static void main(String[] args) {
		Student hong = new Student("홍학생", "아침이다", "소프트웨어", 1);
		System.out.println("-----------------------------------");
		System.out.println("ID\t이름\tTeam\t전공\t학년");
		System.out.println("-----------------------------------");
		hong.ShowData();
		System.out.println("-----------------------------------");
	}

}

class Student{
	int id = 0;
	String name;
	String team;
	String major;
	int grade;
	
	public Student(String _name, String _team, String _major, int _grade) {
		id += 1;
		name = _name;
		team = _team;
		major = _major;
		grade = _grade;
	}
	
	public void ShowData() {
		System.out.println(id + "\t" + name + "\t" + team + "\t" + major + "\t" + grade);
	}
}