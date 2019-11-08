package com;

import java.util.ArrayList;

public class Players {

	private ArrayList<Players> players = new ArrayList<Players>();
	private String name;
	
	public Players(String name){
		this.name = name;
	}

	public ArrayList<Players> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Players> players) {
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


