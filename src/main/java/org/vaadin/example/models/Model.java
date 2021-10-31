package org.vaadin.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "models")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String version;
    int price;
    String dataRegister;
    String dataContent;


    public Model(String name, String version, int price, String dataRegister, String dataContent) {
        this.name = name;
        this.version = version;
        this.price = price;
        this.dataRegister = dataRegister;
        this.dataContent = dataContent;
    }

}
