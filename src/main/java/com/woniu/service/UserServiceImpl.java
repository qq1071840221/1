package com.woniu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UsersMapper;
import com.woniuxy.domain.Users;

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	@Autowired
	private UsersMapper mapper;

	@Override
	public void save(Users users) {
		mapper.insert(users);
		
	}

	@Override
	public void delete(Users users) {
		mapper.deleteByPrimaryKey(users.getId());
		
	}

	@Override
	public void update(Users users) {
		mapper.updateByPrimaryKey(users);
		
	}

	@Override
	public List<Users> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public Users findById(Integer id) {		
		return mapper.selectByPrimaryKey(id);
	}

	

}
