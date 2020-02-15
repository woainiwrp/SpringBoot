package com.wrp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobleException {
	@ExceptionHandler(value= {java.lang.NullPointerException.class})
	public ModelAndView handlerException(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("error",e.toString());
		mv.setViewName("error");
		return mv;
	}
}
