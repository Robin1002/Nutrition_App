package com.cg.na.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.na.entities.Register;
import com.cg.na.service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	private RegisterService service;

	@GetMapping("/user/ByEmail/{email}")
	public Register showUser(@PathVariable(value="email") String emailId) throws Exception {
		Register user=service.fetchUserByEmailId(emailId);
		return user;
	}
	@GetMapping("/user/getAll")
	public List<Register> getAllUser(){
		return service.getAllUser();
	}

	@PostMapping("/registeruser")
	public Register registerUser(@RequestBody Register user) throws Exception {
		String tempEmailId=user.getEmailId();
		if(tempEmailId!=null && "".equals(tempEmailId)) {
			Register userObj = service.fetchUserByEmailId(tempEmailId);
			if(userObj !=null) {
				throw new Exception("User with"+tempEmailId+ "this Id is already Present");
			}
		}
		Register userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}

	@PostMapping("/login")
	public Register loginUser(@RequestBody Register user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPass=user.getPassword();
		Register userObj=null;
		if(tempEmailId !=null && tempPass !=null) {
			userObj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);

		}
		if(userObj==null) {
			throw new Exception("User doesn't Exit or Bad credentials");
		}
		return userObj;
	}

}
