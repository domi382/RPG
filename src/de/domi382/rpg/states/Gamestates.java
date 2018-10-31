package de.domi382.rpg.states;

import java.awt.Graphics;

public abstract class Gamestates {
	Gamestates gamestate;
	public Gamestates() {
		
	}
	public Gamestates getState() {
		return (Gamestates) this.gamestate;
	}
	public void setState(Gamestates state) {
		this.gamestate = state;
	}
	public abstract void tick();
	public abstract void render(Graphics g);
}
