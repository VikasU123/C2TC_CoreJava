//Passed as argument in constructor call
package com.acharya.constructor;

public class S2 {
	A4 obj;
	S2(A4 obj){
		this.obj=obj;
	}
	void display() {
		System.out.println(obj.data);
	}
}
class A4{
	int data=10;
	A4(){
		S2 b = new S2(this);
		b.display();
	}
}	
class Main1{
	public static void main(String[] args) {
		A4 a = new A4();

	}

}
