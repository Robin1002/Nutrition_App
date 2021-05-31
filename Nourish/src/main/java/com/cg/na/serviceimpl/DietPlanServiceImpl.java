package com.cg.na.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.na.entities.DietPlan;
import com.cg.na.repository.DietPlanRepository;
import com.cg.na.service.DietPlanService;

@Service
public class DietPlanServiceImpl implements DietPlanService{

	@Autowired
	private DietPlanRepository dietplanDao;
	@Override
	public DietPlan createDietPlan(DietPlan dietplan) {
		// TODO Auto-generated method stub
		return dietplanDao.save(dietplan);
	}

	@Override
	public DietPlan changeDietPlan(DietPlan dietplan) {
		// TODO Auto-generated method stub
		return dietplanDao.save(dietplan);
	}

	@Override
	public void removeDietPlan(int id) {
		// TODO Auto-generated method stub
		dietplanDao.deleteById(id);
	}

	@Override
	public List<DietPlan> listAllPlans() {
		// TODO Auto-generated method stub
		return dietplanDao.findAll();
	}

	@Override
	public Optional<DietPlan> getDietPlan(int id) {
		// TODO Auto-generated method stub
		return dietplanDao.findById(id);
	}

}
