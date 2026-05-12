package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Slf4j
@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task createTask(Task task) {


        log.info("Creating task: {}", task.getTitle());
        return repository.save(task);
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }
}