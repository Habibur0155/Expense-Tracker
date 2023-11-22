package com.racipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"", "/", "/index"})
	public String getIndexPage() {
		System.out.println("Some message to Say... 12342");
		return "index";
	}
	
}
