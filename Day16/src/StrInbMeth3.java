
public class StrInbMeth3 {

	public static void main(String[] args) {
		String s="Apple";
		int a = 10;
		System.out.println(s+a);
		System.out.println(s.concat(a));

	}

}
/*Output:
Error
prog.java:6: error: incompatible types: int cannot be converted
to String
System.out.println(s.concat(a));
*/