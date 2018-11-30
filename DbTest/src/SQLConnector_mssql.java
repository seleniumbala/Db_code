	
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;		
public class  SQLConnector_mssql {				
    	/*public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                String dbUrl = "jdbc:sqlserver://ezcbre-dev.ctcxxbcdgn2v.us-east-1.rds.amazonaws.com/sam-pos-v2";					

				//Database Username		
				String username = "ezcbre_admin";	
                
				//Database Password		
				String password = "Admin123";				

				//Query to Execute		
				String query = "select *  from BillingDetails";	
                
         	    //Load mysql jdbc driver		
           	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);							
         
         		// While Loop to iterate through all data and print results		
				while (rs.next()){
			        		String myName = rs.getString(1);								        
                            String myAge = rs.getString(2);					                               
                            System. out.println(myName+"  "+myAge);		
                    }		
      			 // closing DB Connection		
      			con.close();			
		}*/
    	public static void main(String[] args) throws SQLException, ClassNotFoundException {
    		
    		//Loading the required JDBC Driver class
    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
    		
    		//Creating a connection to the database
    		Connection conn = DriverManager.getConnection("jdbc:sqlserver://ezcbre-dev.ctcxxbcdgn2v.us-east-1.rds.amazonaws.com/sam-pos-v2","ezcbre_admin","Admin123");
    		
    		//Executing SQL query and fetching the result
    		Statement st = conn.createStatement();
    		String sqlStr = "select * from BillingDetails";
    		ResultSet rs = st.executeQuery(sqlStr);
    		while (rs.next()) {
    			System.out.println(rs.getString("name"));
    		}		
    	}
}