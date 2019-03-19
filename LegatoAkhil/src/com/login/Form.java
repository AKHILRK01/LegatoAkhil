package com.login;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		 
		String uname=request.getParameter("username");
		String passw=request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.print("<b>You have entered wrong username and password</b>");
		
		if(uname.toLowerCase().equals("admin") && passw.toLowerCase().equals("admin"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request,response);
			//response.sendRedirect("http://www.google.com");
			//response.sendRedirect("Registration.jsp");
		}
		
		else
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("NewFile1.html");
			rd.include(request,response);	
			
		}
		
		pw.print("<html>");
		pw.print("<body>");
		pw.print("Employee Name:" + request.getParameter("firstName"));
		pw.print("<br />");
		pw.print("Password:" + request.getParameter("psw"));
		pw.print("<br />");
		pw.print("Email Id:" + request.getParameter("email"));
		pw.print("<br />");
		pw.print("Gender:" + request.getParameter("gender"));
		pw.print("<br />");
		pw.print("Address:" + request.getParameter("address"));
		pw.print("<br />");
		pw.print("Phone:" + request.getParameter("phone"));
		pw.print("<br />");
		pw.print("City:" + request.getParameterValues("city"));
		pw.print("<br />");
		
		pw.print("Technology:" + request.getParameter("tecnologies"));
		pw.print("<br />");
		
		
		pw.print("</body>");
		pw.print("</html>");
		System.out.println("inside doGet"+request); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
