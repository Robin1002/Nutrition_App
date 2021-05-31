package com.cg.na.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.na.entities.WeightLog;

@Repository
public interface WeightLogRepository extends JpaRepository<WeightLog, Integer> {

}
