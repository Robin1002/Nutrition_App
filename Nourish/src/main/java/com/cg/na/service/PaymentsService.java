package com.cg.na.service;

import java.util.List;
import java.util.Optional;

import com.cg.na.entities.Payment;

/**
 * This is a service class to provide CRUD operation
 * @author 
 *
 */
public interface PaymentsService {
	public void addPayments(Payment payments);
	public List<Payment> listPayments();
	public Optional<Payment> findPaymentsById(Long id);
	public Payment update(Payment payments);

}
