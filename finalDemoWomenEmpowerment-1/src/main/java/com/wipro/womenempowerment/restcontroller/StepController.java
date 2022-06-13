package com.wipro.womenempowerment.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.womenempowerment.model.Step;
import com.wipro.womenempowerment.restrepository.StepRepository;

@RestController
@RequestMapping("/women-empowerment")
@CrossOrigin(origins="http://localhost:4200")
public class StepController {
	
	@Autowired
	public StepRepository srepo;

	@PostMapping("/step")
	public Step createStep(@Validated @RequestBody Step step) {

		Step s = new Step();

		s.setfName(s.getfName());
		s.setlName(s.getlName());
		s.setFatherName(s.getFatherName());
		s.setMotherName(s.getMotherName());
		s.setPhoneNumber(s.getPhoneNumber());
		s.setAdharcardNumber(s.getAdharcardNumber());
		s.setTrainingCourse(s.getTrainingCourse());

		srepo.save(s);
		return step;
	}

	@DeleteMapping("/deleteStep/{id}")
	public Boolean deleteStep(@PathVariable("id") int id) {
		srepo.deleteById(id);
		return true;
	}

	@PutMapping("/step/{id}")
	public ResponseEntity<Step> updateStep(@PathVariable(value = "id") int sId, @Validated @RequestBody Step s) {

		Step step = srepo.findById(sId);
		
		step.setAdharcardNumber(s.getAdharcardNumber());
		step.setFatherName(s.getFatherName());
		step.setfName(s.getfName());
		step.setlName(s.getlName());
		step.setMotherName(s.getMotherName());
		step.setPhoneNumber(s.getPhoneNumber());
		step.setTrainingCourse(s.getTrainingCourse());
		
		final Step updatedStep = srepo.save(step);
		return ResponseEntity.ok(updatedStep);
	}

}
