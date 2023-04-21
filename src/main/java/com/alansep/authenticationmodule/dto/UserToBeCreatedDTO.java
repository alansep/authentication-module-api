package com.alansep.authenticationmodule.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserToBeCreatedDTO {

    @NotBlank
    @Size(min = 6, max = 20)
    @Pattern(regexp = "[a-zA-Z0-9_]+")
    private String username;

    @NotBlank
    @Size(min = 4, max = 45)
    @Pattern(regexp = "[a-zA-Z0-9_]+")
    private String password;

}
