package main;

public abstract class product {
	String productID;
	String productName;
	double price;
	public product(String productID, String productName, double price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	public abstract void displayproductinfo();
	public abstract double getprice();
	public abstract boolean isavailable();
	
	
	
	
}
