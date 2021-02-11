package Basic2;
public class CalculatorTest {
public static void main(String[] args) {
	
	
	Calculator cal = new Calculator();
	//cal.sum(2, 9);
	//int y=Calculator.sub(x,5);
	//int z=cal.mul(7, 8);
	//System.out.println(x);
	//System.out.println(y);
	//System.out.println(z);
	
	Calculator ybank = new Calculator();
//int pin = ybank.getPin(12347);
//	System.out.println(pin);
//	
//	ybank.changePin(12345, 1234, 7474);
	ybank.setAccno(7777);
	ybank.setPin(1414);
	
	int yac =ybank.getAccno();// yac = 1234; yac = 7777' yac = 8888;
	int ypn = ybank.getPin(yac);// == ybank.getAccno() = yac
	System.out.println(yac+"<Acno  - Pin> "+ypn);
	
	
	
	Calculator sBank =new Calculator();
	sBank.setAccno(8888);
	sBank.setPin(1515);
	
	System.out.println(sBank.getAccno()+"<Acno  - Pin> "+sBank.getPin(sBank.getAccno()));
	
}
}
