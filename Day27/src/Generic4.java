import java.util.LinkedList;
import java.util.List;

class Data<T>{
	private T str;

	public T getStr() {
		return str;
	}

	public Data(T str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "Data [str=" + str + ", getStr()=" + getStr() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
public class Generic4 {

	public static void main(String[] args) {
		List<Data<Object>> obj = new LinkedList<>();
		obj.add(new Data <Object>("Hello"));
		obj.add(new Data<Object>("World"));
		obj.add(new Data<Object>(1));
		

	}

}
