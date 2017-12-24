package com.playJs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.playJs.model.User;

@RestController
@RequestMapping("/api/")
public class PlayJsController {

	@RequestMapping(value="user", method= RequestMethod.GET)
	public List<User> list(){
		return UsersStub.list();
	}
}
