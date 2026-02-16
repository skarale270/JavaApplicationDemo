package com.example.demoProject.controller;

import com.example.demoProject.model.Task;
import com.example.demoProject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // GET ALL TASKS
    @GetMapping
    public List<Task> getTasks() {
        return taskService.findAllTasks();
    }

    // ADD
    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task){
        return taskService.addTask(task);
    }

    // GET BY ID
    @GetMapping("/{taskId}")
    public Task getTask(@PathVariable String taskId){
        return taskService.getTaskByTaskId(taskId);
    }

    // GET BY SEVERITY
    @GetMapping("/severity/{severity}")
    public List<Task> findTaskUsingSeverity(@PathVariable int severity){
        return taskService.getTasksBySeverity(severity);
    }

    // GET BY ASSIGNEE
    @GetMapping("/assignee/{assignee}")
    public List<Task> getTaskByAssignee(@PathVariable String assignee){
        return taskService.getTaskByAssignee(assignee);
    }

    @PutMapping
    public Task modifyTask(@RequestBody Task task){
        return taskService.updateTask(task);
    }

    @DeleteMapping("/{taskId}")
    public String deleteTask(@PathVariable String taskId){
        return taskService.deleteTask(taskId);
    }
}
