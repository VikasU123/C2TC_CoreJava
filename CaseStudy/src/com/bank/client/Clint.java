package com.bank.client;

import com.bank.application.MMBankFactory;
import com.bank.application.MMCurrentAcc;
import com.bank.application.MMSavingAcc;
import com.bank.framework.BankFactery;
import com.bank.framework.CurrentAcc;
import com.bank.framework.SavingAcc;

public class Clint {

	public static void main(String[] args) {
		BankFactery bf = new MMBankFactory();
		
		SavingAcc sa = new MMSavingAcc(12345,"Vikas", 50000, true);
		CurrentAcc ac = new MMCurrentAcc(67890, "Sanjay", 30000, 90000);
		sa.withdraw(sa.getMINBAL());
		sa.toString();
		ac.withdraw(ac.getcreditLimit());
		ac.toString();

	}

}
