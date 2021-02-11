package Basic4;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet ts = new  TreeSet();
		ts.add("HTML Tutorial");
		ts.add("CSS Tutorial");
		ts.add("JavaScript Tutorial");
		ts.add("How To Tutorial");
		ts.add("SQL Tutorial");
		ts.add("SQL Tutorial");
		ts.add("html tutorial");
		
		for (Object element : ts) {
			System.out.println(element);
		}	
	}
}
