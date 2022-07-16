
public class TryAndCatch6 {

	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[7]=100/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBonnds Exception occurs");
		}
		catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");

	}

}
/*Output: Arithmetic Exception occurs
          rest of the code
*/