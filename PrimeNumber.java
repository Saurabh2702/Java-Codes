
public class PrimeNumber {

	public static void main(String[] Args) {
		
		int n=83;
		boolean isPrime=true;
		
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
			System.out.println("It is Prime Number");
		else
			System.out.println("It is not a Prime number");
	}
}
