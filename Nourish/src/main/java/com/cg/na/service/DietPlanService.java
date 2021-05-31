package com.cg.na.service;

import java.util.List;
import java.util.Optional;

import com.cg.na.entities.DietPlan;


public interface DietPlanService {

	public DietPlan createDietPlan(DietPlan dietplan);
	public DietPlan changeDietPlan(DietPlan dietplan);
	public void removeDietPlan(int id);
	public List<DietPlan> listAllPlans();
	public Optional <DietPlan> getDietPlan(int id);
}


