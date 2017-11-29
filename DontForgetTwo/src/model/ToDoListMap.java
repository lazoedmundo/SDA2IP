package model;

import java.util.HashMap;

	// NOTE: THIS CLASS HAS NOT BEEN IMPLEMENTED
public class ToDoListMap {

	// FIELDS

	public HashMap<String, ToDoList> toDoMap;

	// CONSTRUCTOR

	public ToDoListMap() {

	}

	// METHODS

	// TO DO MAP BY USER METHOD

	public void setToDoMapByUser() {
		toDoMap = new HashMap<>();
	}

	public HashMap<String, ToDoList> getToDoMapByUser() {
		return toDoMap;

	}

}
