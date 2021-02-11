package Basic1;

public class Array {
	public static void main(String []args) {
		int []odd = new int[4];
		odd[0]= 1;
		odd[1]=3;
		odd[2]=5;
		odd[3]=7;
		for (int k = 0; k<odd.length; k++) {
			if(odd[k]<=5) {
			System.out.println(odd[k]);
			}
		}
	}
}
