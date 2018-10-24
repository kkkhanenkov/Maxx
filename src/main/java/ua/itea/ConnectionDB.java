package ua.itea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class ConnectionDB {

		Connection conn;
		Statement st;
		public ConnectionDB() {
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Obtained");
	           
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		 try {
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Heroes?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Vitalina1!");
			st =  con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

        
         List<Heroe> getAllHeroes() {
     		List<Heroe> heroes = new ArrayList<>();
     		String sql = "SELECT * FROM dota";
     		try {
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					Heroe heroe = new Heroe();
					heroe.setID(rs.getInt(1));
					heroe.setNAME(rs.getString("Name"));
					heroe.setULTIMATE(rs.getString("Ultimate"));
					heroes.add(heroe);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     		return heroes;
     		
		 
	
	
		
		
	}
	

	}


