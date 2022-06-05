package com.bib;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class studentlist
 */
public class studentlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		java.sql.Connection connection=null;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		  ResultSet rs = null;

		try {
			 connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/jee?serverTimezone=UTC","root","");

			String query = "select * from etudiant";
			  Statement statement;
			statement = connection.createStatement();
			 rs=  statement.executeQuery(query);
			 while(rs.next()){
				 out.println("<table>");
				 out.println("<tr>");
				 out.println("<th>matricule</th>");
				 out.println("<th>nom</th>");
				 out.println("<th>prenom</th>");
				 out.println("<th>forfait</th>");
				 out.println("<th>onprinté</th>");
				 out.println("</th>");
				 out.println("<tr>");
				 out.println("<td> "+ rs.getString("id_universite")+"</td>");
				 out.println("<td>"+ rs.getString("nom")+"</td>");
				 out.println("<td>"+ rs.getString("prenom")+"</td>");
				 out.println("<td>"+ rs.getString("forfait")+"</td>");
				 out.println("<td>"+ rs.getString("omprinté")+"</td>");
				 out.println("</th>");

				 
				 
				 System.out.println("</table>");
				 
				 
			 }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
