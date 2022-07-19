package com.acharya.generic;
class Dataa{
	private Object str;

	public Object getStr() {
		return str;
	}

	public Dataa(Object str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "Dataa [str=" + str + ", getStr()=" + getStr() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}

public class Generic2 {

	public static void main(String[] args) {
		Dataa obj = new Dataa(3.876666);
		String output = (String)obj.getStr();
		System.out.println(output);

	}

}
/*Output: Exception in thread "main" java.lang.ClassCastException: class java.lang.Double cannot be cast to class java.lang.String (java.lang.Double and java.lang.String are in module java.base of loader 'bootstrap')
at com.acharya.generic.Generic2.main(Generic2.java:26)
*/