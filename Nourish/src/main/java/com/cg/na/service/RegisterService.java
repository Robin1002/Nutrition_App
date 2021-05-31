package com.cg.na.service;

import java.util.List;


import com.cg.na.entities.Register;

public interface RegisterService {

	public Register saveUser(Register user);
	public Register fetchUserByEmailId(String email);
	public List<Register> getAllUser();
	public Register fetchUserByEmailIdAndPassword(String email, String password);
	
}
