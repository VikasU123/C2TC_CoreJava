
public class SystemExit {

	public static void main(String[] args) {
		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		    System.exit(0);
			System.out.println("Statement 3");
			System.out.println("Statement 4");
		}
		catch(Exception e) {
			System.out.println("Statement 5");
		}
		finally {
			System.out.println("Statement 6");
		}

	}

}
