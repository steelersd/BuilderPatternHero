package com.adam.generators;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FruitGenerator extends Generator <String> {
	private static String[] fruits_ = {"Apple","Mango","Peach","Banana","Orange","Grapes","Watermelon","Tomato"};
	private static List<String> fruits = Arrays.asList(fruits_);
	
	private FruitGenerator () {}
	
	public String generate() {
	    return fruits.get(new Random().nextInt(fruits.size()));
	}
	
}
