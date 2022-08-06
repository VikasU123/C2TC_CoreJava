package com.bank.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public void withdraw(float creditLimit) {
		System.out.println("Your credit limit is : "+creditLimit);
	}
	public float getcreditLimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getcreditLimit()=" + getcreditLimit() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
