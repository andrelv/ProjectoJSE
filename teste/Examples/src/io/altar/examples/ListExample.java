package io.altar.examples;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {

	public static void main(String[] args) {
		List<String> listStrings = new ArrayList <>();
		listStrings.add("Ze carlos");
		listStrings.add("Ze manel");
		
		Iterator<String> it = listStrings.iterator();
		
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		
		
		System.out.println(listStrings);
		
	}
}
