package com.adam.patterns.builder;

import com.adam.generators.FruitGenerator;
import com.adam.patterns.factory.GenericFactory;

public class FruitGeneratorBuilder {
	private FruitGenerator generator; 
	
	public FruitGeneratorBuilder () {
		try {
			generator = GenericFactory.getInstance(FruitGenerator.class); // No public constructor available
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public FruitGeneratorBuilder create () {
		return new FruitGeneratorBuilder();
	}


	public FruitGenerator build() {
		return generator;
	}
	
}
