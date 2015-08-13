package com.adam.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.adam.generators.FruitGenerator;
import com.adam.generators.LongGenerator;
import com.adam.generators.clients.GeneratorClient;
import com.adam.patterns.builder.FruitGeneratorBuilder;
import com.adam.patterns.builder.LongGeneratorBuilder;
import com.adam.patterns.factory.GenericFactory;

public class GeneralTests {

	@Test
	public void getInstanceTest() throws Exception {
		LongGenerator generator = GenericFactory.getInstance(LongGenerator.class);
		assertThat(generator, instanceOf(LongGenerator.class));
	}
	
	@Test
	public void longGeneratorReturnValueTest() throws Exception {
		LongGenerator generator = GenericFactory.getInstance(LongGenerator.class);
		assertThat(generator.generate(), instanceOf(Long.class));
	}	
	
	@Test
	public void fruitGeneratorReturnValueTest() throws Exception {
		FruitGenerator generator = GenericFactory.getInstance(FruitGenerator.class);
		assertThat(generator.generate(), instanceOf(String.class));
	}	
	
	@Test
	public void longGeneratorReturnValueWithBuilderTest() throws Exception {
		LongGeneratorBuilder buider = new LongGeneratorBuilder();
		LongGenerator generator = buider.create().leftLimit(20L).rightLimit(300L).build();
		assertThat(generator.generate(), instanceOf(Long.class));
	}	

	@Test
	public void longGeneratorClientTest() throws Exception {
		LongGeneratorBuilder buider = new LongGeneratorBuilder();
		LongGenerator generator = buider.create().leftLimit(20L).rightLimit(300L).build();
		GeneratorClient<Long> client = new GeneratorClient<Long>();
		client.setGenerator(generator);
		client.displayGenerated();
		assertThat(client.getGenerated(), instanceOf(Long.class));
	}
	
	@Test
	public void fruitGeneratorClientTest() throws Exception {
		FruitGeneratorBuilder buider = new FruitGeneratorBuilder();
		FruitGenerator generator = buider.create().build();
		GeneratorClient<String> client = new GeneratorClient<String>();
		client.setGenerator(generator);
		client.displayGenerated();
		assertThat(client.getGenerated(), instanceOf(String.class));
	}	
	
	
}
