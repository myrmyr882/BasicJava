package Basic4;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet <String> lhs = new LinkedHashSet();
		lhs.add("HTML Tutorial");
		lhs.add("CSS Tutorial");
		lhs.add("JavaScript Tutorial");
		lhs.add("How To Tutorial");
		lhs.add("SQL Tutorial");
		lhs.add("SQL Tutorial");
		lhs.add("html tutorial");
		
		for (String element : lhs) {
		System.out.println(element);
		
		
		}
		
		
	}
}
