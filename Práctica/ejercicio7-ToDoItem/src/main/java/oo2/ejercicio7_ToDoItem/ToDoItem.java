package oo2.ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {

	private String name;
	private State state;
	private List<String> comments;
	private LocalDate started, ended;
	
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	public ToDoItem(String name) {
		this.name = name;
		this.comments = new ArrayList<>();
		this.setState(new Pending(this));
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void setStartingDuration() {
		this.started = LocalDate.now();
	}
	
	public void setEndDuration() {
		this.ended = LocalDate.now();
	}
	
	public LocalDate getStart() {
		return this.started;
	}
	
	public LocalDate getEnd() {
		return this.ended;
	}

	public void add(String comment) {
		this.comments.add(comment);
	}
	
	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	public void start() {
		this.state.start();
	}

	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause() {
		this.state.togglePause();
	}

	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish() {
		this.state.finish();
	}

	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime() {
		return this.state.workedTime();
	}

	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	public void addComment(String comment) {
		this.state.addComment(comment);
	}
}
