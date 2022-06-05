package com.autentification;


import java.sql.Connection;  
import java.sql.DriverManager;  
public  class cnt { 
	 
        public static Connection  getconnection()  
        {  
            Connection con = null;  
            try {  
                Class.forName("com.mysql.jdbc.Driver");  
                //K: jdbc:mysql://localhost/jee
                // jdbc:mysql://127.0.0.1:3306/?user=rootnn
       		 	con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/jee?serverTimezone=UTC","root","");
                System.out.println("Connection created");  
                con.close();  
                System.out.println("Connection closed");  
                }  
                catch (Exception e) {  
                System.out.println(e.toString());  
            } 
            return con ;
    }  
}  


