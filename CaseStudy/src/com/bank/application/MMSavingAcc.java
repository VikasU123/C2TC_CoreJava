package com.bank.application;

import com.bank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL=200.0f;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	public void withdraw(float MINBAL) {
		System.out.println("Dear Custemer, Your saving account minimum balance is: "+MINBAL);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
