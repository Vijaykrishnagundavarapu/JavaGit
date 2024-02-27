package vijay77;

public class multipleclass extends childclass {
	String s3 = "hyderabad";
	
	public void print2 () {
		System.out.println("vijay");
	}
  
  public static void main(String[] args) {
	  multipleclass obj = new multipleclass();
	  System.out.println(obj.s1);
	  System.out.println(obj.s2);
	  obj.print();
	  obj.display();
	  obj.print2();
  }
}
  