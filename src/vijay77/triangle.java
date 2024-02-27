package vijay77;

class triangle extends Shape {

	
	void calculateArea(int b,int h) {
		double area = 0.5*b*h;
		System.out.println(area);
		
		
	}

	
	void calculatePerimeter(int a, int b,int c) {
		double perimeter = a+b+c;
		System.out.println(perimeter);
		
		
	}
	public static void main(String[]  args) {

		triangle obj = new triangle();
		obj.calculateArea(5, 6);
		obj.calculatePerimeter(2, 5, 6);
		
	}
		
	
	
}
 
	