package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class customer extends user{
	
	String address;
	ArrayList<order> order = new ArrayList<>();
	ArrayList<product> products = new ArrayList<>();
	
	
	public customer(String userID, String username, String email, String address) {
		super(userID, username, email);
		this.address = address;
		
	}
	public void displaycustomerinfo() {
		System.out.println("s");
		
	}
	public void addtocart(product product) {
		System.out.println("sa ");
	}
			
	public void viewcart() {
		System.out.println("sa");
	}
	
}
