package com.adam.generators;

import org.apache.commons.math3.random.RandomDataGenerator;

public class LongGenerator extends Generator <Long> {
	private long leftLimit = 10L;
	private long rightLimit = 100L;
	
	private LongGenerator() {}
	
	public Long generate() {
	    return new RandomDataGenerator().nextLong(this.leftLimit, this.rightLimit);
	}

	public long getLeftLimit() {
		return leftLimit;
	}

	public void setLeftLimit(long leftLimit) {
		this.leftLimit = leftLimit;
	}

	public long getRightLimit() {
		return rightLimit;
	}

	public void setRightLimit(long rightLimit) {
		this.rightLimit = rightLimit;
	}

}
