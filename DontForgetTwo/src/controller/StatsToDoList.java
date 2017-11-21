package controller;

import model.Task;
import model.ToDoList;

public class StatsToDoList {

	// FIELDS

	static double counter;
	static double completePercentage;

	// CONSTRUCTOR

	public StatsToDoList() {

		counter = 0;
		// completePercentage = 0;

	}

	// METHODS

	// CALCULATE THE PERCENTAGE OF THE COMPLETE TASKS

	public static void calculatePercentageCompleteTasks(ToDoList toDoListStats) {

		// Collections.sort(toDoListToSort.getToDoList(),
		// CreationDateAscendingComparator);

		for (Task completeStatus : toDoListStats.getToDoList()) {

			if (completeStatus.getTaskStatus() == StatusOfTask.COMPLETE) {

				counter = counter + 1;
			}
		}

		completePercentage = (counter / toDoListStats.getToDoList().size()) * 100;

	}

	public static double getPercentagecompleteTasks() {

		return completePercentage;

	}

}
