package com.example.testing1.repository;

import com.example.testing1.model.TicketHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketHistoryRepository extends JpaRepository<TicketHistory, Integer> {

    // Поиск списка записей истории по идентификатору билета
    List<TicketHistory> findByTicketId(int ticketId);
}
