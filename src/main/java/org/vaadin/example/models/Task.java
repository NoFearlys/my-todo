package org.vaadin.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "clientId")
    Client client;
    int quantity;
    String trackNumber;
    String trackNumberOut;
    @Enumerated(EnumType.STRING)
    Status status;

    public Task(Client client, int quantity, String trackNumber, String trackNumberOut, Status status) {
        this.client = client;
        this.quantity = quantity;
        this.trackNumber = trackNumber;
        this.trackNumberOut = trackNumberOut;
        this.status = status;
    }


}