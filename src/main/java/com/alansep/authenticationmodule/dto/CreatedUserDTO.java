package com.alansep.authenticationmodule.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
public class CreatedUserDTO {

    private static final String DOUBLE_ASTERISK = "**";

    @Getter
    private String username;

    private String password;

    public String getPassword(){
        return new StringBuilder(password)
                .replace(0,2, DOUBLE_ASTERISK)
                .replace(password.length() - 2, password.length(), DOUBLE_ASTERISK)
                .toString();
    }

    public static CreatedUserDTO getInstanceWith(String username, String password){
        final var newInstance = new CreatedUserDTO();
        newInstance.setUsername(username);
        newInstance.setPassword(password);
        return newInstance;
    }

}
