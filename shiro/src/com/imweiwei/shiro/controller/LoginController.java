package com.imweiwei.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/index")
public class LoginController {

	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,@RequestParam("password") String password) {
		Subject currentUser=SecurityUtils.getSubject();
		if(!currentUser.isAuthenticated()) {
			UsernamePasswordToken token=new UsernamePasswordToken(username, password);
			//token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				// TODO: handle exception
				System.out.println("µÇÂ¼Ê§°Ü£º"+e.getMessage());
			}
		}
		return "redirect:/success.jsp";
	}
}
