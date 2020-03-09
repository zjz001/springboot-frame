package com.tdvehicle.website.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: website
 * @description: 全局异常处理
 * @author: zjz
 * @create: 2020-03-06 13:28
 **/
@ControllerAdvice
public class GlobaExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ModelAndView globaExceptionHandler(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		int code = response.getStatus();
		if (code == 404 || code == 401 || code == 403) {
			mv.setViewName("forward:/404.html");
		}
		mv.setViewName("forward:/error.html");
		return mv;
	}

}
