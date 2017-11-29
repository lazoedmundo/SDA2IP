package controller;

import model.Task;
import model.ToDoList;

/**
 * 
 * StatsToDoList - This class is responsible of the following functions: calculate the percentage of the complete tasks of the To Do List
 * 
 * @author ELL
 *
 */
public class StatsToDoList {

	// FIELDS

	static double counter;
	static double completePercentage;

	// CONSTRUCTOR

	public StatsToDoList() {

		counter = 0;
		
	}

	// METHODS

	// CALCULATE THE PERCENTAGE OF THE COMPLETE TASKS

	/**
	 * 
	 * Method that calculates the percentage of the completed tasks of a To Do List
	 * 
	 * @param toDoListStats - ToDoList class object
	 */
	public static double calculatePercentageCompleteTasks(ToDoList toDoListStats) {
			
		for (Task completeStatus : toDoListStats.getToDoList()) {

			if (completeStatus.getTaskStatus() == StatusOfTask.COMPLETE) {

				counter = counter + 1;
			}
		}

		completePercentage = (counter / toDoListStats.getToDoList().size()) * 100;

		System.out.println("complete percentage = " + completePercentage);
		
		return completePercentage;
		
	}

	/**
	 * 
	 * Method that returns the percentage of the completed task of a TO Do List
	 * 
	 * @return - Percentage of completed tasks
	 */
	public static double getPercentagecompleteTasks() {

		return completePercentage;

	}

}
