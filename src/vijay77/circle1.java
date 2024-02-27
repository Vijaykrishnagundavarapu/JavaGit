package vijay77;

public class circle1 {
	private double radius;

    // Constructor
    public circle1(double radius) {
        this.radius = radius;
    }

    // Implementation of getArea() method for Circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
