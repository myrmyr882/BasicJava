package Basic2;

public class Calculator {

	private int accno;
	private int pin ;
	
	
	
	public void setAccno(int accno) {
		this.accno =accno;
	}
	
	public int getAccno() {
		return accno;
	}
	public void setPin(int pin)
	{
		this.pin = pin;
	}
	
	public int getPin(int acc){
		if (acc == this.accno) {
			//System.out.println("Its your pin" + pin);
			return this.pin;
		} else {
			System.out.println("invalid Accno");
			return 0;

		}			

	}
	public void changePin(int acc,int oldpin ,int newpin) { 
		if (acc == this.accno && oldpin== this.pin ) {
			pin = newpin; 
			
			System.out.println(this.pin);
		} else {
			System.out.println("invalid credentials");

		}
	}
	
	
	public int sum (int a,int b) {//non static
		System.out.println("This is Sum :"+(4+5));
		int j = Calculator.sub(4, 5);
		return  (a+b);
	}
	public static int sub(int a,int b) {//static
		System.out.println("This is Sub:");
		Calculator clc2 = new Calculator();
		return(a-b);
	}
	public int mul(int a,int b) {//non static
		System.out.println("This is Mul:");
		Calculator clc3= new Calculator();return(a*b);
	}
}

