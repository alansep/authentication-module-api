package com.alansep.authenticationmodule.model;

import com.alansep.authenticationmodule.dto.CreatedUserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.units.qual.C;

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

    public CreatedUserDTO toCreatedUserDTO(){
        return new CreatedUserDTO(username);
    }


}
