package Team;

import Member.*;
import show.Showable;

public class team implements Showable {
	int id;
	String name;
	Member[] marr;
	int index;
	
	team(int _id, String _name){
		id = _id;
		name = _name;
		marr = new Member[50];
		index = 0;
		
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
	
	public Member[] getMList() {
		return marr;
	}
	public int getIndex() {
		return index;
	}
	public void ppIndex() {
		index++;
	}
}
