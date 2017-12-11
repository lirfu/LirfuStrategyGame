package com.lirfu.neuralstrategy.neural;

import com.lirfu.neuralstrategy.neural.functions.Function;

public class Neuron {
	private Function function;
	public double[] weights;

	public Neuron(int inputs, Function outputFunction) {
		this.function = outputFunction;
		this.weights = new double[inputs];
	}

	public double calculate(double[] inputs) {
		double sum = 0;
		for (int i = 0; i < inputs.length; i++)
			sum += this.weights[i] * inputs[i];

		return function.calculate(sum);
	}
}
