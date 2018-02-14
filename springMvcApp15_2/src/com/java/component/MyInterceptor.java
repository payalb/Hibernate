package com.java.component;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		/*
		 * When user requests for a web-page on this application, 
		 * if true then only request will be further handled/ processed.
		 */
		Calendar cal= Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if(dayOfWeek == 1){
			/*
			 * 1: sunday, 2: Monday, 3: Tue....
			 */
			response.getWriter().write("Website is closed for Maintenance!!");
			return false;
		}
		/*response.getWriter().write("Website active !!");*/
		return true;
	}
	
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("From postHandle***********");
		System.out.println(request.getRequestURI().toString());
	}
	
	@Override
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("From afterCompletion***********");
		System.out.println(request.getRequestURI().toString());
	
	}
}
