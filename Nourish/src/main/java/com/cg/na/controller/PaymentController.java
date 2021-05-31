package com.cg.na.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.na.entities.Payment;
import com.cg.na.service.PaymentsService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentsService service;
	
	@RequestMapping (value="/payments/all", method=RequestMethod.GET)
	public List<Payment> getAllPayments(){
		return service.listPayments();	
		}

	@RequestMapping(value= "/payments/add", method= RequestMethod.POST)
	public void addPayments( @RequestBody Payment newPayments) {       
	        service.addPayments(newPayments);
	        
	   }
		
		 @RequestMapping(value= "/payments/update/{id}", method= RequestMethod.PUT)
		public Payment updatePayments(@RequestBody Payment udpPayments, @PathVariable Long id) {
		    Optional<Payment> Payments =  service.findPaymentsById(id);
		    if (!Payments.isPresent()) {
		    System.out.println("Could not find Payment with id - " + id);
		           return new Payment();
		    }
		    else 
		     {
		      udpPayments.setId(id);
		          return service.update(udpPayments);
		    }
		}
}

