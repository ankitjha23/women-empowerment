package com.wipro.womenempowerment.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.wipro.womenempowerment.model.Trainee;
import com.wipro.womenempowerment.restrepository.TraineeRepository;

@RestController
@RequestMapping("/women-empowerment")
@CrossOrigin(origins="http://localhost:4200")
public class TraineeController {
	
	@Autowired
	public TraineeRepository trepo;
	
	@PostMapping("/trainee")
	public Trainee createTrainee(@Validated @RequestBody Trainee trainee) {

		Trainee t = new Trainee();
		
		t.setTraineeName(trainee.getTraineeName());
		t.setTraineeField(trainee.getTraineeField());
		t.setTraineeExperience(trainee.getTraineeExperience());
		t.setTraineeNumber(trainee.getTraineeNumber());
		
		trepo.save(t);
		return trainee;
	}
	
	@DeleteMapping("/deleteTrainee/{id}")
    public Boolean deleteTrainee(@PathVariable("id") int id) {
		trepo.deleteById(id);
        return true;      
    }
	
	@PutMapping("/trainee/{id}")
	public ResponseEntity<Trainee> updateTrainee(@PathVariable(value = "id") int tId, @Validated @RequestBody Trainee t) {

		Trainee trainee = trepo.findById(tId);
		
		trainee.setTraineeExperience(t.getTraineeExperience());
		trainee.setTraineeField(t.getTraineeField());
		trainee.setTraineeName(t.getTraineeName());
		trainee.setTraineeNumber(t.getTraineeNumber());
	
		final Trainee updatedTrainee = trepo.save(trainee);
		return ResponseEntity.ok(updatedTrainee);
	}

}
