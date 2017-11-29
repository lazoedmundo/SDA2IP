package model;

/**
 * 
 * Class User - This class has fields of the most relevant information of users
 * 
 * @author ELL
 *
 */
public class User {
	
	//FIELDS
	
	String userEmail;
	String userPassword;
	
	//CONSTRUCTOR
	
	/**
	 * This class does not require to initialize fields
	 */
	public User() {
		
	}
	
	//METHODS
	
	// USER EMAIL METHODS
	
	/**
	 * 
	 * Method that returns the user email
	 * 
	 * @return
	 */
	public String getUserEmail() {
		return userEmail;
	}
	
		
	/**
	 * 
	 * Method that sets the user email
	 * 
	 * @param userEmail - String parameter with the user email
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	/**
	 * Method that is used for the manual testing
	 */
	public void showUserEmail() {
		System.out.println("User e-mail = " + userEmail);
	}

	
	// USER PASSWORD METHODS
	
	/**
	 * 
	 * This method returns the user hashed password (hypothetically)
	 * @return userPassword - String value with the hashed password of the user
	 */
	public String getUserPassword() {
		return userPassword;
	}

	
	/**
	 * 
	 * This method sets the user password
	 * 
	 * @param userPassword - String parameter that represents the user password before encryption
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

	/**
	 * Method that is used for the manual testing
	 */
	public void showUserPassword() {
		System.out.println("User Password = " + userPassword);
	}

	
}
