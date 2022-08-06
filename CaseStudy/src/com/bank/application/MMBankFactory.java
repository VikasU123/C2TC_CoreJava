package com.bank.application;

import com.bank.framework.BankFactery;
import com.bank.framework.CurrentAcc;
import com.bank.framework.SavingAcc;

public class MMBankFactory extends BankFactery{
	
	public SavingAcc getNewSavingAccount(int AccNO, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsaving = new MMSavingAcc(AccNO, accNm, accBal, isSalaried);
		return mmsaving;
	}
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}

}
