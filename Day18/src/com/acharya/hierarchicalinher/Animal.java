//Hierarchical inheritance
package com.acharya.hierarchicalinher;

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
class Cat extends Animal{
	void meow() {
		System.out.println("meowing");
	}
}
class Demo{
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.meow();
		d.bark();
		c.eat();

	}

}
/*Output:
meowing
barking
eating
*/