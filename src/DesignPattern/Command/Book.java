package DesignPattern.Command;

public class Book {
	// 値段
	private double amount;
	
	public Book(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
