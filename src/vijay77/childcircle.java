package vijay77;

class childcircle extends Shape{
	void calaculateArea(int r) {
		double pi = 3.14;
		double area = pi*r*r;
		System.out.println(area);
	}
	void calculatePerimeter(int r) {
		double pi = 3.14;
		double perimeter = 2*pi*r;
		System.out.println(perimeter);
	}
	public static void main(String[]  args) {
		childcircle obj = new childcircle();
		obj.calaculateArea(5);
		obj.calculatePerimeter(4);
	}
}
	


