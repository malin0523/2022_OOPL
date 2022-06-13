package Member;

import Team.team;

public class Student extends Member {
	String major;
	int grade;
	
	Student(int _id, String _name, team _team, String _major, int _grade){
		super(_id, _name, _team);
		major = _major;
		grade = _grade;
	}
	
	public void ShowData() {
		System.out.println(id + "\t" + name + "\t" + team.getName() + "\t" + major + "\t" + grade);
	}
}