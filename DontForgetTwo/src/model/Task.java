package model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import controller.StatusOfTask;

/**
 * Class Task - 
 * This Class has the principal fields of a Task
 * @author ELL
 */

public class Task {

	// FIELDS

	private String taskName;
	private LocalDateTime taskCreationDate;
	private LocalDateTime taskDueDateTime;
	private long taskDuration;
	private StatusOfTask taskStatus;

	// <CONSTRUCTOR>

	/**
	 * Constructor method that initializes the principal fields of a Task
	 * 
	 * @param taskName - name of the task
	 */
	public Task(String taskName) {
		
		this.taskName = taskName;
		taskCreationDate = LocalDateTime.now();
		taskStatus = StatusOfTask.INCOMPLETE;
	}

	// <CLASS METHODS>

	/**
	 * Getter method that returns the Task Name
	 * 
	 * @return taskName - name of the task
	 */
	public String getTaskName() {
		
		return taskName;
	}
	
	/**
	 * Method that is used for the manual testing
	 */
	public void showTaskName() {
		
		System.out.println("Task Name = " + taskName);
	}

	// TASK CREATION DATE METHODS

	/**
	 * Method that returns the Task Creation Date
	 * 
	 * @return taskCreationDate
	 */
	public LocalDateTime getTaskCreationDate() {
		
		return taskCreationDate;
	}
	
	/**
	 * Method that is used for the manual testing
	 */
	public void showTaskCreationDate() {
		
		DateTimeFormatter showTaskCreationDate;
		showTaskCreationDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
				.withLocale(new Locale("en", "IN"));
		System.out.println("Task Creation Date = " + showTaskCreationDate.format(taskCreationDate));
		// Use Indian(English) locale to format date time in medium style
	
	}

	// TASK DUE DATE TIME METHODS
	
	/**
	 * 
	 * Method that sets the values of the task due date
	 * 
	 * @param year - year of the due date
	 * @param month - month of the due date
	 * @param day - day of the due date
	 * @param hour - hour of the due date
	 * @param minute - minute of the due date
	 * @param seconds - seconds of the due date in general it is settled to 0
	 */
	public void setTaskDueDateTime(int year, int month, int day, int hour, int minute, int seconds) {
		
		taskDueDateTime = LocalDateTime.of(year, month, day, hour, minute, seconds);
	}

	
	/**
	 * Method that returns the task due date
	 * 
	 * @return taskDueDate
	 */
	public LocalDateTime getTaskDueDate() {
		
		return taskDueDateTime;
	}

	/**
	 * Method that is used for the manual testing
	 */
	public void showTaskDueDateTime() {
		
		DateTimeFormatter showTaskDueDate;
		showTaskDueDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("en", "IN"));
		System.out.println("Task Due Date = " + showTaskDueDate.format(taskDueDateTime));
	}

	// TASK DURATION METHODS

	
	/**
	 * 
	 * Method that returns the task duration date
	 * 
	 * @return taskDuration - value in days
	 */
	public long getTaskDuration() {
		
		taskDuration = Duration.between(taskCreationDate, taskDueDateTime).toDays();
		return taskDuration;
	}

	/**
	 * Method that is used for the manual testing
	 */
	public void showTaskduration() {
		
		System.out.println("Task Duration = " + taskDuration + " days");
	}

	// TASK STATUS METHODS
	
	/**
	 * Method that sets the status of the task
	 * @param taskStatus - the parameter is set to COMPLETE or UNCOMPLETE
	 */
	public void taskStatus(StatusOfTask taskStatus) {
		
		this.taskStatus = taskStatus;
	}

	
	/**
	 * 
	 * Method that returns the status of the task
	 * 
	 * @return taskStatus - the vales that can return are COMPLETE or UNCOMPLETE
	 */
	public StatusOfTask getTaskStatus() {
		
		return taskStatus;
	}

}