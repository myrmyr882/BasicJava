package Basic2;

public class Encap {
	private String company;
	private String modelno;
	private int price;
	
	public void details(String com, String mdlno){
		if (company ==com && modelno==mdlno){
			System.out.println(price +"   "+ "Is cost of model no " +modelno);
			 
		} else {System.out.println("invalid model no");}
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		this.price = price;
	}	
	
}
