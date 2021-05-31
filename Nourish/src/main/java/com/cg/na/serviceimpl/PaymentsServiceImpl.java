package com.cg.na.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.na.entities.Payment;
import com.cg.na.repository.PaymentsRepository;
import com.cg.na.service.PaymentsService;

@Service
public class PaymentsServiceImpl implements PaymentsService{

	@Autowired
	private PaymentsRepository payRepoDao;
	@Override
	public void addPayments(Payment payments) {
		// TODO Auto-generated method stub
        payRepoDao.save(payments);
	}

	@Override
	public List<Payment> listPayments() {
		// TODO Auto-generated method stub
		return payRepoDao.findAll();
	}

	@Override
	public Optional<Payment> findPaymentsById(Long id) {
		// TODO Auto-generated method stub
		return payRepoDao.findById(id);
	}

	@Override
	public Payment update(Payment payments) {
		// TODO Auto-generated method stub
		return payRepoDao.save(payments);
	}
	

}
