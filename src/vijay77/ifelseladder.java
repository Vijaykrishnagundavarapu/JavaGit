package vijay77;

public class ifelseladder {
	public static void main(String[] args) {
		
		int marks = 65;
		
		if(marks < 55) {
			System.out.println("fail");
		}else if(marks>50 && marks<60) {
			System.out.println("D grade");
		}else if(marks>60 && marks<70) {
			System.out.println("C grade");
		}else if(marks>70 && marks<90) {
			System.out.println("A grade");
		}else {
			System.out.println("invalid");
		}
			
			
	}

}
