package com.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Controller;

public class HomeController implements Controller{
	
	public String process(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		request.setAttribute("notice", "추석연휴기간동안 놀 것");
		
		return "home.jsp";
	}
}
