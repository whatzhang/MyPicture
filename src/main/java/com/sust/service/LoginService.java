package com.sust.service;

public interface LoginService {

	boolean judge(String name);
	int reg(String name);
	int getId(String name);
}
