
public class SwappingNumbers {

	public static void main(String[] args)
	{   
		System.out.println("Consumes Most Memory");
		int a=5;
		int b=4;
		int temp;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);

		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		System.out.println("Memory Saving");
		a=6;
		b=7;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		System.out.println("Most Memory Saving");
		a=8;
		b=9;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);

		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("Swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);

	}
}
