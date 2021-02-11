package Basic4;

import java.util.*;

public class Practice {
	public static void main(String[] args) {
		Student ram = new Student("ram", 1, 5);
		Student aman = new Student("aman", 2, 6);
		Student jaya = new Student("jaya", 3, 7);
		Student ketu = new Student("ketu", 4, 8);
		Student potu = new Student("potu", 5, 9);
		Student ch = new Student("potu", 5, 9);
		
		HashSet <Student> al = new HashSet();
		al.add(ram);
		al.add(aman);
		al.add(jaya);
		al.add(ketu);
		al.add(potu);
		al.add(ch);
		
		for (Student element : al) {
			System.out.println(element);
		}
			
		
	}
	
	
}
