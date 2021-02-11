package Polymorphism;

public  class OverridingEx {
	
	public void finding1(int a, int b) {
		if (a<b){
			System.out.println(a*b +"   this is multiplication due first parameter is smaller value");
		}else {
			System.out.println(a+b + "   this is addition due to first parameter is larger value");
		}	
	}
	

	public void finding2(double a, int b) {
		if (a<b){
			System.out.println(a*b +"   this is multiplication due first parameter double is smaller value");
		}else {
			System.out.println(a+b + "   this is addition due to first parameter double is larger value");
		}
	}
	public void finding3(double a, float b) {
		if (a<b){
			System.out.println(a*b +"   this is multiplication due first parameter double is smaller value");
		}else {
			System.out.println(a+b + "   this is addition due to first parameter double is larger value");
		}
	}
	
	public void finding4(int c , int d, int e) {
		if (c < d && d < e) {
			System.out.println("Given numbers are in increasing order");
		}else {
			System.out.println("Given numbers are not in  increasing order");
			}
		}
	
	public void add5(String a, String b) {
		System.out.println(a +"   "+ b);
	}
	
	public void add6(String a, int b) {
		System.out.println(a+"   "+b);
	}
	
	
	
}

