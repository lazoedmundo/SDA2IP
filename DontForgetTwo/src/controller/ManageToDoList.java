 package controller;

import model.Task;
import model.ToDoList;

public class ManageToDoList {

	// FIELDS

	protected static ToDoList newToDoList;
	private Task newToDoTask;
	private static int printOptions;

	// CONSTRUCTOR

	public ManageToDoList() {

		printOptions = 0;

	}

	// CREATE TO DO LIST METHOD

	public void addToDoList(String toDoListName) {

		newToDoList = new ToDoList(toDoListName);
	}

	// CHANGE TO DO LIST NAME

	public void changeNewToDoListName(String toDoListName) {

		newToDoList.changeToDoListName(toDoListName);
	}

	// GET TO DO LIST

	public ToDoList getNewToDoList() {
		return newToDoList;
	}

	// ADD TASK TO TO DO LIST METHOD

	public void addTaskToNewToDoList(String taskName, int year, int month, int day, int hour, int minute, int seconds) {

		newToDoTask = new Task(taskName);
		newToDoTask.setTaskDueDateTime(year, month, day, hour, minute, seconds);
		newToDoList.getToDoList().add(newToDoTask);
	}

	// REMOVE TO DO LIST METHOD

	public void removeTaskOfToDoList(int index) {

		newToDoList.getToDoList().remove(index - 1);

	}

	// ADDTASK METHOD when we incorporate the hashmap
	// public void AddTask(/* task parameters */ /* listidentifier */) {
	/* run create task with task parameters */

	// to include when we want to add a task in a list
	// return taskMap.get(listName).addTask((newTask);

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



	public void changeStatusOfTask(int index, StatusOfTask isComplete) {

		
		StatusOfTask taskStatus = null;
		switch (isComplete) {
		case COMPLETE:
			taskStatus = isComplete;
			break;
		case UNCOMPLETE:
			taskStatus = isComplete;
			break;
		default:
			break;
				
		}
		
		
		newToDoList.getToDoList().get(index).isTaskComplete(taskStatus);

	}

	// SORT TO DO LIST BY ASCENDING CREATION DATE

	public void sortNewToDoListAscendingCreationDate() {
		SortToDoList.sortListByCreationDateAscending(newToDoList);
		printOptions = 1;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// SORT TO DO LIST BY DESCENDING CREATION DATE

	public void sortNewToDoListDescendingCreationDate() {
		SortToDoList.sortListByCreationDateDescending(newToDoList);
		printOptions = 2;
	}

	// SORT TO DO LIST BY ASCENDING DUE DATE

	public void sortNewToDoListAscendingDueDate() {
		SortToDoList.sortListByDueDateAscending(newToDoList);
		printOptions = 3;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// SORT TO DO LIST BY DESCENDING DUE DATE

	public void sortNewToDoListDescendingDueDate() {
		SortToDoList.sortListByDueDateDescending(newToDoList);
		printOptions = 4;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// SORT TO DO LIST BY COMPLETE STATUS

	public void sortNewToDoListByCompleteStatus() {
		SortToDoList.sortListByCompleteStatus(newToDoList);
		printOptions = 5;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// SORT TO DO LIST BY UNCOMPLETE STATUS

	public void sortNewToDoListByUncompleteStatus() {
		SortToDoList.sortListByUncompleteStatus(newToDoList);
		printOptions = 6;
		PrintToDoList.printToDoList(newToDoList, printOptions);

	}

	// CALCULATE THE PERCENTAGE OF TASK COMPLETED
	
	public void printPercetageTaskStatus() {
		
		StatsToDoList.calculatePercentageCompleteTasks(newToDoList);
		PrintToDoList.printCompleteTaskPercentage(newToDoList);
	}
	
	
	
	
	
	
}
