package com.woniu.service;

import java.util.List;

import com.woniuxy.domain.Users;

public interface IUserService {
	public void save(Users users);
	public void delete(Users users);
	public void update(Users users);
	public List findAll();
	public Users findById(Integer id);
}
