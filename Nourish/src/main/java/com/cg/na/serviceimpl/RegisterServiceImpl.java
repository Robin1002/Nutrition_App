package com.cg.na.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.na.entities.Register;
import com.cg.na.repository.RegisterRepository;
import com.cg.na.service.RegisterService;



@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterRepository regRepo;
	
	@Override
	public Register saveUser(Register user) {
		// TODO Auto-generated method stub
		return regRepo.save(user);
	}

	@Override
	public Register fetchUserByEmailId(String email) {
		// TODO Auto-generated method stub
		Optional<Register> register =  regRepo.findById(email);
        if(!register.isPresent()) {
            return new Register();
        }
       // regRepo.delete(register.get());
        return register.get();
    }
	

	@Override
	public List<Register> getAllUser() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public Register fetchUserByEmailIdAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		Optional<Register> register = regRepo.findById(email);
        if(!register.isPresent()) {
            return new Register();
        }
       // regRepo.delete(register.get());
        return register.get();
	}

}
