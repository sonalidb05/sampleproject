package com.sample;

public class CustomerClass {

	private int customerId;
	private int age;
	private String customerName;
	private double balance;
	private BankType bankType;
	private Gender gender;
	private double interestOnBalance;

	enum BankType {
		SB, ICI, HD

	}

	enum Gender {
		MALE, FEMALE
	}

	public CustomerClass(int customerId, int age, String customerName, double balance, BankType bankType,
			Gender gender) {
		super();
		this.customerId = customerId;
		this.age = age;
		this.customerName = customerName;
		this.balance = balance;
		this.bankType = bankType;
		this.gender = gender;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankType getBankType() {
		return bankType;
	}

	public void setBankType(BankType bankType) {
		this.bankType = bankType;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getInterestOnBalance() {
		return interestOnBalance;
	}

	public void setInterestOnBalance(double interestOnBalance) {
		this.interestOnBalance = interestOnBalance;
	}

	@Override
	public String toString() {
		return "CustomerClass [customerId=" + customerId + ", age=" + age + ", customerName=" + customerName
				+ ", balance=" + balance + ", bankType=" + bankType + ", gender=" + gender + ", interestOnBalance="
				+ interestOnBalance + "]";
	}

}
