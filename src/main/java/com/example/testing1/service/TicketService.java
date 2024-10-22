package com.example.testing1.service;

import com.example.testing1.model.Ticket;
import com.example.testing1.model.TicketHistory;
import com.example.testing1.model.User;
import com.example.testing1.repository.TicketHistoryRepository;
import com.example.testing1.repository.TicketRepository;
import com.example.testing1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    TicketHistoryRepository ticketHistoryRepository;

    public void addTicket(int userId, Ticket ticket){
        User user = userRepository.getById(userId);
        ticket.setUser(user);
        ticketRepository.save(ticket);
    }


    //TODO Прописать логику по бронированию и покупке билета.
    public void bookTicket(int userId, int ticketId){
        User user = userRepository.getById(userId);
        Ticket ticket = ticketRepository.getById(ticketId);
        user.setTickets(ticket);
        ticket.setUser(user);

        TicketHistory ticketHistory = new TicketHistory();
        ticketHistory.setTicket(ticket);
        ticketHistory.setUser(user);
        ticketHistory.setChangeType("Бронирование");
        ticketHistoryRepository.save(ticketHistory);
    }

    // TODO Продумать вывод билетов по какому-то критерию, например, по событие
    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();

    }


}
