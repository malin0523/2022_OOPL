package Mentor;

import Team.team;

public class mentor {
	int id;
	String name;
	team team;
	String company;
	
	public mentor(int _id, String _name, team _team, String _company) {
		id = _id;
		name = _name;
		team = _team;
		company = _company;
	}
	
	public mentor (mentor s) {	
		id = s.id;
		name = s.name;
		team = s.team;
		company = s.company;
	}
	
	public void ShowData() {
		System.out.println(id + "\t" + name + "\t" + team.getName() + "\t" + company);
	}
	
	public String getName() {
		return name;
	}
}
