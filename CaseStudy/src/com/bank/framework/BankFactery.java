package com.bank.framework;

public abstract class BankFactery {
	public abstract SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(int Acc, String accNm, float accBal,float creditLimit);

}
