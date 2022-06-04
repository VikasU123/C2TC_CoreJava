
public class InitiObjectByMet {
	int rollno;
	String name;
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}
}

class Student{
	public static void main(String[] args) {
		InitiObjectByMet s1 = new InitiObjectByMet();
		InitiObjectByMet s2 = new InitiObjectByMet();
		s1.insertRecord(111, "vikas");
	    s2.insertRecord(222, "sanjay");
	    s1.displayInformation();
	    s2.displayInformation();

	}

}
