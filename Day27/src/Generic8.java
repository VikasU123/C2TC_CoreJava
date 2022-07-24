class Data2<K extends Integer,V extends String>{
	private K Key;
	private V Value;
	public K getKey() {
		return Key;
	}
	public V getValue() {
		return Value;
	}
	public Data2(K key, V value) {
		super();
		Key = key;
		Value = value;
	}
	@Override
	public String toString() {
		return "Data2 [Key=" + Key + ", Value=" + Value + ", getKey()=" + getKey() + ", getValue()=" + getValue()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
public class Generic8 {

	public static void main(String[] args) {
		Data2<Integer,String> obj = new Data2<Integer,String>(1,"Vikas");
		System.out.println(obj.getKey());
		System.out.println(obj.getValue());
	}

}
