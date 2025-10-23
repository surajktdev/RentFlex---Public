package com.rentflex.paymentservice.repository;

import com.rentflex.paymentservice.model.Refund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefundRepository extends JpaRepository<Refund, Long> {
    Optional<Refund> findByTransactionId(String transactionId);

}
