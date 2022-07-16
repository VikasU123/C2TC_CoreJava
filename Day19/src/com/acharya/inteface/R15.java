package com.acharya.inteface;
interface Bike2{
	void getMileage();
}
class R15 implements Bike2 {
	public void getMileage() {
		System.out.println("Mileage is 40 Km/L");

	}

}