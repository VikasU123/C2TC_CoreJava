package com.acharya.inteface;
interface Bike4{
	void getMileage();
}
class R152 implements Bike4{
	public void getMileage() {
		System.out.println("Mileage is 40 Km/L");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		R152 bike = new R152();
		bike.getMileage();

	}

}
//Output: Mileage is 40 Km/L