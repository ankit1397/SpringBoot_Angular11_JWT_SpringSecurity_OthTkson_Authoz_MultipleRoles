package com.bezkoder.springjwt.services;

import java.util.Optional;
import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;

public interface RoleService {
	public Optional<Role> findByName(ERole name);
}
