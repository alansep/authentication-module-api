package com.alansep.authenticationmodule.controller;

import com.alansep.authenticationmodule.dto.CreatedUserDTO;
import com.alansep.authenticationmodule.dto.UserToBeCreatedDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<CreatedUserDTO> addUser(UserToBeCreatedDTO userToBeCreated){
        return ResponseEntity.ok(null);
    }


}
