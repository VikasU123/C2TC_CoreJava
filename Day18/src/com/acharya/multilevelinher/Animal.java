//Multilevel inheritance
package com.acharya.multilevelinher;

class Animal {
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping");
	}
}
class Demo{
	public static void main(String[] args) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();


	}

}
/*Output: 
weeping
barking
eating
*/