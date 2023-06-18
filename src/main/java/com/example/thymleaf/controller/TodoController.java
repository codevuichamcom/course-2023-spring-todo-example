package com.example.thymleaf.controller;

import com.example.thymleaf.model.Todo;
import com.example.thymleaf.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    //Hiển thị lên danh sách công việc
    @GetMapping("/todos")
    public String listAllTodo(Model model) {
        List<Todo> todoList = todoService.getAll();
        model.addAttribute("todoList", todoList);

        //Trả về template todo.html
        return "todo";
    }

    @GetMapping("/add-todo")
    public String addTodo(Model model) {
        model.addAttribute("todo", Todo.builder().build());
        return "addTodo";
    }

    @PostMapping("/add-todo")
    public String saveTodo(@ModelAttribute Todo todo) {
        todoService.save(todo);
        return "redirect:/todos";
    }

    @GetMapping("/delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteById(id);
        return "redirect:/todos";
    }
}
