package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayById
 */
@WebServlet("/DisplayById")
public class DisplayById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
String option= request.getParameter("userid");
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.print("<b>Please select one option<b>");
		if(option!="") {
		int userId = Integer.parseInt(option);
		UsersDAO dao = new UsersDAO();
		List<Customer> customers= dao.getCustomer(userId);	
			
		request.setAttribute("customers", customers);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayUsers.jsp");
		rd.forward(request, response);	
		}
		else {
		RequestDispatcher rd = request.getRequestDispatcher("DisplayUsers.jsp");
		rd.include(request, response);	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
