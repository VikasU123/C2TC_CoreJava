//Knowledge check question
public class KnowChe2 {
	String name;

	public static void main(String[] args) {
		KnowChe2 c = new KnowChe2();
		KnowChe2 c1 = c;
		c1.name ="C2TC";
		c = null;
		System.out.println(c.name);

	}

}
// Output:   java.lang.NullPointerException