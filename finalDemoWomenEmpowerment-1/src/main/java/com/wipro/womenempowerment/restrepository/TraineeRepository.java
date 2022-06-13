package com.wipro.womenempowerment.restrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.womenempowerment.model.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Integer> {
	
	Trainee findById(int tId);

}
