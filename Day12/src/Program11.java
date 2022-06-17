
public class Program11 {

public static void main(String[] args) {
      for(int i = 0; i<= 2; i++) {
         for (int j = i; j<=5; j++) {
            if(j == 4) {
            continue;
            }
         System.out.println(j);
         }

      }

  }
}
/*Output:
1
2
3
4
6
*/