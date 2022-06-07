//Knowledge check question
public class KnowChe1 {
	int weight;
}
class Weight{
	public static void main(String[] args) {
		KnowChe1 a1 = new KnowChe1();
		KnowChe1 a2 = new KnowChe1();
		a1.weight = 1;
		a1.weight = 2;
		a2 = a1;
		System.out.println(a2.weight);

	}

}
//Output: 2