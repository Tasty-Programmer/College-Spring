package edu.dl.project01.domain.item;

import edu.dl.project01.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class Notebook extends Item {
    String manufacturer;
    String serialNumber;
}