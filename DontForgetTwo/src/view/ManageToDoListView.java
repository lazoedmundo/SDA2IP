package view;

import java.util.Scanner;

import controller.ManageToDoList;
import controller.PrintToDoList;
import controller.StatusOfTask;

public class ManageToDoListView {

	private Scanner scanner;
	private ManageToDoList manageToDoList;

	// CONSTRUCTOR
	public ManageToDoListView() {

		scanner = new Scanner(System.in);
		manageToDoList = new ManageToDoList();

	}

	// METHODS

	public void createToDoListView() {

		System.out.println("Please enter the Name of the new To Do List:");
		String toDoListName = scanner.nextLine().trim();

		manageToDoList.createToDoList(toDoListName);
		manageToDoListMenu();

	}

	public void changeToDoListNameView() {

		System.out.println("Please enter the Name of the To Do List:");
		String toDoListName = scanner.nextLine().trim();

		manageToDoList.changeNewToDoListName(toDoListName);
		manageToDoListMenu();

	}

	public void manageToDoListMenu() {

		boolean status = false;

		while (!status) {

			System.out.println("");
			System.out.println("|-------------------------------------------------------------------|");
			System.out.println("|                                                                   |");
			System.out.println("| *****************    TO DO LIST SUB MENU   ***********************|");
			System.out.println("|                                                                   |");
			System.out.println("|-------------------------------------------------------------------|");
			System.out.println("");

			System.out.println("");
			System.out.println("Please Enter An Option: ");
			System.out.println("Type <1> to Add a Task to the To Do List");
			System.out.println("Type <2> to Remove a Task of To Do List");
			System.out.println("Type <3> to Change the Task Status");
			System.out.println("Type <4> to Print Menu");
			System.out.println("Type <5> to Show the To DO List complete Percentage [%]");
			System.out.println("Type <6> to Exit DONTFORGET2");
			System.out.println("");

			int keyboardInput = scanner.nextInt();

			switch (keyboardInput) {

			// Add a Task to the To Do List
			case 1:

				System.out.println("");
				System.out.println("Please enter the Task Name:");
				String taskName = scanner.next().trim();
				System.out.println("Please Provide the Task Due Date in the following lines:");
				System.out.println("");
				System.out.println("Year (e.g. 2017):");
				int year = scanner.nextInt();
				System.out.println("Month (e.g. 12):");
				int month = scanner.nextInt();
				System.out.println("Day (e.g. 31):");
				int day = scanner.nextInt();
				System.out.println("hour (e.g. 24):");
				int hour = scanner.nextInt();
				System.out.println("Minute (e.g. 60):");
				int minute = scanner.nextInt();
				System.out.println("");

				manageToDoList.addTaskToNewToDoList(taskName, year, month, day, hour, minute, 0);

				break;

			// Remove a Task of To Do List
			case 2:

				System.out.println("");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 1);
				System.out.println("");
				System.out.println("Please enter the Task Id:");
				System.out.println("");

				int taskId = scanner.nextInt();
				manageToDoList.removeTaskOfToDoList(taskId);
				System.out.println("");

				System.out.println("Updtaded To Do List");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 1);
				System.out.println("");

				break;

			// Change the Task Status
			case 3:

				System.out.println("");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 1);
				System.out.println("");

				System.out.println("Please enter the Task Id:");
				System.out.println("");
				int taskId1 = scanner.nextInt();
				System.out.println("Please enter the Task New status (COMPLETE or UNCOMPLETE:");
				System.out.println("");

				StatusOfTask statusOfTask = StatusOfTask.valueOf(scanner.next().toUpperCase().trim());

				manageToDoList.changeStatusOfTask(taskId1, statusOfTask);
				System.out.println("");

				System.out.println("Updtaded To Do List");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 1);
				System.out.println("");

				break;

			// Print Menu
			case 4:

				printMenuView();

				break;

			// Show the To DO List complete Percentage [%]
			case 5:

				System.out.println("");
				PrintToDoList.printCompleteTaskPercentage(manageToDoList.getNewToDoList());
						
				break;
				
				
			// Exit DONTFORGET2
			case 6:

				status = true;

				break;

			default:

				System.out.println("Select a valid command");
			}

		}

	}

	private void printMenuView() {

		boolean status = false;

		while (!status) {

			System.out.println("");
			System.out.println("|-------------------------------------------------------------------|");
			System.out.println("|                                                                   |");
			System.out.println("| *****************    TO DO LIST PRINT MENU   *********************|");
			System.out.println("|                                                                   |");
			System.out.println("|-------------------------------------------------------------------|");
			System.out.println("");

			System.out.println("");
			System.out.println("Please Enter An Option: ");
			System.out.println("Type <1> to Print To Do List by Ascending Creation Date");
			System.out.println("Type <2> to Print To Do List by Desscending Creation Date");
			System.out.println("Type <3> to Print To Do List by Ascending Due Date");
			System.out.println("Type <4> to Print To Do List by Descending Due Date");
			System.out.println("Type <5> to Print To Do List by Complete Status");
			System.out.println("Type <6> to Print To Do List by Uncomplete Status");
			System.out.println("Type <7> to Return to TO DO LIST SUB MENU");
			System.out.println("");

			int keyboardInput = scanner.nextInt();

			switch (keyboardInput) {

			// Print To Do List by Ascending Creation Date
			case 1:

				System.out.println("");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 2);

				break;

			// Print To Do List by Descending Creation Date
			case 2:

				System.out.println("");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 3);

				break;

			// Print To Do List by Ascending Due Date
			case 3:

				System.out.println("");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 4);

				break;

			// Print To Do List by Descending Due Date
			case 4:

				System.out.println("");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 5);

				break;

			// Print To Do List by Complete Status
			case 5:

				System.out.println("");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 6);

				break;

			// Print To Do List by Uncomplete Status
			case 6:

				System.out.println("");
				PrintToDoList.printToDoList(manageToDoList.getNewToDoList(), 7);

				break;

			// Return to TO DO LIST SUB MENU
			case 7:

				status = true;

				break;
			default:

				System.out.println("Select a valid command");
			}

		}

	}
}