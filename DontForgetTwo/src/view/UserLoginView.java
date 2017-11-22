package view;

import java.util.Scanner;

import controller.ManageUser;

public class UserLoginView {

	private Scanner scanner;
	private ManageUser newManageUser;
	private String keyboardEmailInput;

	public UserLoginView() {

		scanner = new Scanner(System.in);
		newManageUser = new ManageUser();

	}

	public String getinputUser() {

		return keyboardEmailInput;

	}

	public boolean createNewUser() {

		System.out.println("Please Enter User Email:");
		keyboardEmailInput = scanner.nextLine().trim();

		System.out.println("Please Enter Password:");
		String keyboardPasswordInput = scanner.nextLine().trim();

		boolean validUser = false;

		if (keyboardEmailInput.equals("")) {
			System.out.println("Please Type again the User Email !!!");
			System.out.println("");
		}
		if (keyboardPasswordInput.equals("")) {
			System.out.println("Please Type again the User Password !!!");
			System.out.println("");
		}

		if (!keyboardEmailInput.equals("") && !keyboardPasswordInput.equals("")) {
			// for new users

			if (newManageUser.createUser(keyboardEmailInput, keyboardPasswordInput)) {
				System.out.println("User account created successfully!!");
				System.out.println("");
				validUser = true;
			}

			else {
				System.out.println("Error while creating User account!!");
				System.out.println("");
			}

		}

		return validUser;

	}

	public boolean loginUser() {

		boolean validUserEmail = false;
		System.out.println("Please Enter User Email:");
		keyboardEmailInput = scanner.nextLine().trim();
		System.out.println("Please Enter User Password:");
		String inputPass = scanner.nextLine().trim();

		if (keyboardEmailInput.equals("")) {
			System.out.println("Please Type again the User Email !!!");
			System.out.println("");
		}
		if (inputPass.equals("")) {
			System.out.println("Please Type again the User Password !!!");
			System.out.println("");
		}

		if (!keyboardEmailInput.equals("") && !inputPass.equals("")) {
			// for existing user

			if (newManageUser.validateUser(keyboardEmailInput, inputPass))

			{
				System.out.println("You have succesfully Logged in!");
				System.out.println("");
				validUserEmail = true;

			} else {
				System.out.println("Please check your User Email and/or Password !!");
				System.out.println("");

			}

		}

		return validUserEmail;

	}

}
