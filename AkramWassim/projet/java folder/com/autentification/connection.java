package com.autentification;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.autentification.cnt;
/*import com.javatpoint.dao.Connection;
import com.javatpoint.dao.DB;
import com.javatpoint.dao.Exception;
import com.javatpoint.dao.PreparedStatement;*/
public class connection {
	
	try{
		Connection con= cnt.getconnection();
		PreparedStatement ps=con.prepareStatement("insert into person ( FIRST_NAME , LAST_NAME, email, password) VALUES ('testtt', 'tttttwassimmmm', '@@@@@@@@@', 'wassinnnn')");
		/*ps.setString(1,bean.getCallno());
		ps.setString(2,bean.getName());
		ps.setString(3,bean.getAuthor());
		ps.setString(4,bean.getPublisher());
		ps.setInt(5,bean.getQuantity());
		ps.setInt(6,0);*/
		ps.executeUpdate();
		//con.close();
		
	}catch(Exception e){System.out.println(e);}
	

}}

