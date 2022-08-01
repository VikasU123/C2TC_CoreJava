//By extending thread class
package com.acharya.Multithread;
class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse thread ID is"+ " "+Thread.currentThread().getId());
	}
}
class PPT extends Thread{
	public void run() {
		System.out.println("PPT thread ID is"+" "+Thread.currentThread().getId());
	}
}
public class Multithread1 {

	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		obj.start();
		PPT obj1 = new PPT();
		obj1.start();

	}

}
/*Output: Eclipse thread ID is 15
PPT thread ID is 16*/