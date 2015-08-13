package com.adam.patterns.factory;

import java.lang.reflect.Constructor;

public class GenericFactory  {

   public static <T> T getInstance(Class<T> type) throws Exception {
	   Constructor<T> constructor =  type.getDeclaredConstructor(new Class[0]);
		constructor.setAccessible(true);
		return (T) constructor.newInstance();	
   }
}
