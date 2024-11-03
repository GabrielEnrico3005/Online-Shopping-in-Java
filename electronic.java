package main;

public class electronic extends product implements orderable{
	String brand;
	int warrantyperiod;
	public electronic(String productID, String productName, double price, String brand, int warrantyperiod) {
		super(productID, productName, price);
		this.brand = brand;
		this.warrantyperiod = warrantyperiod;
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
		if(warrantyperiod > 0) return true;
		return false;
	}
	
	
}
