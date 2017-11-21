package model;

import java.util.ArrayList;

public class ToDoList {

	// FIELDS

	private String toDoListName;
	private ArrayList<Task> toDoList;
	private int toDoListSize;
	
	// CONSTRUCTOR

	public ToDoList(String toDoListName) {
		
		this.toDoListName = toDoListName;
		toDoList = new ArrayList<Task>();
		toDoListSize = 0;
	}

	// LISTNAME METHODS

	public void changeToDoListName(String toDoListName) {
		this.toDoListName = toDoListName;
	}

	public String getToDoListName() {
		return toDoListName;
	}

	public void showToDoListName() {

		System.out.println("To Do List Name = " + toDoListName);
	}

	// LIST METHODS

	public ArrayList<Task> getToDoList() {
		return toDoList;
	}

	// LISTSIZE METHOD

	public int getListSize() {
		toDoListSize = getToDoList().size();
		return toDoListSize;
	}

	public void showListSize() {
		System.out.println("List size = " + toDoListSize);
	}
	
}
