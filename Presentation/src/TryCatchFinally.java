
public class TryCatchFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("Open database connection");
			System.out.println("Read data");
			System.out.println("Close database connection");
		}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("Close database connection");
		}

	}

}
