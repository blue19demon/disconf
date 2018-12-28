package com.tgb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	private UserService userService;
	@RequestMapping("/query")
	@ResponseBody
	public List<User> test() {
		return userService.queryAll();
	}
}
