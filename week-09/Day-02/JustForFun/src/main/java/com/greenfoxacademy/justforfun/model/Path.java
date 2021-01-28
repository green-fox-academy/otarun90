package com.greenfoxacademy.justforfun.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Path {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pathId;
    private String path;


}
