package com.lirfu.neuralstrategy;

import com.lirfu.neuralstrategy.graphics.Base;

public class Player {
	private Base base;
	private String name;

	public Player(Base base, String name) {
		this.base = base;
		this.name = name;
	}

	public Base base() {
		return this.base;
	}

	public String name() {
		return this.name;
	}
}
