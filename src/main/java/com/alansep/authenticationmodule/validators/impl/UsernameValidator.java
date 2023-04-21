package com.alansep.authenticationmodule.validators.impl;

import com.alansep.authenticationmodule.dto.UserToBeCreatedDTO;
import com.alansep.authenticationmodule.exception.business.validation.UsedUsernameException;
import com.alansep.authenticationmodule.repository.UserRepository;
import com.alansep.authenticationmodule.validators.UserCreationValidator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UsernameValidator extends UserCreationValidator {

    private final UserRepository userRepository;

    @Override
    protected void verify(UserToBeCreatedDTO userToBeCreated) {
        final var isAvailableUsername = userRepository.countByUsername(userToBeCreated.getUsername()) == 0;
        if(!isAvailableUsername){
            throw new UsedUsernameException("Invalid username");
        }
    }

}
