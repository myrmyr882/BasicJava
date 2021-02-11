package Basic4;
import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("HTML Tutorial");
		
		hs.add("CSS Tutorial");
		hs.add("JavaScript Tutorial");
		hs.add("How To Tutorial");
		hs.add("SQL Tutorial");
		hs.add("SQL Tutorial");
		
		for (Object element: hs) {
			System.out.println(element);
		}
		
			
	}
}
