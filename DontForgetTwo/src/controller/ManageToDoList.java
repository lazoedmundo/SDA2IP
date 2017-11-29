package controller;

import model.Task;
import model.ToDoList;

/**
 * 
 * ManageToDoList - This class is responsible of the following functions:
 * creates a To Do List, add tasks to a To Do List, changes the name of the To
 * Do List, changes the status of the tasks, gets the percentage of the complete
 * task, removes tasks of the To Do List, and sorts the To Do List under
 * ascending and descending tasks creation dates, due dates, and status of task.
 * 
 * @author ELL
 *
 */
public class ManageToDoList {

	// FIELDS

	protected static ToDoList newToDoList;
	private Task newToDoTask;
	private static int printOptions;

	// CONSTRUCTOR

	/**
	 * Constructor method that initializes the print option field
	 */
	public ManageToDoList() {

		printOptions = 0;

	}

	// METHOD TO CREATE TO DO LIST
	
	/**
	 * 
	 * Method that creates a ToDoList object
	 * 
	 * @param toDoListName - String parameter representing the name of the To Do List
	 */
	public void createToDoList(String toDoListName) {

		newToDoList = new ToDoList(toDoListName);
	}

	// METHOD THAT CHANGE TO DO LIST NAME

	
	/**
	 * 
	 * Method that sets a new name of the To Do List
	 * 
	 * @param toDoListName - String parameter of the name of the To Do List
	 */
	public void changeNewToDoListName(String toDoListName) {

		newToDoList.changeToDoListName(toDoListName);
	}

	// GET TO DO LIST

	
	/**
	 * 
	 * Method that returns a ToDoList object
	 * 
	 * @return - ToDoList object
	 */
	public ToDoList getNewToDoList() {
		return newToDoList;
	}

	// ADD TASK TO TO DO LIST METHOD

	/**
	 * 
	 * Method that creates a task, sets the due date and adds the task to a To Do List
	 * 
	 * @param taskName - String parameter with the name of the task
	 * @param year - Year of the task dude date
	 * @param month - Month of the task dude date
	 * @param day - Day of the task dude date
	 * @param hour - Hour of the task dude date
	 * @param minute - Minute of the task dude date
	 * @param seconds - This parameter will be set to 0
	 */
	public void addTaskToNewToDoList(String taskName, int year, int month, int day, int hour, int minute, int seconds) {

		newToDoTask = new Task(taskName);
		newToDoTask.setTaskDueDateTime(year, month, day, hour, minute, seconds);
		newToDoList.getToDoList().add(newToDoTask);
	}

	// REMOVE TO DO LIST METHOD

	
	/**
	 * 
	 * Method that removes a task of a To Do List by given the task id
	 * 
	 * @param index - Int parameter that gives the id number of the task that we want to remove
	 */
	public void removeTaskOfToDoList(int index) {

		newToDoList.getToDoList().remove(index - 1);

	}

	// ADDTASK METHOD when we incorporate the hashmap
	// public void AddTask(/* task parameters */ /* listidentifier */) {
	/* run create task with task parameters */

	// to include when we want to add a task in a list
	// return taskMap.get(listName).addTask((newTask);

	/**
	 * Method that is used for the manual testing
	 */
	public void showAddTaskToToDoList() {

		System.out.println("Id  Task Name          Due Date ");
		int index = 0;
		for (Task showList : newToDoList.getToDoList()) {
			index = index + 1;
			System.out.println(index + "   " + showList.getTaskName() + "               " + showList.getTaskDueDate());

			// System.out.println("AddTask Name = " + showList.getTaskName());
			// System.out.println("Task Due Date = " + showList.getTask
		}
	}

	// public boolean addTask(Task newTask) {
	// return newToDoList.add(newTask);
	// }

	// CHANGE TASK STATUS IN TO DO LIST
	
	
	
	/**
	 * 
	 * Method that sets the status of the tasks to Complete or Incomplete
	 * 
	 * @param index - Int with the task id
	 * @param isComplete - Enum with the following options COMPLETE or INCOMPLETE
	 */
	public void changeStatusOfTask(int index, StatusOfTask isComplete) {

		StatusOfTask taskStatus = null;
		switch (isComplete) {
		case COMPLETE:
			taskStatus = isComplete;
			break;
		case INCOMPLETE:
			taskStatus = isComplete;
			break;
		default:
			break;

		}

		newToDoList.getToDoList().get(index - 1).taskStatus(taskStatus);

	}

	// SORT TO DO LIST BY ASCENDING CREATION DATE

	/**
	 * Method that sorts and prints the To Do List by ascending creation date
	 */
	public void sortNewToDoListAscendingCreationDate() {
		SortToDoList.sortListByCreationDateAscending(newToDoList);
		printOptions = 1;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// SORT TO DO LIST BY DESCENDING CREATION DATE

	/**
	 * Method that sorts and prints the To Do List by descending creation date
	 */
	public void sortNewToDoListDescendingCreationDate() {
		SortToDoList.sortListByCreationDateDescending(newToDoList);
		printOptions = 2;
		PrintToDoList.printToDoList(newToDoList, printOptions);
	}

	// SORT TO DO LIST BY ASCENDING DUE DATE

	/**
	 * Method that sorts and prints the To Do List by ascending due date
	 */
	public void sortNewToDoListAscendingDueDate() {
		SortToDoList.sortListByDueDateAscending(newToDoList);
		printOptions = 3;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// SORT TO DO LIST BY DESCENDING DUE DATE

	/**
	 * Method that sorts and prints the To Do List by descending due date
	 */
	public void sortNewToDoListDescendingDueDate() {
		SortToDoList.sortListByDueDateDescending(newToDoList);
		printOptions = 4;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// SORT TO DO LIST BY COMPLETE STATUS
	
	/**
	 * Method that sorts and prints the To Do List by complete status
	 */
	public void sortNewToDoListByCompleteStatus() {
		SortToDoList.sortListByCompleteStatus(newToDoList);
		printOptions = 5;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// SORT TO DO LIST BY UNCOMPLETE STATUS

	/**
	 * Method that sorts and prints the To Do List by incomplete status
	 */
	public void sortNewToDoListByUncompleteStatus() {
		SortToDoList.sortListByUncompleteStatus(newToDoList);
		printOptions = 6;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// CALCULATE THE PERCENTAGE OF TASK COMPLETED

	/**
	 * Method that calculates and prints the percentage of the compete task of a To Do List
	 */
	public void printPercentageTaskStatus() {

		StatsToDoList.calculatePercentageCompleteTasks(newToDoList);
		PrintToDoList.printCompleteTaskPercentage(newToDoList);
	}

}
