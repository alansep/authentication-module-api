package com.alansep.authenticationmodule.model;

import com.alansep.authenticationmodule.dto.CreatedUserDTO;
import com.alansep.authenticationmodule.dto.UserToBeCreatedDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @NotNull
    private String id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    public static User from(UserToBeCreatedDTO userToBeCreatedDTO) {
        final var user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setUsername(userToBeCreatedDTO.getUsername());
        user.setPassword(userToBeCreatedDTO.getPassword());
        return user;
    }

    public CreatedUserDTO toCreatedUserDTO() {
        return CreatedUserDTO.getInstanceWith(username, password);
    }

}
