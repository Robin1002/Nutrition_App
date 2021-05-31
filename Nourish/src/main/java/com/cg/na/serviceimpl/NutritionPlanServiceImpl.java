package com.cg.na.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.na.entities.NutritionPlan;
import com.cg.na.repository.NutritionPlanRepository;
import com.cg.na.service.NutritionPlanService;

@Service
public class NutritionPlanServiceImpl implements NutritionPlanService {

	@Autowired
	private NutritionPlanRepository nutritionplanrepo;
	
	@Override
	public NutritionPlan save(NutritionPlan nutritionPlan) {
		// TODO Auto-generated method stub
		return nutritionplanrepo.save(nutritionPlan);
	}

	@Override
	public List<NutritionPlan> findAll() {
		// TODO Auto-generated method stub
		return nutritionplanrepo.findAll();
	}

	@Override
	public Optional<NutritionPlan> getById(int id) {
		// TODO Auto-generated method stub
		return nutritionplanrepo.findById(id);
	}

	@Override
	public NutritionPlan update(NutritionPlan nutritionPlan) {
		// TODO Auto-generated method stub
		return nutritionplanrepo.save(nutritionPlan);
	}

	@Override
	public void delete(int id) {
		nutritionplanrepo.deleteById(id);
		
	}

}
