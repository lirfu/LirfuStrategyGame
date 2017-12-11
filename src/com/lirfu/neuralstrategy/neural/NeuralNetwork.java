package com.lirfu.neuralstrategy.neural;

import java.util.LinkedList;

import com.lirfu.neuralstrategy.neural.functions.Sigmodal;

public class NeuralNetwork {
	private int[] structure;
	private LinkedList<LinkedList<Neuron>> neurons;

	/**
	 * 
	 * @param structureString
	 *            example: "2-3-1"
	 */
	public NeuralNetwork(String structureString) throws IllegalArgumentException {
		String[] parts = structureString.split("-");
		this.structure = new int[parts.length];

		if (parts.length < 3)
			throw new IllegalArgumentException("Must have at least 1 hidden layer.");

		for (int i = 0; i < parts.length; i++) {
			this.structure[i] = Integer.parseInt(parts[i]);

			if (structure[i] < 1)
				throw new IllegalArgumentException("Layer can't have zero or negative number of neurons.");
		}

		neurons = new LinkedList<>();
		for (int layer = 1; layer < structure.length; layer++) {
			LinkedList<Neuron> layerVect = new LinkedList<>();

			for (int n = 0; n < structure[layer]; n++) {
				layerVect.add(new Neuron(structure[layer - 1], new Sigmodal()));
			}
			neurons.add(layerVect);
		}
	}

	public double[] getResult(double[] inputs) throws IllegalArgumentException {
		if (inputs.length != inputsNumber())
			throw new IllegalArgumentException("Illegal number of inputs given. (" + inputs.length + ")");

		double[] lastOutputs = inputs;

		for (int layer = 1; layer < structure.length; layer++) {
			double[] thisOutput = new double[structure[layer]];

			for (int neuron = 0; neuron < thisOutput.length; neuron++) {
				thisOutput[neuron] = neurons.get(layer - 1).get(neuron).calculate(lastOutputs);
			}

			lastOutputs = thisOutput;
		}

		return lastOutputs;

	}

	public int inputsNumber() {
		return structure[0];
	}

	public int outputsNumber() {
		return structure[structure.length - 1];
	}
}
