package com.cg.na.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.na.entities.DietPlan;

@Repository
public interface DietPlanRepository extends JpaRepository<DietPlan, Integer>{

}
