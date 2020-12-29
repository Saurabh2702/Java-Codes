
public class Palindrome {

	public static void main(String args[]) {
		
		int n=1221;
		int temp=n;
		int rev=0;
		int rem;
		while(temp>0) {
			
			rem=temp%10;
			temp=temp/10;
			rev=rev*10+rem;
		}
		if(rev==n)
		       System.out.print("Number is Palindrome");
		else
			   System.out.print("Number is not Palindrome ");
	}
}
