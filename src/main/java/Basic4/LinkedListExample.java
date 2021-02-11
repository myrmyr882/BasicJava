package Basic4;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList();
		
		ll.add("HTML Tutorial");
		ll.add("CSS Tutorial");
		ll.add("JavaScript Tutorial");
		ll.add("How To Tutorial");
		ll.add("SQL Tutorial");
		ll.add("SQL Tutorial");
		
		for (String element : ll) 
		{ 
		    System.out.println(element);
		}
	}

}
