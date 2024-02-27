package vijay77;

public class childint implements int1 {

	
	public void read() {
		System.out.println("reading");
		
	}


	public void write() {
		System.out.println("writing");
		
	}
	
	public static  void main(String[] args) {
		childint obj = new childint();
		obj.read();
		obj.write();
		System.out.println(obj.s1);
	}
	

}
