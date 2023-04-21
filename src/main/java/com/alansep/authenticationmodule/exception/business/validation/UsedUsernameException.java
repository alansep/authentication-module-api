package com.alansep.authenticationmodule.exception.business.validation;

import com.alansep.authenticationmodule.exception.business.BusinessException;

public class UsedUsernameException extends BusinessException {

    public UsedUsernameException(String username) {
        super(UsedUsernameException.generateMessageFrom(username));
    }

    private static String generateMessageFrom(String username){
        return "The user %s is already registered".formatted(username);
    }

}
