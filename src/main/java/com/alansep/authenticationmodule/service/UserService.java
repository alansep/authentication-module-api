package com.alansep.authenticationmodule.service;

import com.alansep.authenticationmodule.dto.CreatedUserDTO;
import com.alansep.authenticationmodule.dto.UserToBeCreatedDTO;
import com.alansep.authenticationmodule.model.User;
import com.alansep.authenticationmodule.repository.UserRepository;
import com.alansep.authenticationmodule.validators.UserCreationValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public CreatedUserDTO createUser(final UserToBeCreatedDTO userToBeCreated) {
        final var validator = UserCreationValidator.getValidatorWith(userRepository);

        validator.validate(userToBeCreated);

        return userRepository.save(User.from(userToBeCreated)).toCreatedUserDTO();
    }
}

