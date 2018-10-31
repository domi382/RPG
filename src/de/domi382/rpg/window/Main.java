package de.domi382.rpg.window;

import java.awt.Canvas;

import javax.swing.JFrame;

import de.domi382.rpg.string.Strings;

public class Main extends JFrame{

	public static void main(String[] args) {
		Strings strings = new Strings();
		String version = strings.gamename + " v" + strings.version;
		JFrame window = new JFrame(version);
		Canvas canvas = new Canvas();
		
		
		window.setSize(600,600);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
		
		canvas.setSize(window.WIDTH, window.HEIGHT);
		
		window.add(canvas);
	}

}
