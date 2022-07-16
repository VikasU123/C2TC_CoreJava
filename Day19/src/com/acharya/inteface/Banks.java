package com.acharya.inteface;
interface Bank2{
	float rateOfInterest();
}
class SBI implements Bank2{
	public float rateOfInterest(){
		return 9.15f;
	}
}
class HDFC implements Bank2{
	public float rateOfInterest(){
		return 9.7f;
	} 
}
public class Banks {

	public static void main(String[] args) {
		Bank2 b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());

	}

}
//Output: ROI: 9.15