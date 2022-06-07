//Program using for, while, do while loop
public class ForWhileDoWhileLoop {

	public static void main(String[] args) 
	{

	  // for loop
	  for(int i=1,j=1; i<10||j<10;i++,j++)
	  { 
		  j++;
		  System.out.println("i="+i+" and j="+j); 
	  }


	  // while loop 
		  int i=1,j=1;
		  while(i<10 || j<10)
		  { 
			  i++; j++;
		      System.out.println("i="+i+" and j="+j); 
		  }	
		
	// Do while loop
		int x = 1,y = 1;
		do {
			x++;
		    y++;
			System.out.println("i=" + x + " and j=" + y);
		    } while (x < 10 || y < 10);
	}
}
/* Output:
i=1 and j=2
i=2 and j=4
i=3 and j=6
i=4 and j=8
i=5 and j=10
i=6 and j=12
i=7 and j=14
i=8 and j=16
i=9 and j=18
i=2 and j=2
i=3 and j=3
i=4 and j=4
i=5 and j=5
i=6 and j=6
i=7 and j=7
i=8 and j=8
i=9 and j=9
i=10 and j=10
i=2 and j=2
i=3 and j=3
i=4 and j=4
i=5 and j=5
i=6 and j=6
i=7 and j=7
i=8 and j=8
i=9 and j=9
i=10 and j=10
*/
