package com.entities;

import java.util.Date;

public class Todo {
	private String todotitle;
	private String todoContent;
	private Date dob;
	public Todo(String todotitle, String todoContent, Date dob) {
		super();
		this.todotitle = todotitle;
		this.todoContent = todoContent;
		this.dob = dob;
	}
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTodotitle() {
		return todotitle;
	}
	public void setTodotitle(String todotitle) {
		this.todotitle = todotitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
@Override
	public String toString() {
		return this.getTodotitle()+" : "+this.todoContent;
	}
	

}
