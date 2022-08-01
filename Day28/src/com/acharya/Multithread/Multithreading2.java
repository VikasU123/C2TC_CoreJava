//By implementing runnable interface
package com.acharya.Multithread;
class Eclipse2 implements Runnable{
	public void run() {
		System.out.println("Eclipse thread ID is"+" "+Thread.currentThread().getId());
	}
}
class PPT2 implements Runnable{
	public void run() {
		System.out.println("PPT thread ID is"+" "+Thread.currentThread().getId());
	}
}

public class Multithreading2 {

	public static void main(String[] args) {
		Eclipse2 obj = new Eclipse2();
		Thread t = new Thread(obj);
		t.start();
		PPT2 obj1 = new PPT2();
		Thread t1 = new Thread(obj1);
		t1.start();

	}

}
/*Output: Eclipse thread ID is 16
PPT thread ID is 18*/