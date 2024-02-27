package vijay77;

public class childabstract extends egAbstract {
	
	public void display() {
		System.out.println("displaying data");
		
	}
	
	public static void main(String[]  args) {
		egAbstract obj = new childabstract();
		obj.display();
		obj.print();
	}

}
