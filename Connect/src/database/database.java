package database;

import java.sql.DriverManager;
import java.sql.*;
public class database {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//String query = "insert into resresult values( 'Omer'  ,'java','D')";
		String query = "select * from resresult";

		 Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/srp","root","1234"); 
		 Statement st = con.createStatement(); 
		// int count = st.executeUpdate(query); // count returns how many rows are updated
		 // System.out.println(count + "row/s effected");
		  
		    	//console output
		   ResultSet rs= st.executeQuery(query);
		    String resresult = "";
		    while (rs.next())
		     {
		    	resresult = rs.getString(1) +" : "+ rs.getString(2)+ " : "+rs.getString(3) ;
		        System.out.println(resresult);
		     }
		    st.close();
		     con.close();
			}
		
	}


