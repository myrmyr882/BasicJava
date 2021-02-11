package Polymorphism;

public class AbsTesting implements Abstrct{
	public static void main(String[] args) {
		AbsTesting ab = new AbsTesting();
		
	}
	
	public int finding(String d, int b) {
		System.out.println();
		return 8;
	}

	
	public void finding(double a, int b) {
		System.out.println(a + b +"its addition");
	}

	public void finding(double a, float b) {
		System.out.println(a - b +"its substraction");

	}

	@Override
	public int finding(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}