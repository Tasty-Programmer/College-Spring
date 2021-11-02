package edu.dl.project01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Human {
    @Id @GeneratedValue
    private Long id;
    private String name;
}
