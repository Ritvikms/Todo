package net.javaguides.todo_management.repository;

import net.javaguides.todo_management.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

// Todo- entity, Long- primary key datatype
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
