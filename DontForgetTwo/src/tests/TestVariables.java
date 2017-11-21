package tests;

import controller.ManageUser;
import controller.StatusOfTask;
import model.Task;
import model.ToDoList;
import model.User;
import model.UserDataBase;

public class TestVariables {

	public static void main(String[] args) throws Exception {

		System.out.println("Test 1");
		System.out.println("");
		Task task1 = new Task("Manejar");
		task1.showTaskName();
		task1.getTaskCreationDate();
		task1.showTaskCreationDate();
		task1.setTaskDueDateTime(2017, 11, 30, 22, 30, 15);
		task1.showTaskDueDateTime();
		//task1.isTaskComplete(true);
		//task1.showStatus();
		task1.getTaskDuration();
		task1.showTaskduration();
		System.out.println("");

		System.out.println("Test 2");
		System.out.println("");
		Task task2 = new Task("Comer");
		task2.showTaskName();
		task2.getTaskCreationDate();
		task2.showTaskCreationDate();
		task2.setTaskDueDateTime(2017, 11, 15, 22, 30, 15);
		task2.showTaskDueDateTime();
		//task2.showStatus();
		task2.getTaskDuration();
		task2.showTaskduration();
		System.out.println("");

		System.out.println("Test 3");
		System.out.println("");
		ToDoList list1 = new ToDoList("Hobby");
		list1.getToDoList();
		list1.showToDoListName();
		list1.getListSize();
		list1.showListSize();
		System.out.println("");

		System.out.println("Test 4");
		System.out.println("");
		controller.ManageToDoList manageTo1 = new controller.ManageToDoList();
		manageTo1.addToDoList("Varios");
		manageTo1.addTaskToNewToDoList("leer", 2017, 11, 29, 21, 13, 0);
		manageTo1.getNewToDoList();
		manageTo1.addTaskToNewToDoList("programar", 2017, 11, 18, 21, 13, 0);
		manageTo1.getNewToDoList();
		manageTo1.addTaskToNewToDoList("jugar futbol", 2017, 11, 13, 21, 13, 0);
		manageTo1.addTaskToNewToDoList("cocinar", 2017, 11, 28, 21, 13, 0);
		
		
		manageTo1.showAddTaskToToDoList();
		System.out.println("");

		System.out.println("Test 5");
		System.out.println("");

		manageTo1.sortNewToDoListAscendingDueDate();
		
		controller.SortToDoList sortTo1 = new controller.SortToDoList();
		sortTo1.showListByDueDateAscending();
		System.out.println("");
		
		System.out.println("Test 6");
		System.out.println("");
		
		manageTo1.changeStatusOfTask(2,StatusOfTask.COMPLETE);
		manageTo1.changeStatusOfTask(0, StatusOfTask.COMPLETE);
		manageTo1.sortNewToDoListByUncompleteStatus();
		System.out.println("");
		
		controller.SortToDoList sortTo2 = new controller.SortToDoList();
		sortTo2.showListByUncompleteStatus();
		System.out.println("");
		
		System.out.println("Test 7");
		System.out.println("");
		
		
		manageTo1.changeStatusOfTask(0, StatusOfTask.COMPLETE);
		manageTo1.sortNewToDoListByCompleteStatus();
		
		System.out.println("");
		
		System.out.println("Test 8");
		System.out.println("");
		
		manageTo1.sortNewToDoListDescendingDueDate();
		
		System.out.println("");
		
		System.out.println("Test 9");
		System.out.println("");
		
		manageTo1.removeTaskOfToDoList(2);
		manageTo1.sortNewToDoListByCompleteStatus();
		System.out.println("");
		
		System.out.println("Test 10");
		System.out.println("");
		
		
		manageTo1.printPercetageTaskStatus();
		System.out.println("");
		
		System.out.println("Test 11");
		System.out.println("");
		
		User user1 = new User();
		user1.setUserEmail("lazoedmundo@hotmail.com");
		user1.setUserPassword("1234");
		user1.getUserEmail();
		user1.getUserPassword();
		user1.showUserEmail();
		user1.showUserPassword();
		
		System.out.println("");
		
		System.out.println("Test 12");
		System.out.println("");
		
		UserDataBase userDatabase1 = new UserDataBase();
		userDatabase1.addUserToDataBase("lazoedmundo@gmail.com", "4321");
		userDatabase1.addUserToDataBase("lazoedmundo@hotmail.com", "1234");
		userDatabase1.getUserDataBase();
		
		System.out.println("User email = " + userDatabase1.getUserDataBase().get("lazoedmundo@gmail.com").getUserEmail());
		System.out.println("User Password = " + userDatabase1.getUserDataBase().get("lazoedmundo@gmail.com").getUserPassword());
		System.out.println("");
		
		System.out.println("Test 13");
		System.out.println("");
				
		userDatabase1.showUserInfo(user1);
		
		System.out.println("same user = " + userDatabase1.authenticateUser("lazoedmundo@gmail.com", "4321"));
		System.out.println("");
		
		
		System.out.println("Test 14");
		System.out.println("");
		
		ManageUser manageUser1 = new ManageUser();
		
		System.out.println("Create a new user");
		manageUser1.createUser("newUserEmail1@gmail.com", "newUserPassword");
		manageUser1.createUser("newUserEmail1@gmail.com", "newUserPassword");
		
		System.out.println("");
		
		System.out.println("Test 15");
		System.out.println("");
		
				
		System.out.println("validate User email and pasword");
		
		manageUser1.validateUser("userEmailToValidate", "userPasswordToValidate");
		
		manageUser1.validateUser("newUserEmail1@gmail.com", "newUserPassword");
		
		System.out.println("");
		
		
		
		
		
	}

}
