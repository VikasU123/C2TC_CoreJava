
public class ClassInstantiation5 {
	int x;

	public static void main(String[] args) {
		ClassInstantiation5 myObj1 = new ClassInstantiation5();
		ClassInstantiation5 myObj2 = new ClassInstantiation5();
		ClassInstantiation5 myObj3 = new ClassInstantiation5();
		myObj1.x = 10;
		myObj2.x = 20;
		myObj3.x = 30;
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
		System.out.println(myObj3.x);

	}

}
