package com.jspiders.taskapi.services.Impl;

import com.jspiders.taskapi.data.users.AppUser;
import com.jspiders.taskapi.data.users.CreateUserRequest;
import com.jspiders.taskapi.error.InvalidNameException;
import com.jspiders.taskapi.services.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Override
    public ResponseEntity<String> createUser(CreateUserRequest createUserRequest) {
        System.out.println("this is AppUserServiceImpl --> createUser()");

        // logics
//        ResponseEntity<String> response = ResponseEntity.ok("User Created");
//        return response;

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("User Created");
    }

    @Override
    public ResponseEntity<String> updateUser() {
        System.out.println("This is AppUserServiceImpl --> updateUser");
//        logics
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("User Updated");
    }

    @Override
    public ResponseEntity<String> deleteUser(String email, String mobile, String password) {
        System.out.println("This is AppUserServiceImpl --> deleteUser()");
        //        logics
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("User Deleted");
    }

    @Override
    public ResponseEntity<List<AppUser>> getAllUsers() {
        System.out.println("This is AppUserServiceImpl --> getAllUsers()");
        //        logics
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @Override
    public ResponseEntity<AppUser> getUserById(Long Id) {
        System.out.println("This is AppUserServiceImpl --> getUserById()");
        //        logics
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    private void validateName(CreateUserRequest createUserRequest){
        if(createUserRequest.getName() != null && createUserRequest.getName().length()>1){

            InvalidNameException ex  = new InvalidNameException("Invalid name");
            throw ex;
        }
    }
}
