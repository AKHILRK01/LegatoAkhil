package com.login;


import java.sql.*;
import java.util.ArrayList;

import com.login.Customer;

public class Login {

	

	public static Connection getConnection()
	{
		try
		{
		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		//CREATE THE CONNECTION
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db27", "root", "AKHILKATTI01");
		System.out.println("Connected Successfully");
		
		return con;
	}
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
}

	public static boolean validate(String name, String passw, Connection con) {
		// TODO Auto-generated method stub
		boolean flag =false;
		try {

		            String sql = "select * from db27.Login where username=? and pass=?";
					PreparedStatement pstmt = con.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, passw);
					ResultSet rs = pstmt.executeQuery();
					
		            while (rs.next()) 
		            {
		    			flag=true;
		    			break;
		    		}
		    	
		    		return flag;
		}
		
	
					catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	
		return flag;
	}
	
	
	
	
	
	public static ArrayList<Customer> displayData(Connection con)
	{
	
		String sqlExecute = " select * from db27.customer where values(?,?,?)";
		PreparedStatement pstmt;
		try
		{
			pstmt = con.prepareStatement(sqlExecute);
			ArrayList<Customer> a1 = new ArrayList<Customer>();
			ResultSet rs =  pstmt.executeQuery();
			while(rs.next())
			{
			Customer customer = new Customer();
			customer.setName(((ResultSet) rs).getString(1));
			customer.setGender(rs.getString(2));
			String[] arr= { rs.getString(3)};
			//customer.setTechnologies(arr);
			a1.add(customer);
			}
			
			pstmt.close();
			rs.close();
			con.close();
			return a1;
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		}
	
	
	}

	public static void insertData(Customer customer, Connection con) {
		// TODO Auto-generated method stub
		

	/*		String technology = "";
			String[] technologies =  customer.getTechnologies();
			if(technologies!= null) {
			for(int i=0; i < technologies.length;i++)
			{
				technology = technology +","+ technologies[i];
			}
			}
			String sql = "Insert into db27.customer where values(?,?,?)";
			try {
				PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,customer.getName());
			pstmt.setString(2,customer.getGender());
			pstmt.setString(3,technology);
			pstmt.executeUpdate();
			
			pstmt.close();
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}*/
	
}

	
	
}