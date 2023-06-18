package com.example.thymleaf.repository;

import com.example.thymleaf.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TodoRepository {

    //Sử dụng để lưu danh sách công việc
    //Thay thế cho database
    //demo
    private List<Todo> todoList = new ArrayList<>();

    public List<Todo> getAll() {
        return todoList;
    }

    public void add(Todo todo) {
        int id = 0;
        if (todoList.size() > 0) {
            id = todoList.get(todoList.size() - 1).getId() + 1;
        }
        todo.setId(id);
        todoList.add(todo);
    }

    public void deleteById(int id) {
        todoList = todoList.stream()
                .filter(todo -> todo.getId() != id)
                .collect(Collectors.toList());
    }
}
