package com.alansep.authenticationmodule.validators;

import com.alansep.authenticationmodule.dto.UserToBeCreatedDTO;
import com.alansep.authenticationmodule.repository.UserRepository;
import com.alansep.authenticationmodule.validators.impl.UsernameValidator;

public abstract class UserCreationValidator {

    private UserCreationValidator next;

    public UserCreationValidator addNext(UserCreationValidator validator){
        this.next = validator;
        return validator;
    }

    public void validate(UserToBeCreatedDTO userToBeCreated) {
        verify(userToBeCreated);
        if(next != null) {
            next.validate(userToBeCreated);
        }
    }

    protected abstract void verify(UserToBeCreatedDTO userToBeCreated);

    public static UserCreationValidator getValidatorWith(UserRepository userRepository){
        final var validator = new UsernameValidator(userRepository);
        return validator;
    }

}
