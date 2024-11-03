package main;

public class clothing extends product implements orderable{
	String size;
	int quantityinstock;
	public clothing(String productID, String productName, double price, String size, int quantityinstock) {
		super(productID, productName, price);
		this.size = size;
		this.quantityinstock = quantityinstock;
	}
	@Override
	public void addtoorder(order order) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void diplayorderdetails() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displayproductinfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isavailable() {
		if (quantityinstock > 0) {
			return true;
		}
		return false;
	}
	
	
	
}
