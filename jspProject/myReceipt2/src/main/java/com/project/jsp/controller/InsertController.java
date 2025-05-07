package com.project.jsp.controller;

import java.io.IOException;

import com.project.jsp.model.service.BoardService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/insert.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		BoardService service = new BoardService();
		int result = service.insert(id, title, content);
		
		if(result>0) {
			resp.sendRedirect("/myReceipt2/detail?id="+result);
		}else {
		    req.setAttribute("errorMessage", "게시글 작성에 실패했습니다. 다시 시도해주세요.");
		    req.getRequestDispatcher("/WEB-INF/views/board.jsp").forward(req, resp);
		}
	}
}
