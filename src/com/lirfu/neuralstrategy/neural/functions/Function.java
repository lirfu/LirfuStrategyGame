package com.lirfu.neuralstrategy.neural.functions;

public abstract class Function {
	private double constants[];

	//	protected Function(double[] constants) {
	//		this.constants = constants;
	//
	//		Random rand = new Random();
	//		for (int i = 0; i < constants.length; i++)
	//			this.constants[i] = rand.nextDouble();
	//	}
	//
	//	@Override
	//	public void mutate(Random rand) {
	//
	//	}

	public abstract double calculate(double input);
}
