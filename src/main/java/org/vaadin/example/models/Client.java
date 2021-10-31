package org.vaadin.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cityId")
    City city;
    @Column(name = "address")
    String address;
    @Column(name = "phone")
    String phone;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "modelId")
    Model model;

    public Client(String name, City city, String address, String phone, Model model) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.model = model;
    }


}
