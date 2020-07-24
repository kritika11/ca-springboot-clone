package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private int deptId;
    private String name;
    private String phone;
    private String email;
    private String username;
    private String password;

}
