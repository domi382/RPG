package de.domi382.rpg.states;

public class StateManager {
	Gamestates gamestate;
	public Gamestates getState() {
		return (Gamestates) this.gamestate;
	}
	public void setState(Gamestates state) {
		this.gamestate = state;
	}
}
