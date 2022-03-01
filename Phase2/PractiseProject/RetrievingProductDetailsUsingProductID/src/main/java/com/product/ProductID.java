package com.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

	@WebServlet("/productid")
	public class ProductID extends HttpServlet{
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String url="jdbc:mysql://localhost:8080/ecommerce";
			String uname="root";
			String pass="Connect@10";
			
			response.setContentType("text/html");
			
			String pId = request.getParameter("p_ID");
		
			PrintWriter out = response.getWriter();
			
			String query="select * from product_details where ProductId=?";
			out.print("<h1>Displaying the Product Details...</h1>");
			out.print("<table border='1'><tr><th>ProductId</th><th>Product_Name</th><th>Product_Price</th></tr>");
			
			try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      Connection dbCon = DriverManager.getConnection(url, uname, pass);
		      PreparedStatement st=  dbCon.prepareStatement(query);
		      
		      st.setString(1, pId);
		      
		      ResultSet rs =st.executeQuery();
		      
		      while(rs.next()) {
		    	  
		    	  out.print("<tr><td>");
		    	  out.println(rs.getInt(1));
		    	  out.print("</td>");
		    	  out.print("<td>");
		    	  out.print(rs.getString(2));
		    	  out.print("</td>");
		    	  out.print("<td>");
		    	  out.print(rs.getInt(3));
		    	  out.print("</td>");
		    	  out.print("</tr>");	  
				}
		      
			}
			catch(Exception e){
				
				System.out.println("Some Issue : "+ e.getMessage());
			}
			
			out.print("</table>");
			
		}

	}
