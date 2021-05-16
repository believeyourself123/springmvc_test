package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/test")
@Controller
public class SecondController {
	
	@RequestMapping("/aa")
	public String handleRequest(Model model)
	{
		model.addAttribute("msg", "第二个Spring MVC程序");
		return "first";
	}
	
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,HttpSession session,Model model)
	{
		model.addAttribute("msg", "第二个Spring MVC程序");
		session.setAttribute("name", request.getParameter("name"));
		return "forward:list";
	}
	
	@RequestMapping("/list")
	public String list(Model model)
	{
		return "list";
	}
	
	@RequestMapping("/default")
	public String test(@RequestParam(value = "u_id")Integer id) {     //解决前后台参数名称不一致
		System.out.println(id);
		return "first";
	}
	
	
	
}
