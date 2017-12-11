package com.lirfu.neuralstrategy.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JLayeredPane;

import com.lirfu.neuralstrategy.Player;

public class GameBoard extends JLayeredPane {
	private Player p1, p2;

	public GameBoard() {
		setBackground(Color.decode("0x66aa66"));

		this.p1 = new Player(new Base(new Point(200, 200), Color.BLUE, "Base1"), "Player1");
		this.p2 = new Player(new Base(new Point(600, 400), Color.RED, "Base2"), "Player2");

		add(p1.base(), 1, 0);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		p1.base().paint(g);
		p2.base().paint(g);
	}
}
