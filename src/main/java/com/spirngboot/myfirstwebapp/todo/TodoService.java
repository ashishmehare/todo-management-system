package com.spirngboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	

	private static List<Todo> todos=new ArrayList<>();
	private  static  int todoscount=0;
	
	static {
		todos.add(new Todo(++todoscount, "Ashish", "learn AWS", LocalDate.now().plusYears(0), false));
		todos.add(new Todo(++todoscount, "Ashish", "learn AWS", LocalDate.now().plusYears(0), false));
		todos.add(new Todo(++todoscount, "Ashish", "learn AWS", LocalDate.now().plusYears(0), false));
		
	}
	
	public List<Todo> findbyUsername(String username){
		Predicate<? super Todo> predicate = 
				todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	public void addTodo(String username,String description,LocalDate targetDate,boolean done ) {
		Todo todo=new Todo(++todoscount,username,description,targetDate,done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		Predicate<? super Todo> predicate
		=todo->todo.getId()==id;
		todos.removeIf(predicate);
	}
    
	public Todo findById(int id) {
		Predicate<? super Todo> predicate
		=todo->todo.getId()==id;
	  Todo todo=todos.stream().filter(predicate).findFirst().get();
		return todo;
	
	

}
	public void updateTodo(Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);	
	}
}