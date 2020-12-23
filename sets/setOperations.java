package sets;

import java.util.*;

public class setOperations {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		
		System.out.println(fruits);
		
		Set<String> fruits2 = new HashSet<>();
		fruits2.add("Apple");
		//ruits2.add("B");
		//fruits2.add("K");
		System.out.println(fruits2);
		
				
		
		//fruits.addAll(fruits2);
		System.out.println(fruits.containsAll(fruits2));
		
		
		
	}

}
