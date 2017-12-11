package com.lirfu.neuralstrategy.neural;

import java.util.Random;

import com.lirfu.neuralstrategy.Bounds;

public interface IMutable {
	public void mutate(Random rand, Bounds bounds);

	/**
	 * Checks if the mutation will occur.
	 * 
	 * @param probability
	 *            Calculates if the mutation will occur.
	 */
	public static boolean willMutate(double probability) {
		return new Random().nextInt((int) (100 + 100 * probability)) > 100;
	}
}
