package com.project.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //HttpServlet 상속 대신
public class IndexController{
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String path = req.getServletPath(); // 요청 URL 패턴을 얻음
//
//        if ("/index".equals(path)) {
//        	req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req, resp);
//        } else if ("/intro".equals(path)) {
//        	req.getRequestDispatcher("/WEB-INF/view/intro.jsp").forward(req, resp);
//        } else {
//        	((HttpServletResponse) req).sendError(HttpServletResponse.SC_NOT_FOUND);
//        }
//	}
	@RequestMapping("/") //url 요청
	public String showIndex() {
		return "index"; //jsp 파일명 반환
	}
	
	@RequestMapping("/intro")
	public String showIntro() {
		return "intro"; 
	}
}
