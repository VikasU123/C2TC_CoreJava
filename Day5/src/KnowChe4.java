
public class KnowChe4 {
	String name;

	public static void main(String[] args) {
		KnowChe4 c1 = new KnowChe4();
		c1.name = "C2TC";
		KnowChe4 c2 = c1;
		c1=null;
		System.out.println(c2.name);
		new KnowChe4();
		KnowChe4 c3;
		c3.name = "C2TC";
				System.out.println(c3.name);

	}

}
