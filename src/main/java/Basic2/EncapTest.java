package Basic2;
public class EncapTest {
	public static void main(String[] args) {
		Encap item1 = new Encap();
		
		item1.setCompany("apple");
		item1.setModelno("xs");
		item1.setPrice(1100);
		
		item1.details("apple", "k");
		
		
		Encap item2=new Encap();
		item2.setCompany("samsung");
		item2.setModelno("S10");
		item2.setPrice(900);
		item2.details("samsung", "S10");
		
		part2();
		
		
	}
	public static void part2() {
		Encap item3=new Encap();
		item3.setCompany("google");
		item3.setModelno("pixel");
		item3.setPrice(600);
		item3.details("google", "pixel");

	}
	
}
