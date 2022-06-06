package Student;
import Team.team;

public class student {
	int id;
	String name;
	team team;
	String major;
	int grade;
	
	public student(int _id, String _name, team _team, String _major, int _grade) {
		id = _id;
		name = _name;
		team = _team;
		major = _major;
		grade = _grade;
	}
	
	public student(student s) {
		id = s.id;
		name = s.name;
		team = s.team;
		major = s.major;
		grade = s.grade;
	}
	
	public void ShowData() {
		System.out.println(id + "\t" + name + "\t" + team.getName() + "\t" + major + "\t" + grade);
	}
}
