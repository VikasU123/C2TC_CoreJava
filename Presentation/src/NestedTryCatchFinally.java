import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NestedTryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			  try {
				  System.out.println("Statement 3");
			  }
			  catch(Exception e) {
				
			}
			System.out.println("Statement 4");
			System.out.println("Statement 5");
		}
		catch(Exception e) {
			System.out.println("Statement 6");
		}
		finally {
			System.out.println("Statement 7");
		}

	}

}
