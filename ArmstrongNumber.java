
public class ArmstrongNumber {

	public static void main(String[] Args) {
		
		int n=153;
		int temp=n;
		int r,sum=0;
		
		while(temp>0)
		{
			r=temp%10;
			temp=temp/10;
			sum=sum+r*r*r;
		}
		
		if(n==sum)
			System.out.println(n+" is an Armstrong Number");
		else
			System.out.println(n+" is not an Armstrong Number");
	}
}
