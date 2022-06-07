//Initialize object by reference variable
public class InitObjByRefVar {
	int id;
	String name;
}

class Main{
	public static void main(String[] args) {
		InitObjByRefVar s1 = new InitObjByRefVar();
		s1.id = 72;
		s1.name = "Vikas";
		System.out.println(s1.id+" "+s1.name);

	}

}
//Output: 72 Vikas