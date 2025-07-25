package Basics;

public class PatternsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern 01: Printing column values in square ");
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pattern 02: Printing row values in square ");
		int val = 1;
		while (val <= 3) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(val + " ");
			}
			System.out.println();
			val++;
		}
		
		System.out.println();
		System.out.println("Pattern 03: Skipping rows");
		for (int row = 1; row <= 5; row = row + 2) {
			for (int col = 1; col <= 6; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pattern 04: Method01: 1 2 3 till 9 in next next line");
		for (int row = 1; row <= 1; row++) {
			for (int col = 1; col <= 9; col++) {
				System.out.print(col + " ");
				if (col % 3 == 0) {
					System.out.println();
				}
			}

		}
		
		System.out.println();
		System.out.println("Pattern 05: Method02: 1 2 3 till 9 in next next line");
		int val1 = 1;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
				System.out.print(val1 + " ");
				val1++;
			}
			System.out.println();

		}
		
		System.out.println();
		System.out.println("Pattern 06: Multiplication in square");
        for(int row=1; row<=5; row++) {
        	for(int col=1; col<=5; col++)
        	{
        		System.out.print(col*row+" ");
        	}
        	System.out.println();
        	
        }
        
        System.out.println();
		System.out.println("Pattern 07: Adding in sqaure");
        for(int row=1; row<=5; row++) {
        	for(int col=1; col<=5; col++)
        	{
        		System.out.print(col*row+" ");
        	}
        	System.out.println();
        	
        }
   
        System.out.println();
		System.out.println("Pattern 10: row and column");
		for(int row=0; row<=4; row++) {
			for(int col=1; col<=5; col++)
        	{
        		System.out.print(col+row+" ");
        		
        	}
        	System.out.println();
		}
		
		 System.out.println();
		 System.out.println("Pattern 11: Left, Ascending 1 to 5, Increasing");
		 for(int row=1; row<=5; row++)
		 {
			 for(int col=1; col<=row; col++)
			 {
				 System.out.print(row+ " ");
			 }
			 System.out.println();
		 }
		 
		
		
		 System.out.println();
		 System.out.println("Pattern 12: Left, Descending 5 to 1, Increasing");
		 for(int row=5; row>=1; row--)
		 {
			 for(int col=5; col>=row; col--)
			 {
				 System.out.print(row+ " ");
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
			System.out.println("Pattern 13: Left, Ascending 1 to 5, Decreasing");
			int val2 = 5;
			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= val2; col++) {
					System.out.print(row + " ");
				}
				System.out.println();
				val2--;
			}
		 
		 System.out.println();
		 System.out.println("Pattern 14: Left, Decending 5 to 1, Decresing");
		 for (int row = 5; row >= 1; row--) {
				for (int col = 1; col <= row; col++) {
					System.out.print(row + " ");
				}
				System.out.println();
			}
			 		 
		 int val4=1;
		 System.out.println();
		 System.out.println("Pattern 15: Left, Ascending 1 to 15, Continous values");
		 for(int row=1; row<=5; row++)
		 {
			 for(int col=5; col>=row; col--)
			 {
				 System.out.print(val4+ "   ");
				 val4++;
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("Pattern 16: Left, Descending 10 to 1, Continous values");
		 int val5=10;
		 for(int row=4; row>=1; row--)
		 {
			 for(int col=4; col>=row; col--)
			 {
				 System.out.print(val5+ " ");
				 val5--;
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("Pattern 17: Right, Ascending 1 to 5, Increasing");
		 for(int row=1; row<=5; row++)
		 {
			 for(int col1=5;col1>row;col1--)
			 {
				 System.out.print(" "+" ");
			 }
             for(int col2=1; col2<=row;col2++) {
            	 System.out.print(row+" ");
            	
             }
             System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("Pattern 18: Right, Descending 5 to 1, Increasing");
		 for(int row=5; row>=1; row--)
		 {
			 for(int col1=1;col1<row;col1++)
			 {
				 System.out.print(" "+" ");
			 }
             for(int col2=5; col2>=row; col2--) {
            	 System.out.print(row+" ");
             }
             System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("Pattern 19: Ascending 1 to 5, Decreasing");
		 for(int row=1; row<=5;row++)
		 {
			 for(int col1=1; col1<=row; col1++)
			 {
				 System.out.print(" "+" ");
			 }
			 for(int col2=5;col2>=row; col2--)
			 {
				 System.out.print(row+" ");
			 }
			 System.out.println();
		 }
		 
		 System.out.println();
		 System.out.println("Pattern 20: Right, Descending 5 to 1, Decreasing");
		 for(int row=5; row>=1;row--)
		 {
			 for(int col1=5; col1>=row;col1--)
			 {
				 System.out.print(" "+" ");
			 }
			 for(int col2=1;col2<=row; col2++)
			 {
				 System.out.print(row+" ");
			 }
			 System.out.println();
		 }
	}

}
