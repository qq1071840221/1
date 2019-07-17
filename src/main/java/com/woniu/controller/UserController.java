package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.service.IUserService;
import com.woniuxy.domain.Users;

@Controller
@RequestMapping("/admin/users/")
public class UserController {
	@Resource
	private IUserService userServiceImpl;
	
	@RequestMapping("save")
	public String save(Users users) {
		userServiceImpl.save(users);
		return "redirect:findAll";
	}	
	@RequestMapping("update")
	public String update(Users users) {
		userServiceImpl.update(users);
		return "redirect:findAll";
	}
	@RequestMapping("delete")
	public String delete(Users users) {
		userServiceImpl.delete(users);
		return "redirect:findAll";
	}
	@RequestMapping("findAll")
	public String findAll(ModelMap map) {
		List list = userServiceImpl.findAll();
		map.put("list", list);
		return "/admin/userinfo/list";
	}
	@RequestMapping("findById")
	public String findById(Integer uid,ModelMap map) {
		Users users = userServiceImpl.findById(uid);
		map.put("users", users);
		return "forward:goInput";
	}
	

}
