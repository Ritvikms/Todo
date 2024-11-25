package net.javaguides.todo_management.service;

import jakarta.persistence.Id;
import net.javaguides.todo_management.dto.TodoDto;
import net.javaguides.todo_management.entity.Todo;

import java.util.List;

public interface TodoService {
    TodoDto addTodo(TodoDto todoDto);
    TodoDto getDto(Long id);
    List<TodoDto> getAllTodos();
    TodoDto updateTodo(TodoDto todoDto,Long id);
    void deleteTodo(Long id);
    TodoDto completeTodo(Long id);
    TodoDto inComplete(Long id);
}
