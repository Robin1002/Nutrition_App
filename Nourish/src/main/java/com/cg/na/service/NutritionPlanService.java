package com.cg.na.service;

import java.util.List;
import java.util.Optional;

import com.cg.na.entities.NutritionPlan;

/**
 * This interface is used for providing services
 * @author 
 *
 */

public interface NutritionPlanService {
	public NutritionPlan save(NutritionPlan nutritionPlan);
	public List<NutritionPlan> findAll();
	public Optional<NutritionPlan> getById(int id);
	public NutritionPlan update(NutritionPlan nutritionPlan);
	public void delete(int id);
	
}
