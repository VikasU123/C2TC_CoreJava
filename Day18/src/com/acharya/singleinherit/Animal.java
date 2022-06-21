//Single inheritance
package com.acharya.singleinherit;

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
class Demo{

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();

	}

}
/*Output: 
barking
eating
*/