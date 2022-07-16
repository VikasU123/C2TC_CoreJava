
public class TryAndCatch5 {

	public static void main(String args[]){
		TryAndCatch5 ob = new TryAndCatch5();
		try{
			ob.meth1();
			}
		catch(ArithmeticException e){
			System.out.println("ArithmaticException thrown by meth1() method is caught in main()method");
			}
		}
	public void meth1() {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException nullExp) {
			System.out.println("We have an Exception- "+nullExp);
		}
		System.out.println("Outside try-catch block");
	}
	}
//Output:java.io.FileNotFoundException: input.txt (The system cannot find the file specified)file not found exception