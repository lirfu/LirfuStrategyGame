package com.lirfu.neuralstrategy.graphics;

import javax.swing.JFrame;

public class Window extends JFrame {
	public Window() {
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);

		add(new GameBoard());
	}
}
