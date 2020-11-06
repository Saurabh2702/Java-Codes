
public class TernaryOp {
	
	public static void main(String args[]) {
		
		int i=5;
		int j=6;
		int k=j>i?j:i;
		System.out.println("Greater Number is : "+k);
	
		Object ob1;
		ob1=true?new Integer(10):new Double(15.3); //Deprecated after Java 9
		System.out.print("Converted to double because of ternary : "+ob1);	
		
	}

}
