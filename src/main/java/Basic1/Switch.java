package Basic1;
public class Switch {
public static void main(String[] args) {
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	int e = 5;
	int f = 6;
	int g = 7;
	int h = 8;
	
	int key = 2 ;
	switch(key){
		case 1:
			System.out.println("you pressed  " + a);
			break;
		
		case 2:
			System.out.println("you pressed  " +b);
			break;
		
		case 3:
			System.out.println("you pressed  "+c);
			break;
		
		case 4:
			System.out.println("you pressed  "+d);
			break;
		case 5:
			System.out.println("you pressed  " +e);
			break;

		case 6:
			System.out.println("you pressed  " +f);
			break;
			
		case 7:
			System.out.println("you pressed  " +g);
			break;
			
		case 8:
			System.out.println("you pressed  "+h);
			break;
		
		
		default:
			System.out.println("Don't Complicate");
		
	}
}
}
