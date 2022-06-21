import java.util.*;
public class Arrays7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int max = 0;
		for(int i=0;i<a;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
/*Output:
5
10 40 20 13 14
40
*/