package com.lirfu.neuralstrategy.neural;

import java.util.Random;

import com.lirfu.neuralstrategy.Bounds;

public class Scope {
	private Bounds BIAS_BOUNDS = new Bounds(-100, 100);
	private double MUT_PROBAB = 0.25;

	private Random rand = new Random();

	public Bounds biasBounds() {
		return this.BIAS_BOUNDS;
	}
}
