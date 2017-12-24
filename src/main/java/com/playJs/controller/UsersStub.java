package com.playJs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.playJs.model.User;

public class UsersStub {
	private static Map<Long, User> users = new HashMap<Long, User>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		User a = new User(1, "abc", "abc@io.com", "abc");
		users.put(1L, a);
		User b = new User(2, "def", "def@io.com", "def");
		users.put(2L, b);
		User c = new User(3, "xyz", "xyz@io.com", "xyz");
		users.put(3L, c);
	}

	public static List<User> list() {
		return new ArrayList<User>(users.values());
	}
}
