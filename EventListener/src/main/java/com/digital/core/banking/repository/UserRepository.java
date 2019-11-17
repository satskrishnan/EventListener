package com.digital.core.banking.repository;

import org.springframework.stereotype.Repository;

import com.digital.core.banking.model.User;

@Repository
public class UserRepository extends HashMapRepository<User, String> {

	@Override
	<S extends User> String getEntityId(S user) {
		return user.getUsername();
	}
}
