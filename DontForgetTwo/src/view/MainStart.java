package view;

import java.util.Scanner;

 
public class MainStart {

	private Scanner scanner;
	private UserLoginView userLoginView;
	private String inputUser;

	public MainStart() {

		scanner = new Scanner(System.in);
		userLoginView = new UserLoginView();
		// We can add more fields if we create more classes at the view

	}

	public static void main(String[] args) {

		MainStart main = new MainStart();
		main.mainMenu();

	}

	private void mainMenu() {

		System.out.println("");
		System.out.println("  |-------------------------------------------------------------------|");
		System.out.println("  | ********************SDA2 INDIVIDUAL PROJECT***********************|");
		System.out.println("  |-------------------------------------------------------------------|");
		System.out.println("  |                                                                   |");
		System.out.println("  | Application Name: DONTFORGET2                                     |");
		System.out.println("  |                                                                   |");
		System.out.println("  | Version: 1.0                                                      |");
		System.out.println("  |                                                                   |");
		System.out.println("  | Realease Date: 21.11.21                                           |");
		System.out.println("  |                                                                   |");
		System.out.println("  | Author: Edmundo Lazo                                              |");
		System.out.println("  |                                                                   |");
		System.out.println("  |-------------------------------------------------------------------|");
		System.out.println("");

		while (true) {

			boolean validUser = false;

			while (!validUser) {
				
				System.out.println("  |-------------------------------------------------------------------|");
				System.out.println("Please Select One Option to Start DONTFORGET2 : ");
				System.out.println("Type <C> to Create a New User");
				System.out.println("Type <L> to Login with as an Existing User");

				String keyboardInputOption = scanner.nextLine();

				if (keyboardInputOption.toUpperCase().trim().equals("C")) {

					validUser = userLoginView.createNewUser();

				} else if (keyboardInputOption.toUpperCase().trim().equals("L")) {

					validUser = userLoginView.loginUser();

				} else {
					System.out.println("Invalid Option Entered!!");
				}

			}

		
			if (validUser) {
				inputUser = userLoginView.getinputUser();
				toDoListMainMenu();
			}
		}
	}
		
	private void toDoListMainMenu() {

		String loop = "GO";

		while (!loop.equals("LOGOUT")) {


			System.out.println("  |-------------------------------------------------------------------|");
			System.out.println("  | ********************SDA2 INDIVIDUAL PROJECT***********************|");
			System.out.println("  |-------------------------------------------------------------------|");

			System.out.println("Please Enter An Option: ");
			System.out.println("C -> Create a list");
			System.out.println(" -> ");
			System.out.println("V -> View Favourite Articles");
			System.out.println("U -> UnSubscribe a feed");
			System.out.println("X -> Exit the application");

			String inputVal = scanner.nextLine();

			if (inputVal.toUpperCase().trim().equals("S")) {

				feedView.subscribeFeed(inputUser);

			} else if (inputVal.toUpperCase().trim().equals("R")) {

				feedView.readFeed(inputUser);

			} else if (inputVal.toUpperCase().trim().equals("U")) {

				feedView.unsubscribeFeed(inputUser);
			} else if (inputVal.toUpperCase().trim().equals("V")) {

				articleView.viewFavourites(inputUser);

			} else if (inputVal.toUpperCase().trim().equals("X")) {

				loop = "LOGOUT";

			} else {
				System.out.println("Invalid Option Entered!!");
			}

		}
		System.out.println("**************************************");
		System.out.println("*Logged Out Of FeedBook Application!!*");
		System.out.println("**************************************");
		System.out.println("");

	}

	
	
	
		
	}


