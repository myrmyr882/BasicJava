package Inheritance;

public class Google extends Alphabet {
	
	public static void main(String[] args)  {
		Google g = new Google();
		try {
			g.m2();
		} catch (Exception e1) {
			System.out.println("error occured");
		}finally {
			System.out.println("its final");
		}
		
		
		
		

	}
	
	static void meth() throws Exception {
		
	}
}
		
		

