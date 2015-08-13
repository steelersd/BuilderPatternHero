package com.adam.generators;

public abstract class Generator<V> {
	public abstract V generate(); // generate can return Long, int, String...
}
