import java.util.ArrayList;
import java.util.List;

class Data3{
	public <E>void printListData(List<E>obj){
		for(E elements:obj) {
			System.out.println(elements);
		}
	}
}
public class Generic9 {

	public static void main(String[] args) {
		List<Integer>obj1 = new ArrayList<>();
		obj1.add(1);
		obj1.add(2);
		
		List<String>obj2 = new ArrayList<>();
		obj2.add("Hi");
		obj2.add("Hello");
		
		Data3 data = new Data3();
		data.printListData(obj1);
		data.printListData(obj2);

	}

}
