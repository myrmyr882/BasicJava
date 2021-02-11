package Basic1;

public class ClassAndVariable {
	int a;
	String yesh;
	int b;
	int j;

	public static void main(String[] args) {
		//step1 creating object
		ClassAndVariable cv =new ClassAndVariable();
		
		
		//step 2  calling method using that object
		cv.yesh2();
		
		
		//step 3 print response

	}
	public static void yesh(String[] args) {
		ClassAndVariable obj =new ClassAndVariable();
		obj.j =25;
			System.out.println(obj.j);
		
		
	}
	
	public int sum(int a , int b) {
		
		return a+b;
	}
	public void yesh2() {
		System.out.println("output");
	}
}