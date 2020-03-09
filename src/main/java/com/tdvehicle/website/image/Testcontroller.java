package com.tdvehicle.website.image;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: website
 * @description: cesjo
 * @author: zjz
 * @create: 2020-03-06 13:43
 **/
@Controller
public class Testcontroller {
	@RequestMapping("/test")
	public String test() {
		int i = 1 / 0;

		return "404.html";
	}
}
