package com.abdul.ecommerce.Repository;

import com.abdul.ecommerce.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, Long> {
}
