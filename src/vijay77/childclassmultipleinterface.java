package vijay77;

public class childclassmultipleinterface implements interface1,interface2{


	public void writestatus() {
		System.out.println("writing");
	
		
		
	}

	
	public void readstatus() {
		System.out.println("reading");
		
	}
	
	public static void main(String[]  args) {
		childclassmultipleinterface obj = new childclassmultipleinterface();
		obj.readstatus();
		obj.writestatus();
	
	}

}
