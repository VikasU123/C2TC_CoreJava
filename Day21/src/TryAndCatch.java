//Try and Catch
public class TryAndCatch {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try {
			int z=x/y;
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
//Output: java.lang.ArithmeticException: / by zero