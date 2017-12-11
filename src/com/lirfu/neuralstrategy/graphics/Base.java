package com.lirfu.neuralstrategy.graphics;

import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Base extends JButton {
    private Dimension SIZE = new Dimension(60, 50);

    private Point position;
    private Color color;
    private String name;
    private BaseMenu menu;
    private boolean menuVisible;

    public Base(Point pos, Color color, String name) {
        super();
        this.position = pos;
        this.color = color;
        this.name = name;
        this.menu = new BaseMenu(pos);
        this.menuVisible = false;

        setLocation(pos);
        setFocusable(true);
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

//		addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				menuVisible = !menuVisible;
//				repaint();
//				System.out.println(name);
//			}
//		});

//        addMouseListener(menu.getListener());

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                maybeShowPopup(e);
            }

            public void mouseReleased(MouseEvent e) {
                maybeShowPopup(e);
            }

            private void maybeShowPopup(MouseEvent e) {
                System.out.println("sfhjgfkwgfuwhfkj");
                if (e.isPopupTrigger()) {
                    menu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        //		g.fillOval(position.x - SIZE.width / 2, position.y - SIZE.height / 2, SIZE.width + 6, SIZE.height + 6);
        g.fillRect(position.x - SIZE.width / 2, position.y - SIZE.height / 2, SIZE.width + 1, SIZE.height + 1);
        g.setColor(color);
        g.fillOval(position.x - SIZE.width / 2, position.y - SIZE.height / 2, SIZE.width, SIZE.height);
        g.setColor(Color.BLACK);
        g.drawString(name, position.x - SIZE.width / 2, position.y - SIZE.height / 2);

        if (menuVisible)
            menu.paint(g);
    }
}
