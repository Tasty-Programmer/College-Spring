package edu.dl.project01.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    String address;
    int zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
