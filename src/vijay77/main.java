package vijay77;

public class main {
	public static void main(String[] args) {
        // Create instances of Rectangle, Circle, and Triangle
        rectangle rectangle = new rectangle(5, 3);
        circle1 circle = new circle1(4);
        triangle1 triangle = new triangle1(6, 8);

        // Calculate and display area for each shape
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }

}
