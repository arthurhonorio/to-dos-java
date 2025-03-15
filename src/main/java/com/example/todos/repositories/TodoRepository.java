package com.example.todos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todos.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}