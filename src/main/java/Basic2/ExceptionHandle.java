package Basic2;

import org.omg.CORBA.ExceptionList;

public class ExceptionHandle {
	static void m2() throws Exception {
		String w = "Encyclopedia";
		char x= w.charAt(55);
		System.out.println(x);
		
	}
	public static void main(String[] args) throws Exception {
		
		try {
			m2();
		} catch (Exception e1) {
			System.out.println("error occured");
		}finally {
			System.out.println("its final");
		}
		throw new Exception ("error2");
		
		
		

	}
}
