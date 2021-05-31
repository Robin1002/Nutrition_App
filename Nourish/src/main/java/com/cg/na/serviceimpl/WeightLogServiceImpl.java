package com.cg.na.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.na.entities.WeightLog;
import com.cg.na.repository.WeightLogRepository;
import com.cg.na.service.WeightLogService;

@Service
public class WeightLogServiceImpl implements WeightLogService{

	@Autowired
	private WeightLogRepository weightlogdao;
	@Override
	public WeightLog addWeightLog(WeightLog weightlog) {
		// TODO Auto-generated method stub
		return weightlogdao.save(weightlog);
	}

	@Override
	public Optional<WeightLog> getWeightLog(int id) {
		// TODO Auto-generated method stub
		return weightlogdao.findById(id);
	}

	@Override
	public WeightLog updateWeightLog(WeightLog weightlog) {
		// TODO Auto-generated method stub
		return weightlogdao.save(weightlog);
	}

	@Override
	public void removeWeightLog(int weightlog) {
		// TODO Auto-generated method stub
		weightlogdao.deleteById(weightlog);
	}

	@Override
	public List<WeightLog> showAllWeightLog() {
		// TODO Auto-generated method stub
		return weightlogdao.findAll();
	}

}
