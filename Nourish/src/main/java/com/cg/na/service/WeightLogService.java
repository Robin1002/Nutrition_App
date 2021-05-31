package com.cg.na.service;

import java.util.List;
import java.util.Optional;

import com.cg.na.entities.WeightLog;


public interface WeightLogService {
	public WeightLog addWeightLog (WeightLog weightlog);
	public Optional<WeightLog> getWeightLog (int id);
	public WeightLog updateWeightLog (WeightLog weightlog);
	public void removeWeightLog (int weightlog);
	public List <WeightLog> showAllWeightLog();
}
