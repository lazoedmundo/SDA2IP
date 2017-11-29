package controller;

import model.UserDataBase;

/**
 *
 * ManageUser - This class is responsible of the following functions:
 * checks if the user email exists in the database, creates and validates users.
 * 
 * @author ELL
 *
 */
public class ManageUser {

	// FIELDS

	private UserDataBase userDataBase;

	// CONSTRUCTOR

	/**
	 * Constructor method that initializes the UserDataBase Object
	 */
	public ManageUser() {

		userDataBase = new UserDataBase();

	}

	// METHODS

	/**
	 * 
	 * Method that validates if the user email and hashed password exist in the database
	 * 
	 * @param userEmailToValidate - String parameter with the value of the user email to validate
	 * @param userPasswordToValidate - String parameter with the value of the user hashed password to validate
	 * @return validUser - Boolean value of valid user
	 */
	public boolean validateUser(String userEmailToValidate, String userPasswordToValidate) {

		boolean validUser = false;

		boolean userExists = checkUserEmail(userEmailToValidate);

		if (userExists) {
			validUser = userDataBase.authenticateUser(userEmailToValidate, userPasswordToValidate);
		}

		return validUser;

	}

	/**
	 * 
	 * Method that creates a user
	 * 
	 * @param newUserEmail - String parameter with the value of the user email
	 * @param newUserPassword - String parameter with the value of the user password
	 * @return - Boolean value true if the user has been created and false if the user has not been created
	 */
	public boolean createUser(String newUserEmail, String newUserPassword) {

		boolean retVal = true;

		boolean userExists = checkUserEmail(newUserEmail);

		if (userExists == false) {

			userDataBase.addUserToDataBase(newUserEmail, newUserPassword);
			System.out.println("User Email accepted");

		} else {

			System.out.println("User Email Already Exists. Please create user with a different Email.");

			retVal = false;

		}

		return retVal;

	}

	/**
	 * 
	 * Method that checks if the entered user email exists in the database
	 * 
	 * @param userEmailToCheck - String parameter with the value of the user email to check
	 * @return userExists - Boolean value true if the user email exists in the database
	 */
	private boolean checkUserEmail(String userEmailToCheck) {

		boolean userExists = false;

		if (userDataBase.getUserDataBase().containsKey(userEmailToCheck) == true) {
			
			userExists = true;
			System.out.println("user email exists");
		}

		else {

			System.out.println("User email does not exist");
		}

		return userExists;

	}

}
