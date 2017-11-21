package model;

import java.util.HashMap;
import java.util.Map;

public class UserDataBase {

	// FILEDS

	private Map<String, User> userDataBase = new HashMap<String, User>();

	// CONSTRUCTOR

	public UserDataBase() {

	}

	// METHODS

	// METHOD TO CREATE NEW USER

	public void addUserToDataBase(String userEmail, String password) {

		User user = new User();
		user.setUserEmail(userEmail);
		user.setUserPassword(password);
		userDataBase.put(user.getUserEmail(), user);

	}

	public Map<String, User> getUserDataBase() {

		return userDataBase;

	}

	public boolean authenticateUser(String userEmailToCheck, String userPasswordTocheck) {

		boolean returnValue = false;

		if (userDataBase.get(userEmailToCheck).userPassword.equals(userPasswordTocheck)) {

			returnValue = true;

		}

		return returnValue;

	}

	public void showUserInfo(User user) {
		System.out.println("User email = " + userDataBase.get(user.getUserEmail()).userEmail);
		System.out.println("User Password = " + userDataBase.get(user.getUserEmail()).userPassword);
	}
}
