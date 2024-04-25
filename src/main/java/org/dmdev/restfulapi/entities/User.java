package org.dmdev.restfulapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private UUID id;

    private String email;

    private String firstname;

    private String lastname;

    private LocalDate birthdate;

    private String addres;

    private String phoneNumber;
}
