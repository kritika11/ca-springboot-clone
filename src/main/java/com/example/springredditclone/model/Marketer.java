package com.example.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Marketer extends User{

    private int totalOffer;
    private List<Consultant> consultantList = new ArrayList<Consultant>();

}
