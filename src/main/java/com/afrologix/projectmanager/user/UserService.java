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

	public List<UserModel> findAll() {
		return userRepository.findAll();
	}

	public UserModel createNewUser(UserModel userModel) {
		return userRepository.save(userModel);
	}

	public Optional<UserModel> findUser(Long id) {
		return userRepository.findById(id);
	}

	public Optional<UserModel> deleteUser(Long id) {
		Optional<UserModel> userModel = userRepository.findById(id);
		userRepository.deleteById(id);
		return userModel;
	}
}