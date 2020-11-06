
public class Bitwise {

	public static void main(String args[]) {
		
		int i=25;
		int j=15;
		int a=i&j;
		int b=i|j;
		System.out.println("Add Bitwise : "+a+"\nOr Bitwise : "+b);
		
		int k=8;
		int l=k<<2;
		int m=k>>2;
		System.out.println("Left Shift : "+l+"\nRight Shift : "+m);
		
		int s=k<<3;
		System.out.println("Left Shift using 3 : "+s);
		
		boolean d=true;
		boolean e=!d;
		System.out.println("Negation : "+e);
		
	}
}
