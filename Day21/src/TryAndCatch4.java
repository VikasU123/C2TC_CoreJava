import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class TryAndCatch4 {
	public void checkFileNotFound() {
		try {
			FileInputStream in = new FileInputStream("input.txt");
			System.out.println("This is not printed");
		}
		catch (Exception fileNotFoundException) {
			System.out.println(fileNotFoundException+"file not found exception");
		}
	}

	public static void main(String[] args) {
		TryAndCatch4 example = new TryAndCatch4();
		example.checkFileNotFound();

	}

}
//Output:java.io.FileNotFoundException: input.txt (The system cannot find the file specified)file not found exception