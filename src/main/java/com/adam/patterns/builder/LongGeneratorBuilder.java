package com.adam.patterns.builder;

import com.adam.generators.LongGenerator;
import com.adam.patterns.factory.GenericFactory;

public class LongGeneratorBuilder {
	private LongGenerator generator; 
	
	public LongGeneratorBuilder () {
		try {
			generator = GenericFactory.getInstance(LongGenerator.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public LongGeneratorBuilder create () {
		return new LongGeneratorBuilder();
	}

	public LongGeneratorBuilder leftLimit (long limit) {
		generator.setLeftLimit(limit);
		return this;
	}
	
	public LongGeneratorBuilder rightLimit (long limit) {
		generator.setRightLimit(limit);
		return this;
	}	
	
	public LongGenerator build() {
		return generator;
	}
	
}
