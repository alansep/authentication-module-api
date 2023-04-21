package com.alansep.authenticationmodule.dto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CreatedUserDTOTest {

    @CsvSource({"testing,**sti**", "test,****"})
    @ParameterizedTest
    void afterBeingCreated_whenUserPasswordIsReturned_itMustBeObfuscated() {
        final var expectedPassword = "**sti**";
        final var createdUser = CreatedUserDTO.getInstanceWith("","testing");
        assertThat(createdUser.getPassword()).isEqualTo(expectedPassword);
    }

}