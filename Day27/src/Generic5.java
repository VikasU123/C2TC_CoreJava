class Dataa<K,V>{
	private K Key;
	private V Value;
	public K getKey() {
		return Key;
	}
	public V getValue() {
		return Value;
	}
	public Dataa(K key, V value) {
		super();
		Key = key;
		Value = value;
	}
	@Override
	public String toString() {
		return "Dataa [Key=" + Key + ", Value=" + Value + ", getKey()=" + getKey() + ", getValue()=" + getValue()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
public class Generic5 {

	public static void main(String[] args) {
		Dataa<Integer,String> obj = new Dataa<Integer,String>(1,"Vikas");
		System.out.println(obj.getKey());
		System.out.println(obj.getValue());

	}

}
