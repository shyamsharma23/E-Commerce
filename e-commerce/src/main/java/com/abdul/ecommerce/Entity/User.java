package com.abdul.ecommerce.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private  String username;

    @Column
    private String password;

    @JoinColumn(name = "role_id")
    @ManyToOne
    private Role role;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Ticket> ticketList;
}
