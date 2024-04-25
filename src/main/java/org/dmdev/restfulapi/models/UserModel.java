package org.dmdev.restfulapi.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserModel {

    private String id;

    private String firstname;

    private String lastname;

    private LocalDate birthdate;

    private String address;

    private String phoneNumber;
}
