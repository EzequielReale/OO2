package oo2.ejercicio7_ToDoItem;

import java.time.Duration;

public abstract class State {

	private ToDoItem context;
	
	
	public State(ToDoItem context) {
		this.context = context;
	}
	
	public ToDoItem getContext() {
		return this.context;
	}
	
	public void start() {}

	public abstract void togglePause();

	public void finish() {}

	public abstract Duration workedTime();

	public void addComment(String comment) {
		this.getContext().add(comment);
	}
}
