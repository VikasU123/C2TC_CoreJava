package com.acharya.Multithread;
class Eclipse4 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse thread ID is"+" "+Thread.currentThread().getId());
		}
	}
}
class PPT4 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("PPT thread ID is"+" "+Thread.currentThread().getId());
		}
	}
}

public class Multithreading4 {

	public static void main(String[] args) {
		Eclipse4 obj=new Eclipse4();
		Thread t = new Thread(obj);
		t.start();
		PPT4 obj1 = new PPT4();
		Thread t1 = new Thread(obj1);
		t1.start();

	}

}
/*Output:Eclipse thread ID is 15
Eclipse thread ID is 15
Eclipse thread ID is 15
Eclipse thread ID is 15
Eclipse thread ID is 15
PPT thread ID is 16
PPT thread ID is 16
PPT thread ID is 16
PPT thread ID is 16
PPT thread ID is 16*/