package com.wipro.womenempowerment.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.wipro.womenempowerment.model.Ngo;
import com.wipro.womenempowerment.restrepository.NgoRepository;

@RestController
@RequestMapping("/women-empowerment")
@CrossOrigin(origins="http://localhost:4200")
public class NgoController {

	@Autowired
	public NgoRepository nrepo;

	@PostMapping("/ngo")
	public Ngo createNgo(@Validated @RequestBody Ngo ngo) {

		Ngo n = new Ngo();

		n.setOrganisationName(ngo.getOrganisationName());
		n.setRegisteredNumber(ngo.getRegisteredNumber());
		n.setInchargeName(ngo.getInchargeName());
		n.setAdharcardNumber(ngo.getAdharcardNumber());
		n.setCity(ngo.getCity());
		n.setPincode(ngo.getPincode());

		nrepo.save(n);
		return ngo;
	}

	@DeleteMapping("/deleteNgo/{id}")
	public Boolean deleteNgo(@PathVariable("id") int id) {
		nrepo.deleteById(id);
		return true;
	}

	@PutMapping("/ngo/{id}")
	public ResponseEntity<Ngo> updateNgo(@PathVariable(value = "id") int nId, @Validated @RequestBody Ngo n) {

		Ngo ngo = nrepo.findById(nId);
		
		ngo.setAdharcardNumber(n.getAdharcardNumber());
		ngo.setCity(n.getCity());
		ngo.setInchargeName(n.getInchargeName());
		ngo.setOrganisationName(n.getOrganisationName());
		ngo.setPincode(n.getPincode());
		ngo.setRegisteredNumber(n.getRegisteredNumber());
	
		final Ngo updatedNgo = nrepo.save(ngo);
		return ResponseEntity.ok(updatedNgo);
	}

}
