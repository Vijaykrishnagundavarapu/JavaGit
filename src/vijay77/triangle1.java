package vijay77;

public class triangle1 {
	private double base;
    private double height;

    // Constructor
    public triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of getArea() method for Triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

}
