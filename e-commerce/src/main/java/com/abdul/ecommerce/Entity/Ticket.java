package com.abdul.ecommerce.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ticket_id;

    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
