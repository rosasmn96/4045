package com.rosasmnit4045001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RosasMnIT4045001Controller {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
}