package edu.dl.project01.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class PC extends Item{
    String manufacturer;
    String serialNumber;
}
