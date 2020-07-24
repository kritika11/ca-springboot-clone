package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consultant {

    private int id;
    private String name;
    private String phone;
    private String email;
    private String city;
    private int recruiterId;
    private int marketerId;
    private int technology;
}
