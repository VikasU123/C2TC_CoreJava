//Program on class instantiation using two objects
public class ClassInstantiation2 {
	int x;

	public static void main(String[] args) {
		ClassInstantiation2 myObj1 = new ClassInstantiation2();
		ClassInstantiation2 myObj2 = new ClassInstantiation2();
		myObj1.x = 24;
		myObj2.x = 55;
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);

	}

}
/* Output:
24
55
*/