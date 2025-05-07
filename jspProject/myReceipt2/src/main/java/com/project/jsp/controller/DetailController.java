package com.project.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.project.jsp.model.domain.Comment;
import com.project.jsp.model.domain.Post;
import com.project.jsp.model.service.BoardService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DetailController extends HttpServlet{
	BoardService boardService = new BoardService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int postId = Integer.parseInt(req.getParameter("id"));
		Post post = boardService.getPost(postId);
		List<Comment> commentList = boardService.getCommentsByPostId(postId);
		
		req.setAttribute("post", post);
		req.setAttribute("commentList", commentList);
		req.getRequestDispatcher("WEB-INF/views/boardDetail.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int postId = Integer.parseInt(req.getParameter("id"));
		
		boolean result = boardService.deletePost(postId);
		
	    resp.setContentType("application/json");
	    resp.setCharacterEncoding("UTF-8");

	    PrintWriter out = resp.getWriter();
	    if (result) {
	        out.write("{\"status\":\"success\"}");
	    } else {
	        out.write("{\"status\":\"fail\"}");
	    }
	    out.flush();
	}
}
