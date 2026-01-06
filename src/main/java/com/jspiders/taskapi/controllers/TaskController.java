package com.jspiders.taskapi.controllers;

import com.jspiders.taskapi.data.tasks.CreateTaskRequest;
import com.jspiders.taskapi.data.tasks.Task;
import com.jspiders.taskapi.data.tasks.UpdateTaskRequest;
import com.jspiders.taskapi.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getAllTask(){
        System.out.println("this is TaskController --> getAllTask()");
        ResponseEntity<List<Task>> response = taskService.getAllTask();
        return response;
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long taskId){
        System.out.println("this is TaskController --> getTaskById()");
        ResponseEntity<Task> response = taskService.getTaskById(taskId);
        return response;
    }

    @PostMapping
    public ResponseEntity<String> createTask(@RequestBody CreateTaskRequest createTaskRequest) {
        System.out.println("this is TaskController --> createTask()");
        ResponseEntity<String> response = taskService.createTask(createTaskRequest);
        return response;
    }

    @PutMapping
    public ResponseEntity<String> updateTask(UpdateTaskRequest updateTaskRequest){
        System.out.println("This is TaskController --> updateTask()");
        ResponseEntity<String> response = taskService.updateTask(updateTaskRequest);
        return response;
    }

    @DeleteMapping
    public ResponseEntity<String> deleteTaskById(Long taskId){
        System.out.println("This is TaskController --> deleteTask()");
        ResponseEntity<String> response = taskService.deleteTaskById(taskId);
        return response;
    }


}
