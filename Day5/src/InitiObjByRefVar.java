public class InitiObjByRefVar {
	int id;
	String name;
}

class Main{
	public static void main(String[] args) {
		InitiObjByRefVar s1 = new InitiObjByRefVar();
		s1.id = 72;
		s1.name = "Vikas";
		System.out.println(s1.id+" "+s1.name);

	}

}
