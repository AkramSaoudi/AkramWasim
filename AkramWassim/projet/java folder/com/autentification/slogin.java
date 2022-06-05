package com.autentification;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;







public class slogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String [][] tableau;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public slogin() {
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
	
		 String semail=request.getParameter("semail");
		 String spwd=request.getParameter("spwd");
			PrintWriter out=response.getWriter();

			String query2 ="select * from livre";
			java.sql.Statement statement2 = connection.createStatement();
			ResultSet rs2 = statement2.executeQuery(query2);
			 String query ="select * from etudiant where email ='"+semail+"';\r\n" + "";
			 java.sql.Statement statement = connection.createStatement();
			ResultSet rs =statement.executeQuery(query);
            while(rs.next()){
                String sid = rs.getString("id_universite");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String email = rs.getString("email");
                String pwd = rs.getString("pwd");
                String nba = rs.getString("nbLivreMensuel_Autorise");
                String nbo = rs.getString("nbLivreEmprunte");

           if( pwd.equals(spwd)) {
    				response.sendRedirect(request.getContextPath() + "/student/student.jsp?sid="+ sid +"&nom="+nom+"&prenom="+prenom+"&email="+email+"&nba="+nba+"&nbo="+nbo+"&size="+rs2+"");

    			}else {
    				response.sendRedirect(request.getContextPath() + "/student/login.jsp?e=1");

    			}

            }		    

		 } catch (SQLException e) {
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
 