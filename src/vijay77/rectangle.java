package vijay77;

public class rectangle implements shape1 {
	private double length;
    private double width;

    // Constructor
    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of getArea() method for Rectangle
    public double getArea() {
        return length * width;
    }
   
}


class access{
	public static void main(String[]  args) {
		rectangle obj = new rectangle();
		obj.getarea(5,6);
	
	}
}

