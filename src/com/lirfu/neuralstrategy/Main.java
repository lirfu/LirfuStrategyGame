package com.lirfu.neuralstrategy;

import java.io.IOException;

import javax.swing.WindowConstants;

import com.lirfu.neuralstrategy.graphics.Window;
import com.lirfu.neuralstrategy.neural.NeuralNetwork;

public class Main {
	public static void main(String[] args) throws IOException {
		//		try {
		//			SwingUtilities.invokeAndWait(new Runnable() {
		//				@Override
		//				public void run() {
		Window window = new Window();
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//				}
		//			});
		//		} catch (InvocationTargetException | InterruptedException e) {
		//			e.printStackTrace();
		//		}

		new NeuralNetwork("2-3-1");
	}
}
