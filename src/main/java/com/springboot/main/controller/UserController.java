package com.springboot.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.main.model.Resident;
import com.springboot.main.model.User;
import com.springboot.main.service.ResidentService;
import com.springboot.main.service.UserService;

@RestController

@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private ResidentService residentService;
	@PostMapping("/add")
	public User insert(@RequestBody User user) {
		/* save user with id */
		User newUser = userService.insert(user);
		/*set role as user*/
		user.setRole("USER");
		/*create a new Resident object */
		Resident newResident = new Resident();
		newResident.setName(newUser.getName());
		/*set role as resident*/
		newResident.setRole("RESIDENT");
		/*role is not enabled*/
		newResident.setEnabled(false);
		newResident.setUser(newUser);
		/* save user in table */
		residentService.insert(newResident);
		return userService.insert(user);
	}
}