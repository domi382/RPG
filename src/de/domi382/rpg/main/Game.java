package de.domi382.rpg.main;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import de.domi382.rpg.states.StateManager;

public class Game {
	StateManager sm = new StateManager();
	public Boolean isRunning = true;
	public Game(Canvas canvas, JFrame window) {
		
	}
	
	public void run() {
		if (isRunning) {
			render();
			tick();
		}
	}
	
	public void render() {
		if(sm.getState() != null) sm.getState().render(null);
	}
	
	public void tick() {
		if(sm.getState() != null) sm.getState().tick(this);
	}
}
