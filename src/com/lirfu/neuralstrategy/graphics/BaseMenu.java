package com.lirfu.neuralstrategy.graphics;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class BaseMenu extends JPopupMenu {
    private Point position;
    private Dimension SIZE = new Dimension(50, 30);

//	public BaseMenu(Point pos) {
//		this.position = new Point(pos);
//		this.position.move(-10, -10);
//	}
//
//	@Override
//	public void paint(Graphics g) {
//		super.paint(g);
//		Point p = new Point(position);
//		for (Unit u : Unit.units) {
//			g.setColor(Color.lightGray);
//			g.fillOval(p.x, p.y, 10, SIZE.height);
//			g.setColor(Color.black);
//			g.drawString(u.getName(), p.x, p.y);
//		}
//	}

    public BaseMenu(Point pos) {
        JMenuItem menuItem = new JMenuItem("A popup menu item");
        this.add(menuItem);
        menuItem = new JMenuItem("Another popup menu item");

        this.add(menuItem);
    }

//    public MouseAdapter getListener(){
//        return new PopupListener();
//    }
//
//    private class PopupListener extends MouseAdapter {
//        public void mousePressed(MouseEvent e) {
//            maybeShowPopup(e);
//        }
//
//        public void mouseReleased(MouseEvent e) {
//            maybeShowPopup(e);
//        }
//
//        private void maybeShowPopup(MouseEvent e) {
//            if (e.isPopupTrigger()) {
//                BaseMenu.this.show(e.getComponent(),
//                        e.getX(), e.getY());
//            }
//        }
//    }
}
