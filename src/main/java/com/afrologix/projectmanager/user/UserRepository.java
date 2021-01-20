package com.afrologix.projectmanager.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<UserModel, Long> {

}