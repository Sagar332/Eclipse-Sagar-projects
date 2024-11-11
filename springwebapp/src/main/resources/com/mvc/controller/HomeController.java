package com.mvc.controller;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		public String home()
		{
			System.out.println("this is front page");
			return "index";
		}
	}

}
