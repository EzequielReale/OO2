package oo2.ejercicio7_ToDoItem;

import java.time.Duration;

public class Finished extends State {

	
	public Finished(ToDoItem context) {
		super(context);
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: the task is finished (like Penaldo)");
	}

	@Override
	public Duration workedTime() {
		return Duration.between(this.getContext().getStart(), this.getContext().getEnd());
	}

	@Override
	public void addComment(String comment) {}
}
