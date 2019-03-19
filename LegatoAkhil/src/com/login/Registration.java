package com.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Connection con = Login.getConnection();
		
		String UserId=request.getParameter("UserId");
		String name = request.getParameter("Firstname");
		String gender = request.getParameter("gender");
		String PhoneNo = request.getParameter("phoneno");
		String[] technologies = request.getParameterValues("Technologies");
	//	String technology="";
	/*	for(int i = 0; i<technologies.length;i++){
			technology= technology+","+technologies[i];
		}*/
	
		Customer customer = new Customer();
		customer.setUserId(Integer.parseInt(UserId));
		customer.setName(name);
		customer.setGender(gender);
		customer.setPhoneNo(PhoneNo);
		customer.setTechnologies(technologies);
		
		UsersDAO usersdao = new UsersDAO();
		usersdao.addCustomer(customer);
		
		List<LoginDetails> list=usersdao.getUserId();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("userId", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("DisplayUsers.jsp");
		rd.forward(request, response);
			
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
