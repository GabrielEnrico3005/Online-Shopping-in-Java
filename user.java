package main;

public class user {
	String UserID;
	String Username;
	String Email;
	public user(){
		
	}
	public void displayuserinfo() {
		System.out.println("test");
		
	}
	public user(String userID, String username, String email) {
		super();
		UserID = userID;
		Username = username;
		Email = email;
	}
	
	public void placeorder(order order) {
		System.out.println("test");
	}
	
}
