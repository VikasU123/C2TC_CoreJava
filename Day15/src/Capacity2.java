//capacity()
public class Capacity2 {

	public static void main(String[] args) {
		StringBuffer w = new StringBuffer();
		StringBuffer w1 = new StringBuffer("flow ");
		w.append("danger ");
		w1.append("wolf ");
		System.out.println(w.capacity());
		System.out.println(w1);
		w.append("wolf is roming around");
		System.out.println(w);
		System.out.println(w.capacity());
		w.append("please beaware of it");
		System.out.println(w);
		System.out.println(w.capacity());

	}

}
/*Output:
16
flow wolf 
danger wolf is roming around
34
danger wolf is roming aroundplease beaware of it
70
*/