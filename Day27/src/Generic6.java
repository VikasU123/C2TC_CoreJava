class Dataaa<K,V>{
	private K key;
	private V Value;
	public K getKey() {
		return key;
	}
	public V getValue() {
		return Value;
	}
	public Dataaa(K key, V value) {
		super();
		this.key = key;
		Value = value;
	}
	@Override
	public String toString() {
		return "Dataaa [key=" + key + ", Value=" + Value + ", getKey()=" + getKey() + ", getValue()=" + getValue()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public <E,N> void display(E elements, N numbers) {
		System.out.println("Elements: "+elements+" Numbers: "+numbers);
	}
}
public class Generic6 {

	public static void main(String[] args) {
		Dataaa<Integer,String> obj = new Dataaa<>(1,"Vikas");
		System.out.println(obj.getKey());
		System.out.println(obj.getValue());
		obj.display("Hi", 3);

	}

}
