package vijay77;

public class exceptionhandling {
	public static void main(String[] args) {
		try {
			int data = 100/0;
			
		}  catch(ArithmeticException e ) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("finally block is executed always");
			
		}
	}

}
