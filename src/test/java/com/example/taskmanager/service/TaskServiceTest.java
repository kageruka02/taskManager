package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    private final TaskRepository repository = Mockito.mock(TaskRepository.class);

    private final TaskService service = new TaskService(repository);

    @Test
    void shouldReturnAllTasks() {

        Task task = new Task(1L, "Study DevOps", "IN_PROGRESS");

        Mockito.when(repository.findAll()).thenReturn(List.of(task));

        List<Task> tasks = service.getAllTasks();

        assertEquals(1, tasks.size());
        assertEquals("Study DevOps", tasks.get(0).getTitle());
    }
}