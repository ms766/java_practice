package com.example.oop;

public class ChallengeClassBankAccount {
	private int acountNumber;
	private int balance;
	private String custName;
	private String email;
	private int phoneNumber;

	public void setAcountNumber(anum){
		this.acountNumber = anum;
	}

	public void setBalance(bal){
		this.balance() = bal;
	}

	public int getAccountnumber(){
		return this.accoutNumber;
	}

	public int getBalance(){
		return this.balance;
	}
	
	public void deposit(double depositAmount){
		this.balance += depositAmount;
	}

	public void withdrawl(double withdrawlAmount){
		if(this.balance - withdrawlAmount < 0){
			System.out.println("funds lacking");
		}else{
			this.balance -= withdrawlAmount;
			System.out.println("withdrawl done");
			System.out.println("remaining balance"+ this.balance);
		}
	}


}
