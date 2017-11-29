package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * UserDataBase - This class adds user to the data base, gets a user object and verifies if the user exists in the data base
 * 
 * @author ELL
 *
 */
public class UserDataBase {

	// FIELDS

	private Map<String, User> userDataBase = new HashMap<String, User>();

	// CONSTRUCTOR

	/**
	 * This class does not require to initialize fields
	 */
	public UserDataBase() {

	}

	// METHODS

	// METHOD TO CREATE NEW USER

	/**
	 *
	 *Method that adds a user to the database
	 * 
	 * @param userEmail - String value with the user email
	 * @param password - String value with the hashed password
	 */
	public void addUserToDataBase(String userEmail, String password) {

		User user = new User();
		user.setUserEmail(userEmail);
		user.setUserPassword(password);
		userDataBase.put(user.getUserEmail(), user);

	}

	/**
	 * 
	 * Method the returns the users database
	 * 
	 * @return Map<String, User> - Hash map object that contains a String with the user email and an object of the user class. 
	 */
	public Map<String, User> getUserDataBase() {

		return userDataBase;

	}

	/**
	 * 
	 *Method that verifies if a user exists in the data base
	 * 
	 * @param userEmailToCheck - Sting parameter with the user email that will be verified
	 * @param userPasswordTocheck - String parameter with the user hashes password that will be verified
	 * @return - Boolean value that verifies if the user email and hashed password exist in the data base
	 */
	public boolean authenticateUser(String userEmailToCheck, String userPasswordTocheck) {

		boolean returnValue = false;

		if (userDataBase.get(userEmailToCheck).userPassword.equals(userPasswordTocheck)) {
			
				returnValue = true;

		}

		return returnValue;

	}

	/**
	 * Method that is used for the manual testing
	 * @param user - User class object
	 */
	public void showUserInfo(User user) {
		System.out.println("User email = " + userDataBase.get(user.getUserEmail()).userEmail);
		System.out.println("User Password = " + userDataBase.get(user.getUserEmail()).userPassword);
	
	
		
	}
}
