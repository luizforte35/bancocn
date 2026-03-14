package com.example.bancocn.domain.user;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    @Column(unique=true)
    private String documento;
    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private userType userType;

    public User() {

    }
}
