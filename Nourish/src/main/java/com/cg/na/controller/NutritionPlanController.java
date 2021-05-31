package com.cg.na.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.na.entities.NutritionPlan;
import com.cg.na.serviceimpl.NutritionPlanServiceImpl;

@RestController
public class NutritionPlanController {

	@Autowired
	NutritionPlanServiceImpl nutritionplanservice;
	
	@PostMapping(value="admin/save")
	public NutritionPlan saveNutritionPlan(@RequestBody NutritionPlan nutrition) {
		return nutritionplanservice.save(nutrition);
	}
	
	@GetMapping(value="view/nutritionplan")
	public List<NutritionPlan> getAllNutritionPlan(){
		return nutritionplanservice.findAll();
	}
	
	@GetMapping(value="view/{id}")
	public Optional<NutritionPlan> getNutritionPlanById(@PathVariable int id) {
		return nutritionplanservice.getById(id);
	}
	
	@PutMapping(value="update/{id}")
	public NutritionPlan updateNutritionPlan(@RequestBody NutritionPlan nutrition,@PathVariable int id ) {
		
		Optional<NutritionPlan> nutri=nutritionplanservice.getById(id);
		
		if(!nutri.isPresent()) {
			System.out.println("This Nutrition Plan with "+id+" id is not available");
			return new NutritionPlan();
		}
		else {
			nutrition.setId(id);
			return nutritionplanservice.update(nutrition);
		}
	}
	
	@DeleteMapping(value="delete/{id}")
	public void deleteById(@PathVariable int id) {
		nutritionplanservice.delete(id);
	}

}
