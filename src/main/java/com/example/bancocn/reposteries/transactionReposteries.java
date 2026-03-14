package com.example.bancocn.reposteries;

import com.example.bancocn.domain.transaction.transaction;
import org.springframework.data.jpa.repository.JpaRepository;;

public interface transactionReposteries extends JpaRepository<transaction, Long> {
}
