package com.acharya.Multithread;
class Eclipse3 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse thread ID is"+" "+Thread.currentThread().getId());
		}
	}
}
class PPT3 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("PPT thread ID is"+" "+Thread.currentThread().getId());
		}
	}
}

public class Multithreading3 {

	public static void main(String[] args) {
		Eclipse3 obj = new Eclipse3();
		Thread t = new Thread(obj);
		t.start();
		PPT3 obj1 = new PPT3();
		Thread t1=new Thread(obj1);
		t1.start();

	}

}
