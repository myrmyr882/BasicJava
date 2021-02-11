package Basic2;
public class Encaptest2 {
	public static void main(String[] args) {
		
			Encap company1 = new Encap();
			company1.setCompany("motrola");
			company1.setModelno("g5");
			company1.setPrice(800);
			
			System.out.println(company1.getCompany()+"   " +company1.getModelno()+"   cost is "+company1.getPrice());
			Encaptest2 obj = new Encaptest2();
			obj.part2();
	}
	
	public void part2() {
		Encap company2 = new Encap();
		company2.setCompany("huawei");
		company2.setModelno("p10");
		company2.setPrice(700);
		
		System.out.println(company2.getCompany()+"   " +company2.getModelno()+"   cost is "+company2.getPrice());
	}

}
