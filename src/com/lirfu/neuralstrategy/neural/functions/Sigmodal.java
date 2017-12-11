package com.lirfu.neuralstrategy.neural.functions;

public class Sigmodal extends Function {
	@Override
	public double calculate(double input) {
		double out = 1. / (1 + Math.exp(-input));
		if (out < 0)
			return 0;

		return out;
	}

}
