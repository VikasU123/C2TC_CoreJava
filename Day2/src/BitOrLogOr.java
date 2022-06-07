//Comparison of || and | operator
public class BitOrLogOr {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a>b||a<c);
		System.out.println(a>b||a<c);
		System.out.println(a>b||a++<c);
		System.out.println(a);
		System.out.println(a>b|a++<c);
		System.out.println(a);

	}

}
/*Output:
true
true
10
true
11
*/