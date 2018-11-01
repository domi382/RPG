package de.domi382.rpg.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import de.domi382.rpg.states.GameState;
import de.domi382.rpg.states.MenuState;
import de.domi382.rpg.states.PauseState;
import de.domi382.rpg.states.StateManager;

public class Game implements Runnable{
	private Thread t;
	public BufferStrategy bs;
	public Graphics g;
	StateManager sm = new StateManager();
	public Boolean isRunning = true;
	public Canvas canvas = new Canvas();
	GameState gs = new GameState();
	PauseState ps = new PauseState();
	MenuState ms = new MenuState();
	
	public Game(Canvas canvas, JFrame window) {
		sm.setState(gs); 
		canvas.createBufferStrategy(3);
	}
	
	public void init() {
		
	}
	
	public void run() {
		if (isRunning) {
			render(g);
			tick();
		}
	}
	
	public void start () {
	      if (t == null) {
	         t = new Thread (this, "Game");
	         t.start ();
	      }
	   }
	
	public void render(Graphics g) {
		if(sm.getState() != null) sm.getState().render(null);
		bs = canvas.getBufferStrategy();
        g = bs.getDrawGraphics();
	}
	
	public void tick() {
		if(sm.getState() != null) sm.getState().tick(this);
	}
}
