package com.bank.framework;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL=200.0f; 
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	public void withdraw(float MINBAL) {
		System.out.println("Your minimum balance is : "+MINBAL);
		
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried=isSalaried;
	}
	public static float getMINBAL() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
