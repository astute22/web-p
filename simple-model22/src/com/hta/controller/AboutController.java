package com.hta.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Controller;

public class AboutController implements Controller{

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//about.jsp에 표시할 정보를 조회/가공		<-about.do 요청을 처리
		System.out.println("AboutController process 실행중");
		String type = request.getParameter("type");
		System.out.println("문의분야 : " + type);
		if("job".equals(type)){
			request.setAttribute("category", "채용분야 문의");
			List<String> jobs = Arrays.asList("전산 경력직 모집","신입 영업사원 모집");
			request.setAttribute("list", jobs);
		}else if ("project".equals(type)){
			request.setAttribute("category", "프로젝트분야 문의");
			List<String> jobs = Arrays.asList("국방부 하반기 프로젝트","국민은행 공인인증서 폐기 프로젝트");
			request.setAttribute("list", jobs);
		}else if("product".equals(type)){
			request.setAttribute("category", "상품분야 문의");
			List<String> jobs = Arrays.asList("홈쇼핑웹","공단홈페이지");
			request.setAttribute("list", jobs);
		}else if("adv".equals(type)){
			request.setAttribute("category", "광고분야 문의");
			List<String> jobs = Arrays.asList("3개월","6개월");
			request.setAttribute("list", jobs);
		}else if("donate".equals(type)){
			request.setAttribute("category", "후원분야 문의");
			List<String> jobs = Arrays.asList("100만원","1000만원");
			request.setAttribute("list", jobs);
		}else if("etc".equals(type)){
			request.setAttribute("category", "기타분야 문의");
			List<String> jobs = Arrays.asList("이벤트 관련","홈페이지 개편 관련");
			request.setAttribute("list", jobs);
		}
	}
}
