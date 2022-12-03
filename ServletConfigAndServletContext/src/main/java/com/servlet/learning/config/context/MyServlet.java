package com.servlet.learning.config.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		out.println("Hi ");
		
		ServletContext sc = getServletContext();
		String str = sc.getInitParameter("name");
		
//		ServletConfig cg = getServletConfig();
//		String str = cg.getInitParameter("name");
		out.println(str);
	}
}
