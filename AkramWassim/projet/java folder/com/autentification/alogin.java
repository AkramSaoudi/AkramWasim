package com.autentification;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class alogin
 */
public class alogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public alogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		
		java.sql.Connection connection=null;
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Pilote MySQL JDBC chargé");
		 } catch (ClassNotFoundException e) {
		 e.printStackTrace();
		 System.out.println("Erreur lors du chargmement du pilote");
		 }
		 try {
			 //jdbc:mysql://localhost:3306/db_test?serverTimezone=UTC
		 connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/jee?serverTimezone=UTC","root","");
		 String aemail=request.getParameter("aemail");
		 String apwd=request.getParameter("apwd");
		 String query ="select * from admin where email ='"+aemail+"';\r\n" + "";
		 java.sql.Statement statement = connection.createStatement();
		ResultSet rs =statement.executeQuery(query);
		 while(rs.next()){
            /* String sid = rs.getString("id_universite");
             String nom = rs.getString("nom");
             String prenom = rs.getString("prenom");
             String email = rs.getString("email");
             String nba = rs.getString("nbLivreMensuel_Autorise");
             String nbo = rs.getString("nbLivreEmprunte");
		 */
             String pwd = rs.getString("pwd");

		 if( pwd.equals(apwd)) {
				response.sendRedirect(request.getContextPath() + "/admin/adminIndex.jsp?");

			}else {
				response.sendRedirect(request.getContextPath() + "/admin/login.jsp?e=1");

			}
		 }
		 
		 }catch (SQLException e) {
			 e.printStackTrace();
			 System.out.println("Erreur lors de l’établissement de la connexion");
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
