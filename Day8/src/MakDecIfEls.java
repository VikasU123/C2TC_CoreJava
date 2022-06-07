//Making decision with if else
public class MakDecIfEls {

	public static void main(String[] args) {
		int x = 5;

		 if (x == 5) 
		  { 
		  if (x >= 5) 
		  {
		  	System.out.println("X is greater than 5"); 
		   }
		  else 
		  {
		  System.out.println("X is smaller than 5"); 
		  } 
		 }
		
		if(x == 5)
		{
			System.out.println("X equals to 5");
		}
		else if(x > 5)
		{
			System.out.println("X is greater to 5");		
		}
		else 
		{
			System.out.println("X is smaller than 5");
		}

	}

}
/* Output: 
X is greater than 5
X equals to 5
*/
