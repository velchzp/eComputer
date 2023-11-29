package com.example.eComputer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPartDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Date birthday;
}
