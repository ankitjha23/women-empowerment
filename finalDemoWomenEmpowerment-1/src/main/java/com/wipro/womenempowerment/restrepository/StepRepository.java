package com.wipro.womenempowerment.restrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.womenempowerment.model.Ngo;
import com.wipro.womenempowerment.model.Step;

public interface StepRepository extends JpaRepository<Step, Integer> {
	
	Step findById(int sId);
}
