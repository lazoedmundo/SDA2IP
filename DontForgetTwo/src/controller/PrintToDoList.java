package controller;

import java.text.DecimalFormat;

import model.Task;
import model.ToDoList;

public class PrintToDoList {

	// FIELDS

	int printOptions;

	// CONSTRUCTOR

	public PrintToDoList() {

	}

	// METHODS

	public static void printToDoList(ToDoList toDoListToPrint, int printOptions) {

		switch (printOptions) {

		case 1:

			// GENERIC TO DO LIST
			System.out.println("| To Do List  |");

			break;

		case 2:

			// SORT TO DO LIST BY ASCENDING CREATION DATE
			System.out.println("| To Do List sorted by Ascending Creation Date |");

			break;

		case 3:

			// SORT TO DO LIST BY DESCENDING CREATION DATE
			System.out.println("| To Do List sorted by Descending Creation Date |");

			break;

		case 4:

			// SORT TO DO LIST BY ASCENDING DUE DATE
			System.out.println("| To Do List sorted by Ascending Due Date |");

			break;
		case 5:

			// SORT TO DO LIST BY DESCENDING DUE DATE
			System.out.println("| To Do List sorted by Descending Due Date |");

			break;

		case 6:

			// SORT TO DO LIST BY COMPLETE STATUS
			System.out.println("| To Do List sorted by Complete Status |");

			break;

		case 7:

			// SORT TO DO LIST BY UNCOMPLETE STATUS
			System.out.println("| To Do List sorted by uncomplete Status |");

			break;

		default:
			break;

		}

		System.out.println(
				"Id  Task Name          Creation Date          Due Date          Days remaining            Task Status");
		int index1 = 0;
		for (Task showList : ManageToDoList.newToDoList.getToDoList()) {
			index1 = index1 + 1;

//			//System.out.format("%1d%16s", index1, showList.getTaskName(), System.out.println(",
//					showList.getTaskDueDate(), showList.getTaskDuration(), showList.getTaskStatus());
//			//System.out.println(index1 + "   " + showList.getTaskName() + "               "
//					+ showList.getTaskCreationDate() + "               " + showList.getTaskDueDate() + "               "
//					+ showList.getTaskDuration() + "               " + showList.getTaskStatus());
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("Task Id = " + index1);
			System.out.println("Task Name = " + showList.getTaskName());
			System.out.println("Task Creation Date = " + showList.getTaskCreationDate());
			System.out.println("Task Due Date = " + showList.getTaskDueDate());
			System.out.println("Task Duration [days] = " + showList.getTaskDuration());
			System.out.println("Task Status = " + showList.getTaskStatus());
			System.out.println("-----------------------------------------------------------");
			System.out.println("");
		
		
		}

	}

	public static void printCompleteTaskPercentage(ToDoList completePercentagePrint) {

		DecimalFormat dec = new DecimalFormat("#0"/* "#0.00" es para 2 decimales */);

		System.out.println("List Name = " + ManageToDoList.newToDoList.getToDoListName());
		System.out.println(
				"Percentage of Tasks complete = " + dec.format(StatsToDoList.getPercentagecompleteTasks()) + " % ");

	}

}
