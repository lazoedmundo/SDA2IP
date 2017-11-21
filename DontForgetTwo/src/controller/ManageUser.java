package controller;

import model.UserDataBase;

public class ManageUser {

	// FIELDS

	private UserDataBase userDataBase;

	// CONSTRUCTOR

	public ManageUser() {

		userDataBase = new UserDataBase();

	}

	// METHODS

	public boolean validateUser(String userEmailToValidate, String userPasswordToValidate) {

		boolean validUser = false;

		boolean userExists = checkUserEmail(userEmailToValidate);

		if (userExists) {
			validUser = userDataBase.authenticateUser(userEmailToValidate, userPasswordToValidate);
		}

		return validUser;

	}

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
