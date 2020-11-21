package com.tuto.spring.datajpa.repository.jwt;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuto.spring.datajpa.model.jwt.ERole;
import com.tuto.spring.datajpa.model.jwt.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
