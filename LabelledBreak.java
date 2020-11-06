
public class LabelledBreak {
	
	public static void main(String args[]) {
		
		System.out.println("\nLabeled");
		navin:   
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=4;j++) {
				
				if(i==3)
					break navin;
				System.out.print("*");
			}
			System.out.println(" ");
		}	
			
	    System.out.println("\nUnlabeled");
		for(int k=1;k<=4;k++) {
				
			for(int l=1;l<=4;l++) {
					
				if(k==3)
					break;
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
