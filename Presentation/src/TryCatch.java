
public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("try block start");
			int a = 11/0;
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println("try block end");
		}
		catch(Exception e){
			System.out.println("catch block start");
			System.out.println("Statement 3");
			System.out.println("catch block close");
		}
		System.out.println("Statement 4");

	}

}
