package com.cg.na.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.na.entities.Payment;

@Repository
public interface PaymentsRepository extends JpaRepository<Payment, Integer> {

	public Optional<Payment> findById(Long id);
}
