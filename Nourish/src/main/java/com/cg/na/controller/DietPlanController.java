package com.cg.na.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.na.entities.DietPlan;
import com.cg.na.service.DietPlanService;

@RestController
public class DietPlanController {

	@Autowired
	private DietPlanService dietplanService;
		
	@RequestMapping(value="/user/getall", method=RequestMethod.GET)
	public List<DietPlan> listAllPlans() {
		return dietplanService.listAllPlans();
	}
	
	@RequestMapping(value= "/user/createDietPlan", method= RequestMethod.POST)
	public DietPlan createDietPlan(@RequestBody DietPlan newDietPlan) {       
	        return dietplanService.createDietPlan(newDietPlan);
	}
	
	@RequestMapping(value= "/user/changeDietPlan/{id}", method= RequestMethod.PUT)
    public DietPlan changeDietPlan(@RequestBody DietPlan updatePlan, @PathVariable int id) {
		 Optional <DietPlan> plan =  dietplanService.getDietPlan(id);
        if (!plan.isPresent()) {
                     System.out.println("Could not find user with id - " + id);
                     return new DietPlan();
        }
        else  {
        			 updatePlan.setId(id);
                     return dietplanService.changeDietPlan(updatePlan);
        }
	}
	
	@RequestMapping(value= "/user/removeDietPlan/{id}", method= RequestMethod.DELETE)
	public void removeDietPlan(@PathVariable int id) {

		 Optional <DietPlan> plan =  dietplanService.getDietPlan(id);
	        if(!plan.isPresent())
	                System.out.println("Could not find user with id - " + id);
	        else   
	        	dietplanService.removeDietPlan(id);
	}
	
}
