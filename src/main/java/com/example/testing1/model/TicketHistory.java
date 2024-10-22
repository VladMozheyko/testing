package com.example.testing1.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tickethistory")

public class TicketHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date date;
    @ManyToOne
    private Ticket ticket;
    @ManyToOne
    private User user;
    private String changeType;     // Я имею в виду, что можно создать билет, забронировать, купить и вернуть. TODO Что мне помешает написать, что я этот билет родил? Ограничить мои действия


    public TicketHistory() {
        date = new Date();
    }

    public com.example.testing1.model.User getUser() {
        return user;
    }

    public void setUser(com.example.testing1.model.User user) {
        user = user;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
