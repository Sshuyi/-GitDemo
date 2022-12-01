package section33;

public class NestedLoop {

	public static void main(String[] args) {
		int k =1;
		for (int i=0; i<4; i++) { //outer for loop
			//System.out.print();
			
			for(int j=1; j<=4-i; j++) { // inner for loop
				System.out.print(k + " ");
				k++;
			}
			System.out.println("\n ");
			
		}
		
		int l =1;
		for (int m = 0; m <4; m++) {
			for (int a = 0; a <=m ; a++) {
				System.out.print(l + " ");
				l++;
			} System.out.println("\n");
		}
		

// Two ways of writing it
		 l =1;
		for (int m = 0; m <4; m++) {
			for (int a = 0; a <=m ; a++) {
				System.out.print(l + " ");
				l++;
			} l=1;
			System.out.println("\n");
		}
		
		
			for (int m = 0; m <4; m++) {
				for (int a = 0; a <=m ; a++) {
					System.out.print(a+1 + " ");	
				} 
				System.out.println("\n");
			}
		
// Add, more than 1
			 l =3;
				for (int m = 0; m <4; m++) {
					for (int a = 0; a <=m ; a++) {
						System.out.print(l + " ");
						l+=3;
					} 
					System.out.println("\n");
				}
		
		
		
		
		
 
	}

}
