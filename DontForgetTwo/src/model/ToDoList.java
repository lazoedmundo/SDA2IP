package model;

import java.util.ArrayList;

/**
 * 
 * Class ToDoList - This class has an ArrayList<Task>
 * 
 * @author ELL
 *
 */
public class ToDoList {

	// FIELDS

	private String toDoListName;
	private ArrayList<Task> toDoList;
	private int toDoListSize;

	// CONSTRUCTOR

	/**
	 * Constructor method that initializes the principal fields of a ToDoList Class
	 * 
	 * @param toDoListName
	 *            - this String value represents the name of the ToDoList
	 */
	public ToDoList(String toDoListName) {

		this.toDoListName = toDoListName;
		toDoList = new ArrayList<Task>();
		toDoListSize = 0;
	}

	// METHODS

	// LISTNAME METHODS

	/**
	 * 
	 * Method that changes the name of the To Do List
	 * 
	 * @param toDoListName
	 *            - String parameter that represents the name of the To Do List
	 */
	public void changeToDoListName(String toDoListName) {

		this.toDoListName = toDoListName;
	}

	/**
	 * 
	 * Method that returns the name of the To Do List
	 * 
	 * @return toDoListName - String value with the name of the To Do List
	 */
	public String getToDoListName() {

		return toDoListName;
	}

	/**
	 * Method that is used for the manual testing
	 */
	public void showToDoListName() {

		System.out.println("To Do List Name = " + toDoListName);
	}

	// LIST METHODS

	/**
	 * 
	 * Method that gets the todoList array
	 * 
	 * @return toDoList - is an ArrayList<Task>
	 */
	public ArrayList<Task> getToDoList() {

		return toDoList;
	}

	// LISTSIZE METHOD

	/**
	 * 
	 * Method that gets the list size number
	 * 
	 * @return toDoListSize - int value with the number of tasks that a To Do List
	 *         have
	 */
	public int getListSize() {

		toDoListSize = getToDoList().size();
		return toDoListSize;
	}

	/**
	 * Method that is used for the manual testing
	 */
	public void showListSize() {

		System.out.println("List size = " + toDoListSize);
	}

}
