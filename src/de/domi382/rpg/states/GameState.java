package de.domi382.rpg.states;

import java.awt.Color;
import java.awt.Graphics;

import de.domi382.rpg.main.Game;

public class GameState extends Gamestates{

	@Override
	public void tick(Game g) {
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 20, 20);
	}

}
