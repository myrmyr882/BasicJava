package Basic1;
public class Basic{
	
	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("sum is "+c);
		int d =a/b;
		int e =a%b;
		System.out.println("sum"+ d + e);
		
		
		boolean f = a>b ;
		boolean g =a<b;
		boolean h = a==b;
		boolean i= a<=b;
		boolean j = a>=b;
		boolean k =a!=b;
	
		
		
		int l = 5;
		int m= 10;
		int n = 2;
		
		boolean o = l<m & l<n;
		boolean p = m<l & m<n;
		boolean q = n<l & n<m;
		System.out.println("o is" +o);
		System.out.println("p is" + p);
		System.out.println("q is"+ q);	
		
		if (l<m & l<n){
			System.out.println("l is smaller");
		}
		else if (m<l & m<n){
			System.out.println("m is smaller");
		}
		else {
			System.out.println("n is smaller");
		}
		
	}
}