package com.abdul.ecommerce.Controllers;

import com.abdul.ecommerce.Entity.Ticket;
import com.abdul.ecommerce.Entity.User;
import com.abdul.ecommerce.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/ticket/{user_id}")
    public List<Ticket> getAllTickets(@PathVariable("user_id") long user_id){
        User user = userRepository.findById(user_id).orElseThrow(()->new RuntimeException("user not found"));
        return user.getTicketList();
    }
}
