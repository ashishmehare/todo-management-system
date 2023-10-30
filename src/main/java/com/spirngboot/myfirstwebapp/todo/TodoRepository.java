package com.spirngboot.myfirstwebapp.todo;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {

	public java.util.List<Todo> findByUsername(String username);


}
