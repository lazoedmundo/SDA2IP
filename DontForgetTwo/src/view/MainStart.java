package view;

import java.util.Scanner;

public class MainStart {

	private Scanner scanner;
	private UserLoginView userLoginView;
	private ManageToDoListView manageToDoListView;
	// private String inputUser;

	public MainStart() {

		scanner = new Scanner(System.in);
		userLoginView = new UserLoginView();
		manageToDoListView = new ManageToDoListView();
		// We can add more fields if we create more classes at the view

	}

	public static void main(String[] args) {

		MainStart main = new MainStart();
		main.mainMenu();

	}

	private void mainMenu() {

		System.out.println("");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("| ******************  SDA2 INDIVIDUAL PROJECT  *********************|");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|                                                                   |");
		System.out.println("| Application Name: DONTFORGET2                                     |");
		System.out.println("|                                                                   |");
		System.out.println("| Version: 1.0                                                      |");
		System.out.println("|                                                                   |");
		System.out.println("| Realease Date: 21.11.21                                           |");
		System.out.println("|                                                                   |");
		System.out.println("| Author: Edmundo Lazo                                              |");
		System.out.println("|                                                                   |");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("");

		boolean logingOption = true;

		while (logingOption) {

			boolean validUser = false;
			int exitOption = 1;

			while (!validUser) {

				System.out.println("|-------------------------------------------------------------------|");
				System.out.println("|                                                                   |");
				System.out.println("| ***********************   LOGIN MENU   ***************************|");
				System.out.println("|                                                                   |");
				System.out.println("|-------------------------------------------------------------------|");
				;
				System.out.println("");
				System.out.println("Please Select One Option to Start DONTFORGET2 : ");
				System.out.println("Type <C> to Create a New User");
				System.out.println("Type <L> to Login with as an Existing User");
				System.out.println("Type <X> to Exit DONTFORGET2 To Do List");

				System.out.println("");

				String keyboardInputOption = scanner.nextLine();

				if (keyboardInputOption.toUpperCase().trim().equals("C")) {

					validUser = userLoginView.createNewUser();
					exitOption = 1;

				} else if (keyboardInputOption.toUpperCase().trim().equals("L")) {

					validUser = userLoginView.loginUser();
					exitOption = 1;

				} else if (keyboardInputOption.toUpperCase().trim().equals("X")) {

					validUser = true;
					exitOption = 2;

				} else {
					System.out.println("Invalid Option Entered!!");
				}
			}

			if (exitOption == 1) {

				System.out.println("");
				System.out.println("Please Select One Option to Continue: ");
				System.out.println("Type <G> to Go to To Do List Main Menu");
				System.out.println("Type <X> to Exit DONTFORGET2 To Do List");
				System.out.println("");

				String keyboardInputOption = scanner.nextLine();

				if (keyboardInputOption.toUpperCase().trim().equals("G")) {

					toDoListMainMenu();

				} else if (keyboardInputOption.toUpperCase().trim().equals("X")) {

					logOutMessage();

					logingOption = false;

				}
			}
		
			else {
				
				logOutMessage();
				logingOption = false;
				
			}
		
		}
	}

	private void toDoListMainMenu() {

		String loop = "GO";

		while (!loop.equals("EXIT")) {

			System.out.println("|-------------------------------------------------------------------|");
			System.out.println("|                                                                   |");
			System.out.println("| *****************   TO DO LIST MAIN MENU   ***********************|");
			System.out.println("|                                                                   |");
			System.out.println("|-------------------------------------------------------------------|");

			System.out.println("");

			System.out.println("Please Enter An Option: ");
			System.out.println("Type <C> to Create a To Do List");
			//System.out.println("Type <N> to Change Name of To Do List");
			System.out.println("Type <E> Edit existing To Do List");
			System.out.println("Type <G> to Go to Login Menu");
			System.out.println("");
			String keyboardInput = scanner.nextLine();

			if (keyboardInput.toUpperCase().trim().equals("C")) {

				manageToDoListView.createToDoListView();

			//The value was "N"
			} else if (keyboardInput.toUpperCase().trim().equals("E")) {

				manageToDoListView.changeToDoListNameView();

			} else if (keyboardInput.toUpperCase().trim().equals("G")) {

				loop = "EXIT";

			} else {
				System.out.println("Please Enter a Valid Option !!!");
			}

		}

	}

	private void logOutMessage() {

		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("|                                                                   |");
		System.out.println("|       Thanks for using DONTFORGET2 To Do List!!!                  |");
		System.out.println("|                                                                   |");
		System.out.println("|                  See you soon !!! :-)                             |");
		System.out.println("|                                                                   |");
		System.out.println("|-------------------------------------------------------------------|");

	}

}
