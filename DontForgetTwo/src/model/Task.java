package model;




import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import controller.StatusOfTask;

/**
 * @author Edmundo Lazo
 * Class for Tasks in ToDoList 
 */
public class Task {

	// FIELDS

	private String taskName;
	private LocalDateTime taskCreationDate;
	private LocalDateTime taskDueDateTime;
	private long taskDuration;
	private StatusOfTask taskStatus;

	// CONSTRUCTOR
	
	/**
	 * Creates a Task
	 * @param taskName
	 */
	public Task(String taskName) {
		this.taskName = taskName;
		taskCreationDate = LocalDateTime.now();
		taskStatus = StatusOfTask.UNCOMPLETE;
	}

	// TASKNAME METHODS

	
	/**
	 * Getter method that returns the Task Name
	 * @return
	 */
	public String getTaskName() {
		return taskName;
	}

	public void showTaskName() {
		System.out.println("Task Name = " + taskName);
	}

	// TASK CREATION DATE METHODS

	
	/**
	 * Getter method that returns the Task Creation Date
	 * @return
	 */
	public LocalDateTime getTaskCreationDate() {
		return taskCreationDate;
	}

	// Use Indian(English) locale to format date time in medium style

	public void showTaskCreationDate() {
		DateTimeFormatter showTaskCreationDate;
		showTaskCreationDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
				.withLocale(new Locale("en", "IN"));
		System.out.println("Task Creation Date = " + showTaskCreationDate.format(taskCreationDate));
	}

	// TASK DUE DATE TIME METHODS

	public void setTaskDueDateTime(int year, int month, int day, int hour, int minute, int seconds) {
		taskDueDateTime = LocalDateTime.of(year, month, day, hour, minute, seconds);
	}

	public LocalDateTime getTaskDueDate() {
		return taskDueDateTime;
	}

	public void showTaskDueDateTime() {
		DateTimeFormatter showTaskDueDate;
		showTaskDueDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("en", "IN"));
		System.out.println("Task Due Date = " + showTaskDueDate.format(taskDueDateTime));
	}

	// TASK DURATION METHODS

	public long getTaskDuration() {
		taskDuration = Duration.between(taskCreationDate, taskDueDateTime).toDays();
		return taskDuration;
	}

	public void showTaskduration() {
		System.out.println("Task Duration = " + taskDuration + " days");
	}

	// TASK STATUS METHODS

	public void isTaskComplete(StatusOfTask taskStatus) {
		this.taskStatus = taskStatus;
	}

	public StatusOfTask getTaskStatus() {
		return taskStatus;
	}

}