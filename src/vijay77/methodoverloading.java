package vijay77;

public class methodoverloading {
	//method with 2 parameters
	public void add(int a , int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	//method with 3 parameters
	
	public void add(double a,int b, int c) {
		double d = a+b+c;
		System.out.println(d);

	}
	//method with 4 parameters
	public void add(double a,int b, int c,int d) {
		
		double e = a+b+c;
		System.out.println(e);

	}
	public static void main(String[] args) {
		methodoverloading obj = new methodoverloading();
				obj .add(5, 6);
		        obj. add(7.5, 8, 11);
		        obj. add(8.3, 3, 5, 6);
	}
	
	
		
}
