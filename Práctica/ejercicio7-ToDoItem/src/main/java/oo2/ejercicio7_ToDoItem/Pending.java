package oo2.ejercicio7_ToDoItem;

import java.time.Duration;

public class Pending extends State {

	
	public Pending(ToDoItem context) {
		super(context);
	}

	@Override
	public void start() {
		this.getContext().setState(new InProgress(this.getContext()));
		this.getContext().setStartingDuration();
	}

	@Override
	public void togglePause() {	
		throw new RuntimeException("ERROR: the task has never started");
	}

	@Override
	public Duration workedTime() {
		throw new RuntimeException("ERROR: the task has never started");
	}
}
