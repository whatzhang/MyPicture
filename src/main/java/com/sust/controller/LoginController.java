package com.sust.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sust.entity.AllInfo;
import com.sust.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static final Log logger = LogFactory.getLog(LoginController.class);
	@Resource
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(@RequestParam("user_name") String name,HttpServletRequest request,HttpSession session,
			HttpServletResponse response) {

		logger.info("login++" + name);
		if(loginService.judge(name)){
			session.setAttribute("login", name);
			session.setAttribute("UsId", loginService.getId(name));
			try {
				request.getRequestDispatcher("/picture/initData").forward(request, response);
			} catch (ServletException | IOException e) {
				logger.error("login_error");
			}
		}else{
			session.setAttribute("login", "");
			try {
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				logger.error("login_error");
			}
		}
	}
	
	@RequestMapping(value = "/reg",method = RequestMethod.POST)
	@ResponseBody
	public AllInfo reg(@RequestParam("user_name") String name,HttpSession session) {

		logger.info("reg++" + name);
		session.setAttribute("UsId", loginService.reg(name));
		return new AllInfo("success");
	}
	
	@RequestMapping(value = "/layout",method = RequestMethod.POST)
	@ResponseBody
	public String layout(HttpSession session) {

		logger.info("layout!");
		session.invalidate();
		return "YES";
	}
}
