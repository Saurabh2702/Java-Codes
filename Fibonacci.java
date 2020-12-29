
public class Fibonacci {

public static void main(String args[]) {
		
		int n=0;
		int m=1;
		System.out.print("0 1 ");
		int k;
		for(int i=0;i<=20;i++) {
			
			k=n+m;
			System.out.print(k+" ");
			n=m;
			m=k;
			
		}

     }
}

