//2017156005 ����� Q1
public class Q1 {

	public static void main(String[] args) {
		Student hong = new Student("ȫ�л�", "��ħ�̴�", "����Ʈ����", 1);
		System.out.println("-----------------------------------");
		System.out.println("ID\t�̸�\tTeam\t����\t�г�");
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