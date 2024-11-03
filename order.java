package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class order {
	String orderid;
	String orderdate;
	ArrayList<product> orderitem = new ArrayList<product>();
	String status;
	
	public order(int orderid) {
		this.orderid = String.format("03d", orderid);
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	}
	
	public void displayorderinfo() {
		System.out.println("order id :" + orderid);
		System.out.println("order date : " + orderdate);
		System.out.println("total price : $" + calculatetotalprice());
	}
	
	public double calculatetotalprice() {
		double total = 0;
		for (product product : orderitem) {
			total += product.price;
		}
		return total;
	}
	
	public void processorder() {
		System.out.println("s");
	}
	
}
