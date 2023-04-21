package com.alansep.authenticationmodule.controller;

import com.alansep.authenticationmodule.dto.CreatedUserDTO;
import com.alansep.authenticationmodule.dto.UserToBeCreatedDTO;
import com.alansep.authenticationmodule.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<CreatedUserDTO> createUser(@Valid UserToBeCreatedDTO userToBeCreated) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userToBeCreated));
    }

}
