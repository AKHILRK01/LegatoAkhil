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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
      //  System.out.println("inside Servlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("inside Servlet");
		
		 
		int name=Integer.parseInt(request.getParameter("UserId"));
		String passw=request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.print("<b>You have entered wrong username and password</b>");
		
		UsersDAO usersdao = new UsersDAO();
			
		boolean flag =usersdao.addUsers(name,passw);
		
		if (flag)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request,response);
			
		}
		
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request,response);
		}
		/*HttpSession session = request.getSession();
		//session.invalidate();
		//session.setMaxInactiveInterval(1000);
		session.setAttribute("session",name);
		
		System.out.println("session id" + session.getId());
		
		Connection con = Login.getConnection();
		PrintWriter pw = response.getWriter();
		
		
		if(Login.validate(name,passw,con)) {
		RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
		rd.forward(request,response);
		
		}
		
		else
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("NewFile1.html");
			rd.include(request,response);	
			response.setContentType("text/html");
			pw.print("<b>You have entered wrong username and password</b>");
			
		}
		*/
	
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
