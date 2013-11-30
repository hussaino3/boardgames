package com.boarge.server.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import com.boarge.server.database.GamesTable;

public class MainServlet extends HttpServlet
{

	public static void main(String[] args) throws Exception
	{

		Server server = new Server(80);

		WebAppContext context = new WebAppContext();
		context.setWar("war");
		context.setContextPath("/");
		server.setHandler(context);

		GamesTable.init();

		server.start();
		server.join();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
			IOException
	{
		resp.setContentType("text/plain");
		resp.getWriter().write("Main Servlet!\n");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		Integer id = Integer.valueOf(req.getParameter("id"));
		String name = req.getParameter("name");
		Integer age = Integer.valueOf(req.getParameter("age"));
		String grade = req.getParameter("grade");
	}

}
