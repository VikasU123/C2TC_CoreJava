//Initialize object by method
public class InitObjByMet {
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
		InitObjByMet s1 = new InitObjByMet();
		InitObjByMet s2 = new InitObjByMet();
		s1.insertRecord(111, "vikas");
	    s2.insertRecord(222, "sanjay");
	    s1.displayInformation();
	    s2.displayInformation();

	}

}
/*Output:
111 vikas
222 sanjay
*/