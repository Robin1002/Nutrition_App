package com.cg.na.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.na.entities.WeightLog;
import com.cg.na.service.WeightLogService;

@RestController
public class WeightLogController {

	@Autowired
	private WeightLogService weightLogService;

	/*@GetMapping("/")
    public String home() {
        return "<h1>Welcome to Weight Log Module</h1>";
    }*/

	@RequestMapping(value="/user/all", method=RequestMethod.GET)
	public List<WeightLog> showAllWeightLog() {
		return weightLogService.showAllWeightLog();
	}

	@RequestMapping(value= "/user/addWeightLog", method= RequestMethod.POST)
	public WeightLog addEmployee(@RequestBody WeightLog newWeightLog) {       
		return weightLogService.addWeightLog(newWeightLog);
	}

	@RequestMapping(value= "/user/updateWeightLog/{id}", method= RequestMethod.PUT)
	public WeightLog updateWeightLog(@RequestBody WeightLog updateLog, @PathVariable int id) {
		Optional <WeightLog> log =  weightLogService.getWeightLog(id);
		if (!log.isPresent()) {
			System.out.println("Could not find user with id - " + id);
			return new WeightLog();
		}
		else  {
			updateLog.setWeight(id);
			return weightLogService.updateWeightLog(updateLog);
		}
	}

	@RequestMapping(value= "/user/deleteWeightLog/{id}", method= RequestMethod.DELETE)
	public void removeWeightLog(@PathVariable int id) {

		Optional <WeightLog> log =  weightLogService.getWeightLog(id);
		if(!log.isPresent())
			System.out.println("Could not find user with id - " + id);
		else   
			weightLogService.removeWeightLog(id);
	}

}
