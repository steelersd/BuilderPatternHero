package com.adam.patterns.builder;

import com.adam.generators.IntGenerator;
import com.adam.patterns.factory.GenericFactory;

public class IntGeneratorBuilder {
	private IntGenerator generator; 
	
	public IntGeneratorBuilder () {
		try {
			generator = GenericFactory.getInstance(IntGenerator.class); // No public constructor available
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public IntGeneratorBuilder create () {
		return new IntGeneratorBuilder();
	}

	public IntGeneratorBuilder leftLimit (int limit) {
		generator.setLeftLimit(limit);
		return this;
	}
	
	public IntGeneratorBuilder rightLimit (int limit) {
		generator.setRightLimit(limit);
		return this;
	}	
	
	public IntGenerator build() {
		return generator;
	}
	
}
