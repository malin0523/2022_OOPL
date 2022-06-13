package Member;

import Team.team;
import show.Showable;

public abstract class Member implements Showable {
	int id;
	String name;
	team team;
	
	public Member(int _id, String _name, team _team) {
		id = _id;
		name = _name;
		team = _team;
	}
	
	public Member(Member s) {
		id = s.id;
		name = s.name;
		team = s.team;
	}
	
	public void ShowData() {
		System.out.println(id+"\t"+name+"\t"+team.getName()+"\t");
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}

class Student extends Member{
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

class Mentor extends Member{
	String company;
	Mentor(int _id, String _name, team _team, String _company){
		super(_id, _name, _team);
		company = _company;
	}
	
	public void ShowData() {
		System.out.println(id + "\t" + name + "\t" + team.getName() + "\t" + company);
	}
}

