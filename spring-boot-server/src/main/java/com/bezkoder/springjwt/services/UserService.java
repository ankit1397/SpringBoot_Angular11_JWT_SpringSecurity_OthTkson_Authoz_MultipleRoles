package com.bezkoder.springjwt.services;

import java.util.Optional;

import com.bezkoder.springjwt.models.User;

public interface UserService {
	public Optional<User> findByUsername(String username);
	public Boolean existsByUsername(String username);
	public Boolean existsByEmail(String email);
	public void save(User user);
}
