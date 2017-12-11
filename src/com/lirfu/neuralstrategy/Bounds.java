package com.lirfu.neuralstrategy;

public class Bounds {
	private double l;
	private double u;
	private double delta;

	public Bounds(double lbound, double ubound) {
		this.l = lbound;
		this.u = ubound;
		this.delta = ubound - lbound;
	}

	public double lower() {
		return l;
	}

	public double upper() {
		return u;
	}

	public double delta() {
		return this.delta;
	}
}
