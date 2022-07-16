import java.io.*;
public class TryAndCatch3 {

	public static void main(String[] args) {
		try {
			int[] arr=new int[] {7,11,30,63};
			System.out.println(arr[5]);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
//Output: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4