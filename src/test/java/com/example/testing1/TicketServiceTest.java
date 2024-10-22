package com.example.testing1;

import com.example.testing1.model.Ticket;
import com.example.testing1.repository.TicketHistoryRepository;
import com.example.testing1.repository.TicketRepository;
import com.example.testing1.repository.UserRepository;
import com.example.testing1.service.TicketService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class TicketServiceTest {

    @Mock
    TicketRepository ticketRepository;
    @Mock
    UserRepository userRepository;
    @Mock
    TicketHistoryRepository ticketHistoryRepository;
    @InjectMocks
    TicketService ticketService;

    //TODO протестировать добавление параметров

    @Test
    void addHistory(){

    }

    @Test
    void addTicket() {
        Ticket ticket = new Ticket();
       // ticketRepository.save(ticket);


        List<Ticket> tickets = Arrays.asList(ticket);

        when(ticketRepository.findAll()).thenReturn(tickets);

        List<Ticket> result = ticketService.getAllTickets();

        assertEquals(1, result.size());

    }

    @Test
    void bookTicket() {
    }

    @Test
    void getAllTickets() {
    }
}