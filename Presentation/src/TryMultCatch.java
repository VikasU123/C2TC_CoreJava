
public class TryMultCatch {

	public static void main(String[] args) {
		try {
			System.out.println("try block start");
			System.out.println("Statement 1");
			int b = 10/0;
			int arr[] = {1,2,3};
			System.out.println(arr[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Statement 2");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Statement 3");
		}
		catch(Exception e) {
			System.out.println("Statement 4");
		}
		System.out.println("Statement 5");

	}

}
