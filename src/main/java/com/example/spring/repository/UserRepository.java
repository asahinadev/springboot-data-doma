package com.example.spring.repository;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.spring.entity.User;

@Dao
@ConfigAutowireable
public interface UserRepository {

	@Select
	public Optional<User> findByUsername(String username);

	@Select
	public Optional<User> findByEmail(String email);

	@Select
	public Optional<User> findById(String id);

	@Select
	public List<User> findAll();

	@Insert
	public int insert(User entity);

	@Update
	public int update(User entity);

	@Delete
	public int delete(User entity);

}
