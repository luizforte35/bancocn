package com.example.bancocn.domain.transaction;


import com.example.bancocn.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="transacions")
@Table(name="transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name="sander_id")
    private User sander;
    @ManyToOne
    @JoinColumn(name="reciver_id")
    private User reciver;
    private LocalDateTime timestamp;


    public transaction() {

    }
}
