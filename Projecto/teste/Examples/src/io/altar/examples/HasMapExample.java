package io.altar.examples;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class HasMapExample {
	public static void main(String[] args) {
		Map <String, String> stringMap = new HashMap <String, String>();
		
		stringMap.put("1", "Ze carlos");
		stringMap.put("2", "Ze manel");
		
		Iterator<String> stringIterator = stringMap.values().iterator();
		
		while (stringIterator.hasNext()){
			System.out.println("String Value :" +stringIterator.next());}
		
		Iterator<String> stringKeyIterator = stringMap.keySet(). iterator();
		
		while (stringIterator.hasNext()) {
			System.out.println("String Value" +stringKeyIterator.next());
		}
	}
}



