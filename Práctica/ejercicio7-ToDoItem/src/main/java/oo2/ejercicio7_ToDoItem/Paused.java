package oo2.ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;

public class Paused extends State {

	
	public Paused(ToDoItem context) {
		super(context);
	}

	@Override
	public void togglePause() {
		this.getContext().setState(new InProgress(this.getContext()));
	}

	@Override
	public void finish() {
		this.getContext().setState(new Finished(this.getContext()));
		this.getContext().setEndDuration();
	}

	@Override
	public Duration workedTime() {
		return Duration.between(this.getContext().getStart(), LocalDate.now());
	}
}
