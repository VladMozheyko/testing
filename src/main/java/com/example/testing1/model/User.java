package com.example.testing1.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "user",  cascade = CascadeType.REMOVE)
    private List<Ticket> tickets;
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<TicketHistory> ticketHistory;

    public User() {
        tickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Ticket ticket) {
        tickets.add(ticket);
    }
}
