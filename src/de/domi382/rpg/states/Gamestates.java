package de.domi382.rpg.states;

import java.awt.Graphics;

import de.domi382.rpg.main.Game;

public abstract class Gamestates {
	public abstract void tick(Game g);
	public abstract void render(Graphics g);
}
