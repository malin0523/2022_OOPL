package Team;

public class team {
	int id;
	String name;
	
	team(int _id, String _name){
		id = _id;
		name = _name;
	}
	
	public void ShowData() {
		System.out.println(id + "\t\t" + name);
	}
	
	public int getTeamID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
