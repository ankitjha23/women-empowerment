package com.wipro.womenempowerment.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.womenempowerment.model.User;
import com.wipro.womenempowerment.restrepository.UserRepository;

@RestController
@RequestMapping("/women-empowerment")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserRepository urepo;

	@PostMapping("/user")
	public User createUser(@Validated @RequestBody User user) {

		User u = new User();
		u.setUsername(user.getUsername());
		u.setEmail(user.getEmail());
		u.setDob(user.getDob());
		u.setPassword(user.getPassword());
		u.setNumber(user.getNumber());

		urepo.save(u);
		return user;
	}

	@PostMapping("/users")
	public Boolean loginUser(@Validated @RequestBody User user) {
		Boolean a = false;
		String email = user.getEmail();
		String password = user.getPassword();

		User u = urepo.findByEmail(email);

		if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
			a = true;

		}
		return a;
	}
	
	@PostMapping("/admin")
	public Boolean loginAdmin(@Validated @RequestBody User user) {
		Boolean b = false;
		String email = user.getEmail();
		String password = user.getPassword();
		//User d = urepo.findByEmail(email);

		if (email.equals("ankitjha526@gmail.com") && password.equals("9871424292")) {
			b = true;
		}
		return b;
	}
	
	@DeleteMapping("/deleteUser/{id}")
    public Boolean deleteUser(@PathVariable("id") int id) {
		urepo.deleteById(id);
        return true;      
    }

}
