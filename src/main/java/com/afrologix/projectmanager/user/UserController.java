package com.afrologix.projectmanager.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
/**
 * UserController
 */
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<UserModel> findAllCompanies() {
		return userService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UserModel create(@RequestBody UserModel userModel) {
		return userService.createNewUser(userModel);
	}

	@GetMapping("/{id}")
	public Optional<UserModel> findOne(@PathVariable Long id) {
		return userService.findUser(id);
	}

	@DeleteMapping("/{id}")
	public Optional<UserModel> delete(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

}