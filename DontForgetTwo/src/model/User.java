package model;

public class User {
	
	//FIELDS
	
	String userEmail;
	String userPassword;
	
	//CONSTRUCTOR
	
	public User() {
		
	}
	
	//METHODS
	
	// USER EMAIL METHODS
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public void showUserEmail() {
		System.out.println("User e-mail = " + userEmail);
	}

	
	// USER PASSWORD METHODS
	
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

	public void showUserPassword() {
		System.out.println("User Password = " + userPassword);
	}

	
}
