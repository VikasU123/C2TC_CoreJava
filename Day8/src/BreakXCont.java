//Program using break and continue
public class BreakXCont 
{
	public static void main(String[] args) 
	{	
         for(int i=1; i<=10; i++)
         {
        	 if(i == 1)
        	 {
        		 break;    //continue;
        	 }
        	 System.out.println(i);
         }
	}
}
/*Output continue
 * 2
3
4
5
6
7
8
9
10
Output break
empty
*/