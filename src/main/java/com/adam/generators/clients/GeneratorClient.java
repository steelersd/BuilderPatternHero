package com.adam.generators.clients;

import com.adam.generators.Generator;


/**
 * @author adam
 *
 * @param <K>
 */
public class GeneratorClient<K> {
	private Generator<K> generator;
	
	public void setGenerator(Generator<K> generator) {
		this.generator = generator;
	}
	
	public void displayGenerated() {
		System.out.println(this.generator.generate());
	}
	
	public K getGenerated() {
		return this.generator.generate();
	}

}
