package com.guoyasoft;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class One extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =req.getParameter("login");
		String password = req.getParameter("password");
		System.out.println(name+":"+password);
		resp.getWriter().write("get sucess");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String name =req.getParameter("login");
		String password = req.getParameter("password");
		System.out.println(name+":"+password);
		resp.getWriter().write("post sucess");
	}

}