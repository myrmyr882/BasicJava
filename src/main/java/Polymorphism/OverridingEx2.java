package Polymorphism;

public class OverridingEx2 extends OverridingEx {
	public static void main(String[] args) {
		OverridingEx2 num= new OverridingEx2();
		
		
	  }	
	
	public void finding7(int a, int b) {
	
		if (a<b){
			System.out.println(a+b +"   this is Addition due first parameter is smaller value");
		}else {
			System.out.println(a-b + "   this is Substraction due to first parameter is larger value");
	
		}
	}
	public void finding8(double a, int b) {
		if (a<b){
			System.out.println(a*b +"   this is multiplication due first parameter double is smaller value");
		}else {
			System.out.println(a+b + "   this is addition due to first parameter double is larger value");
		}
	}
	
	
	
	public void finding9(double a, float b) {
		if (a<b){
			System.out.println(a+b +"   this is Addition due first parameter is smaller value");
		}else {
			System.out.println(a-b + "   this is Substraction due to first parameter is larger value");
	
		}
		
	}
	


}