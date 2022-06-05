package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Etudiant;

/**
 * Servlet implementation class addEtudiant
 */

public class AddEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		
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
		 System.out.println(connection);
		 String nom = request.getParameter("nom");
         String prenom = request.getParameter("prenom");
         String email = request.getParameter("email");
         String pwd = request.getParameter("pwd");
         String nba = request.getParameter("nbLivreMensuel_Autorise");
		 String query ="insert into etudiant (nom , prenom,email,pwd,nbLivreMensuel_Autorise,nbLivreEmprunte)values(''"+nom+"'','"+prenom+"','"+email+"','"+pwd+"','"+nba+"','0')";
		 java.sql.Statement statement = connection.createStatement();
		 statement.executeUpdate(query); 
		 
		 
		 } catch (SQLException e) {
			 e.printStackTrace();
			 System.out.println("Erreur lors de l’établissement de la connexion");
		 } 
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		

	}

}
