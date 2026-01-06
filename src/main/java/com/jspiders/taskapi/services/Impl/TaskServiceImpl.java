package com.jspiders.taskapi.services.Impl;

import com.jspiders.taskapi.data.tasks.CreateTaskRequest;
import com.jspiders.taskapi.data.tasks.Task;
import com.jspiders.taskapi.data.tasks.UpdateTaskRequest;
import com.jspiders.taskapi.services.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public ResponseEntity<String> createTask(CreateTaskRequest createTaskRequest) {
        System.out.println("This is TaskServiceImpl --> createTask()");
//       logics

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Task Created");
    }

    @Override
    public ResponseEntity<List<Task>> getAllTask() {
        System.out.println("This is TaskServiceImp --> getAllTask()");
//        logics

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @Override
    public ResponseEntity<Task> getTaskById(Long taskId) {
        System.out.println("This is TaskServiceImp --> getTaskById()");
//        logics

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @Override
    public ResponseEntity<String> updateTask(UpdateTaskRequest updateTaskRequest) {
        System.out.println("This is TaskServiceImp --> updateTask()");
//        logics

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Task Updated");
    }

    @Override
    public ResponseEntity<String> deleteTaskById(Long taskId) {
        System.out.println("This is TaskServiceImp --> deleteTask()");
//        logics

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Task Deleted");
    }
}
