package model;

import java.util.HashMap;

public class ToDoListMap {

	//FIELDS
	
	public HashMap <String, ToDoList> toDoMap; 
		
	//CONSTRUCTOR
	
	public ToDoListMap () {
		
	}
	
	//METHODS
	
	// TODOMAPBYUSER METHOD
	
	public void setToDoMapByUser() {
		toDoMap = new HashMap <>();
	}
	
	public HashMap<String, ToDoList> getToDoMapByUser() {
		return toDoMap;
		
	}
	
}
