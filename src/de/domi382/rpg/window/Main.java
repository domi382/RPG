package de.domi382.rpg.window;

import java.awt.Canvas;

import javax.swing.JFrame;
import javax.swing.JLabel;

import de.domi382.rpg.main.Game;
import de.domi382.rpg.string.Strings;

public class Main extends JFrame{

	public static void main(String[] args) {
		Strings strings = new Strings();
		String version = strings.gamename + " v" + strings.version;
		JFrame window = new JFrame(version);
		Canvas canvas = new Canvas();
		Game game = new Game();
		JLabel label = new JLabel(strings.gamename);
		
		window.setSize(600,600);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
		
		canvas.setSize(window.WIDTH, window.HEIGHT);
		
		window.add(canvas);
		window.add(label);
		
		game.start(canvas, window);
	}

}
