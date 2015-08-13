package com.adam.generators;

import org.apache.commons.math3.random.RandomDataGenerator;

public class IntGenerator extends Generator <Integer> {
	private int leftLimit = 500;
	private int rightLimit = 700;
	
	private IntGenerator () {}
	
	public Integer generate() {
	    return new RandomDataGenerator().nextInt(leftLimit, rightLimit);
	}
	
	public int getLeftLimit() {
		return leftLimit;
	}

	public void setLeftLimit(int leftLimit) {
		this.leftLimit = leftLimit;
	}

	public int getRightLimit() {
		return rightLimit;
	}

	public void setRightLimit(int rightLimit) {
		this.rightLimit = rightLimit;
	}
	
}
