package com.example.thymleaf.service;

import com.example.thymleaf.model.Todo;
import com.example.thymleaf.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<Todo> getAll() {
        return todoRepository.getAll();
    }

    public void save(Todo todo) {
        todoRepository.add(todo);
    }

    public void deleteById(int id) {
        todoRepository.deleteById(id);
    }
}
