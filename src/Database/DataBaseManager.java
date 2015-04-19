package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManager {
	private static boolean connected = false;
	public static Connection conn;
	public final static String USER = "root";
	public final static String PASSWORD = "3125703";
	public final static String DATABASE = "test";
	
	
	public static Connection connect(){
		return connect(USER, PASSWORD, DATABASE);
	}

	public static Connection connect(String user, String password, String database) {
		if(!connected){
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				String url = "jdbc:MySQL://localhost:3306/" + database + 
						"?useUnicode=true&amp;characterEncoding=UTF-8&amp";
				try {
					conn = DriverManager.getConnection(url, user, password);
					if(conn != null){
						connected = true;
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
					return null;
				}
				
			} catch (InstantiationException e) {
				
				e.printStackTrace();
				return null;
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
				return null;
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				return null;
			}
		}
		return conn;
	}

	
	private static int excute(String sql){
			try{
				Statement state = conn.createStatement();
				state.executeUpdate(sql);
				return 0;
			}catch(Exception e){
				return -1;
			}	
	}
	
	public static int createTable(String sql){
		return excute(sql);
	}
	
	public static int dropTable(String sql){
		return excute(sql);
	}
	
	public static int insert(String sql){
		return excute(sql);
	}
	
	public static int delete(String sql){
		return excute(sql);
	}
	
	public static ResultSet query(String sql){
		try{
			if(conn == null) {
				return null;
			}
			else {
				Statement state = conn.createStatement();
				ResultSet set = state.executeQuery(sql);
//				try{
//					while(set.next()){
//						String url = set.getString(1);
//						int id = set.getInt(2);
//						System.out.println("url: " + url + "id: " + id);
//					}
//				}catch(Exception e){
//					e.printStackTrace();
//				}
				return set;
			}
		}catch(Exception e){
			return null;
		}
	}
	
	public static void main(String[] args){
		connect(DataBaseManager.USER, DataBaseManager.PASSWORD, DataBaseManager.DATABASE);
		String auto = "create table autobugfix (source text, constraints text, variableType text, variableTrack text, variableMap text, variableFormal text)";
		//String url = "create table prototype (source text, constraints text, variableType text, variableTrack text, variableMap text)";
		System.out.println(DataBaseManager.createTable(auto));
		
//		String dropTableURL = "drop table srcConstraints";
//		System.out.println(DataBaseManager.delete(dropTableURL));
	}


}
