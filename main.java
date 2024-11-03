package main;

import java.util.ArrayList;
import java.util.Scanner;


public class main {
	Scanner scan = new Scanner(System.in);
	int orderid = 0;
	ArrayList<product> products = new ArrayList<product>();
	ArrayList<user> users = new ArrayList<user>();
	ArrayList<order> order = new ArrayList<order>();
	ArrayList<product> myproduct = new ArrayList<product>();
	ArrayList<customer> customers = new ArrayList<customer>();
	
	int flag = 0;
	
	public void shopforproduct() {
		int inp = -1;
		do {
			System.out.println("shop for product");
			System.out.println("1. view all product");
			System.out.println("2. add clothing to cart");
			System.out.println("3. add electronic to cart");
			System.out.println("4. back to main menu");
			System.out.println(">>");
			inp = scan.nextInt();
			scan.nextLine();
		} while (inp != 4);
		
		switch (inp) {
		case 1:
			System.out.println("view all products");
			System.out.printf("%-5s | %-20s | %-10s | %-15s |\n", "ID", "product name", "price", "availbility");
			for (product p : products) {
				System.out.printf("%-5s | %-20s | %-10s | %-15s |\n", p.productID, p.productName, p.price, p.isavailable() ? "in stock" : "out stock");
			}
			break;
		case 2:
			String inp1;
			System.out.println("add clothing");
			System.out.printf("%-5s | %-20s | %-10s | %-15s |\n", "ID", "product name", "price", "size", "availbility");
			System.out.println("");
			for (product p : products) {
				if (p instanceof clothing) {
					clothing c = (clothing) p;
					System.out.printf("%-5s | %-20s | %-10s | %-15s |\n", c.productID, c.productName, c.price, c.size, c.isavailable() ? "in stock" : "out stock");
					System.out.println("enter id or type back");
					inp1 = scan.nextLine();
					if (inp1.equals("back")) {
						break;
					}else {
					for (product P : products) {
						if(P.productID.equals(inp1)) {
							clothing C = (clothing) P;
							if(C.quantityinstock == 0) {
								System.out.println("habis");
								return;
								}
							myproduct.add(P);
							flag = 1;
							break;
							}
						}
					}
					if (flag == 0) {
						System.out.println("gk ada product");
					}
				}
			}
			break;
			
		case 3:
			String inp2;
			System.out.println("add clothing");
			System.out.printf("%-5s | %-20s | %-10s | %-15s |\n", "ID", "product name", "price", "brand", "availbility");
			System.out.println("");
			for (product p : products) {
				if (p instanceof electronic) {
					electronic e = (electronic) p;
					System.out.printf("%-5s | %-20s | %-10s | %-15s |\n", e.productID, e.productName, e.price, e.brand, e.isavailable() ? "in stock" : "out stock");
					System.out.println("enter id or type back");
					inp2 = scan.nextLine();
					if (inp2.equals("back")) {
						break;
					}else {
					for (product P : products) {
						if(P.productID.equals(inp2)) {
							electronic E = (electronic) P;
							if(E.warrantyperiod == 0) {
								System.out.println("habis");
								return;
								}
							myproduct.add(P);
							flag = 1;
							break;
							}
						}
					}
					if (flag == 0) {
						System.out.println("gk ada product");
					}
				}
			}
			break;
		case 4:
			System.out.println("bye");
			scan.nextLine();
			break;
		}
	}
	
	public void viewshopping() {
		Scanner scan = new Scanner(System.in);
		int inp = -1;
		String inp1;
		double total = 0;
		do {
			System.out.println("view cart");
			System.out.println("1. View cart contents");
			System.out.println("2. Checkout");
			System.out.println("3. Back to Main Menu");
			System.out.println(">>");
			inp = scan.nextInt();
			
			switch (inp) {
			case 1:
				System.out.println("view cart");
				System.out.printf("ID", "Productname", "price\n");
				System.out.println("");
				for (product np : products) {
					System.out.printf("%-s5 | %-20s | %-10s |\n", np.productID, np.productName, np.price);
					total += np.price;
				}
				System.out.println("total : " + total);
				System.out.println("press enter");
				scan.nextLine();
				break;
				
			case 2:
				System.out.println("check out");
				System.out.printf("ID", "Productname", "price\n");
				System.out.println("");
				for (product np : products) {
					System.out.printf(np.productID, np.productName, np.price);
					total += np.price;
				}
				System.out.println("total : " + total);
				System.out.println("continue?(Y/N) :");
				inp1 = scan.nextLine();
				if (inp1.equals("Y")) {
					order neworder = new order(orderid);
					for (product p : products) {
						neworder.orderitem.add(p);
					
					}
					for (product pr : products) {
						if(pr instanceof clothing) {
							((clothing) pr).quantityinstock--;
						}
					}
					order.add(neworder);
					orderid++;
					System.out.println("success");
				}
				
				break;
			
			case 3:
				
				break;
			}
		} while (inp != 3);
	}
	
	public main() {
		String inp;
		int choice = 0;
		
		Scanner scan = new Scanner(System.in);
		products.add(new clothing("P001", "Tshirt", 19.99, "H\n", 0));
		products.add(new clothing("P002", "Jeans", 39.99, "32/34\n", 9));
		products.add(new clothing("P005", "Sneakers", 59.99, "9\n", 9));
		
		products.add(new electronic("P003", "Smartphone", 499.99, "techno\n", 9));
		products.add(new electronic("P004", "Laptop", 899.99, "MegaElect\n", 9));
		products.add(new electronic("P007", "Smartwatch", 129.99, "Fittech\n", 9));
		
		customers.add(new customer("0003", "gabriel", "a@gmail", "barat\n"));
		customers.add(new customer("P004", "enrico", "b@gmail", "timur\n"));
		customers.add(new customer("P007", "imanuel","c@gmail", "Tenggara\n"));
		
		
		do {
			System.out.println("Online Shopping");
			System.out.println("Input Customer ID :");
			
			inp = scan.nextLine();
			for (customer c : customers) {
				if(inp.equals(c.UserID)) {
				
					flag = 1;
				}
			}
			if(flag == 0) {
				System.out.println("customer id tidak ada");
				System.out.println("press enter");
				scan.nextLine();
			}
		} while (flag == 0);
		
		do {
			if(flag == 1) {
				System.out.println("online shopping");
				System.out.println("1. shop for product");
				System.out.println("2. view shopping");
				System.out.println("3. view order");
				System.out.println("4. customer info");
				System.out.println("5. exit");
				System.out.println(">>");
				choice = scan.nextInt();
				scan.nextLine();
				
				switch (choice) {
				case 1:
					shopforproduct();
					break;
				
				case 2:
					viewshopping();
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					System.out.println("bye");
					break;
				}
				
			}
		} while (choice != 5);
	}

	public static void main(String[] args) {
		new main();

	}

}
