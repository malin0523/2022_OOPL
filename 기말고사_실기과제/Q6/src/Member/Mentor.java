package Member;

import Team.team;

public class Mentor extends Member {
	String company;
	Mentor(int _id, String _name, team _team, String _company){
		super(_id, _name, _team);
		company = _company;
	}
	
	public void ShowData() {
		System.out.println(id + "\t" + name + "\t" + team.getName() + "\t" + company);
	}
}
