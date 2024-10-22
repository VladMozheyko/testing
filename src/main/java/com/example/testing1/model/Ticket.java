package com.example.testing1.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;                                  // UUID - имеет размер 128 бит
    private int price;
    private String eventTitle;
    @OneToMany(mappedBy = "ticket", cascade = CascadeType.REMOVE)
    private List<TicketHistory> ticketHistory;
    @ManyToOne
    private User user;

    public Ticket() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public List<TicketHistory> getTicketHistory() {
        return ticketHistory;
    }

    public void setTicketHistory(List<TicketHistory> ticketHistory) {
        this.ticketHistory = ticketHistory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
