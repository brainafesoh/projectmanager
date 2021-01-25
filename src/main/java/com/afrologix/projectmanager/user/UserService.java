package com.afrologix.projectmanager.user;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User createNewUser(User user) {
		return userRepository.save(user);
	}

	public Optional<User> findUser(Long id) {
		return userRepository.findById(id);
	}

	public Optional<User> deleteUser(Long id) {
		Optional<User> user = userRepository.findById(id);
		userRepository.deleteById(id);
		return user;
	}
}