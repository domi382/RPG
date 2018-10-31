package de.domi382.rpg.main;

import java.awt.Canvas;

import javax.swing.JFrame;

import de.domi382.rpg.states.Gamestates;

public class Game {
	public Boolean isRunning = true;
	Gamestates state = new Gamestates();
	public Game(Canvas canvas, JFrame window) {
		
	}
	
	public void run() {
		if (isRunning) {
			//GAME LOOP
		}
	}
}
