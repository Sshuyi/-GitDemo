package section33;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a [][] = {{2,4,5},
					  {3,4,7}};
		
		for (int i=0; i < a.length; i++) {
		
			for (int j =0; j< 3; j++) {
				
				System.out.print(a[i][j] + " ");
			} System.out.println(" ");
		}

	
	
	int abc [][] = {{2,4,5},
					{3,4,7}, 
					{1,2,9}};
	
	int i;
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	int mincolumn = 0;
	int num =0;
	for (i= 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (abc[i][j] < min) {
				 min = abc[i][j] ;
				 mincolumn = j;
			} 	
			
		}
	}System.out.println(min);
	
//	int k = i;
	//int k = mincolumn;
	for (int k= 0; k < 3; k++) {
		for (int j = 0; j <=mincolumn; j++) {
			if (abc[k][j] > max) {
				 max = abc[k][j] ;
			} 
		
		}
	}System.out.println(max);
	
	
	
	
	}	

}
