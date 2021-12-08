package com.example.WebApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.WebApplication.abc.UserDe;

@Controller
public class ControllerApp 
{
	
	@Autowired
	UserDe ud;
	
	
	@RequestMapping("/form")
	public String register()
	{
		return "registration";
	}
	
	@RequestMapping("/details")
	public String info(DetailsCapture dc)
	{
		ud.save(dc);
		return "detials";
	}
}
