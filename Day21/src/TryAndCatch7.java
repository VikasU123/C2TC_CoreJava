
public class TryAndCatch7 {

	public static void main(String[] args) {
		String[] s = {"abc", "123", null, "xyz"};
		for (int i = 0; i < 5; i++){
			try{
				int a = s[i].length() + Integer.parseInt(s[i]);
				}
			catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundException ex){
				System.out.println("Handles above mentioned three Exception");
				}
			}
		}
	}
