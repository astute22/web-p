package com.hta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Controller;

public class HomeController implements Controller{

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//main.jsp에 표시할 정보를 조회/가공 	<-home.do 요청을 처리
		System.out.println("HomeController process 실행중");
		
		//뷰템플릿에 데이터 전달
		request.setAttribute("message", "리버풀 챔스 우승 기원");
	}
}
