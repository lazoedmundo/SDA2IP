package controller;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;

import model.Task;
import model.ToDoList;

/**
 * 
 * SortToDoList - This class is responsible of the following functions: create comparator for the different sorting methods, and get the parameters for all the sorting methods
 * 
 * @author ELL
 *
 */
public class SortToDoList {

	// FIELDS

	// CONSTRUCTOR

	/**
	 *  This class does not require to initialize fields
	 */
	public SortToDoList() {

	}

	// SORT TO DO LIST BY CREATION DATE ASCENDING

	/**
	 * 
	 * Method that receives a ToDoList as parameter to sort the To Do List by ascending creation date
	 * 
	 * @param toDoListToSort
	 */
	public static void sortListByCreationDateAscending(ToDoList toDoListToSort) {

		Collections.sort(toDoListToSort.getToDoList(), CreationDateAscendingComparator);

	}

	/**
	 * Method that is used for the manual testing
	 */
	public void showListByCreationDateAscending() {

		System.out.println("| To Do List sorted by Ascending Creation Date |");
		System.out.println("Id  Task Name          Creation Date ");
		int index = 0;
		for (Task showList : ManageToDoList.newToDoList.getToDoList()) {
			index = index + 1;
			System.out.println(
					index + "   " + showList.getTaskName() + "               " + showList.getTaskCreationDate());
		}
	}

	// SORT TO DO LIST BY CREATION DATE DESCENDING

	/**
	 * 
	 * Method that receives a ToDoList as parameter to sort the To Do List by descending creation date

	 * 
	 * @param toDoListToSort
	 */
	public static void sortListByCreationDateDescending(ToDoList toDoListToSort) {

		Collections.sort(toDoListToSort.getToDoList(), CreationDateDescendingComparator);

	}

	// public void showListByCreationDateDescending() {
	//
	// System.out.println("| To Do List sorted by Descending Due Date |");
	// System.out.println("Id Task Name Due Date ");
	// int index = 0;
	// for (Task showList : newToDoList.getToDoList()) {
	// index = index + 1;
	// System.out.println(
	// index + " " + showList.getTaskName() + " " + showList.getTaskCreationDate());
	//
	// }
	// }

	// SORT TO DO LIST BY DUE DATE ASCENDING

	/**
	 * 
	 * Method that receives a ToDoList as parameter to sort the To Do List by ascending due date
	 * 
	 * @param toDoListToSort
	 */
	public static void sortListByDueDateAscending(ToDoList toDoListToSort) {

		Collections.sort(toDoListToSort.getToDoList(), DueDateAscendingComparator);

	}

	/**
	 * Method that is used for the manual testing
	 */
	public void showListByDueDateAscending() {

		System.out.println("| To Do List sorted by Ascending Due Date |");
		System.out.println("Id  Task Name          Creation Date ");
		int index = 0;
		for (Task showList : ManageToDoList.newToDoList.getToDoList()) {
			index = index + 1;
			System.out.println(index + "   " + showList.getTaskName() + "               " + showList.getTaskDueDate());
		}
	}

	// SORT TO DO LIST BY DUE DATE DESCENDING

	/**
	 * 
	 * Method that receives a ToDoList as parameter to sort the To Do List by descending due date
	 * 
	 * @param toDoListToSort
	 */
	public static void sortListByDueDateDescending(ToDoList toDoListToSort) {

		Collections.sort(toDoListToSort.getToDoList(), DueDateDescendingComparator);
	}

	// SORT TO DO LIST BY COMPLETE STATUS

	/**
	 * 
	 * Method that receives a ToDoList as parameter to sort the To Do List by complete status
	 * 
	 * @param toDoListToSort
	 */
	public static void sortListByCompleteStatus(ToDoList toDoListToSort) {

		Collections.sort(toDoListToSort.getToDoList(), CompleteTaskStatusComparator);

	}

	// SORT TO DO LIST BY UNCOMPLETE STATUS

	/**
	 * 
	 * Method that receives a ToDoList as parameter to sort the To Do List by incomplete status

	 * 
	 * @param toDoListToSort
	 */
	public static void sortListByUncompleteStatus(ToDoList toDoListToSort) {

		Collections.sort(toDoListToSort.getToDoList(), UncompleteTaskStatusComparator);

	}

	/**
	 * Method that is used for the manual testing
	 */
	public void showListByUncompleteStatus() {

		System.out.println("| To Do List sorted by Uncomplete Status |");
		System.out.println("Id  Task Name          Due Date       Task Status");
		int index = 0;
		for (Task showList : ManageToDoList.newToDoList.getToDoList()) {
			index = index + 1;
			System.out.println(index + "   " + showList.getTaskName() + "               " + showList.getTaskDueDate()
					+ "               " + showList.getTaskStatus());
		}
	}

	// COMPARATOR TO SORT TO DO LIST BY CREATION DATE

	public static Comparator<Task> CreationDateAscendingComparator = new Comparator<Task>() {

		public int compare(Task t1, Task t2) {

			LocalDateTime TaskCreationDate1 = t1.getTaskCreationDate();
			LocalDateTime TaskCreationDate2 = t2.getTaskCreationDate();

			return TaskCreationDate1.compareTo(TaskCreationDate2);

		}
	};

	public static Comparator<Task> CreationDateDescendingComparator = new Comparator<Task>() {

		public int compare(Task t1, Task t2) {

			LocalDateTime TaskCreationDate1 = t1.getTaskCreationDate();
			LocalDateTime TaskCreationDate2 = t2.getTaskCreationDate();

			return TaskCreationDate2.compareTo(TaskCreationDate1);

		}
	};

	// COMPARATOR TO SORT TO DO LIST BY DUE DATE

	public static Comparator<Task> DueDateAscendingComparator = new Comparator<Task>() {

		public int compare(Task t1, Task t2) {

			LocalDateTime TaskDueDate1 = t1.getTaskDueDate();
			LocalDateTime TaskDueDate2 = t2.getTaskDueDate();

			return TaskDueDate1.compareTo(TaskDueDate2);

		}
	};

	public static Comparator<Task> DueDateDescendingComparator = new Comparator<Task>() {

		public int compare(Task t1, Task t2) {

			LocalDateTime TaskDueDate1 = t1.getTaskDueDate();
			LocalDateTime TaskDueDate2 = t2.getTaskDueDate();

			return TaskDueDate2.compareTo(TaskDueDate1);
		}
	};

	// COMPARATOR TO SORT TO DO LIST BY COMPLETE STATUS

	public static Comparator<Task> CompleteTaskStatusComparator = new Comparator<Task>() {

		public int compare(Task t1, Task t2) {

			StatusOfTask TaskStatus1 = t1.getTaskStatus();
			StatusOfTask TaskStatus2 = t2.getTaskStatus();

			return TaskStatus1.compareTo(TaskStatus2);
		}

	};

	// COMPARATOR TO SORT TO DO LIST BY UNCOMPLETE STATUS

	public static Comparator<Task> UncompleteTaskStatusComparator = new Comparator<Task>() {

		public int compare(Task t1, Task t2) {

			StatusOfTask TaskStatus1 = t1.getTaskStatus();
			StatusOfTask TaskStatus2 = t2.getTaskStatus();

			return TaskStatus2.compareTo(TaskStatus1);

		}
	};

}
