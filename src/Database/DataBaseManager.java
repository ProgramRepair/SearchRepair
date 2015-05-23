package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Library.Utility;

public class DataBaseManager {
	private static boolean connected = false;
	public 	static Connection conn;
	public  static String USER;
	public  static String PASSWORD;
	public  static String DATABASE;
	public final static String TABLEFUTURE1 = "future1";
	public final static String TABLEFUTURE2 = "future2";
	public final static String TABLEALL = "introclass";
	public final static String TABLELINUX = "linux";
	
	
	public static void setParamters(String user, String password, String database){
		DataBaseManager.USER = user;
		DataBaseManager.PASSWORD = password;
		DataBaseManager.DATABASE =  database;
	}
	
	public static Connection connect(){
		if(connected) return conn;
		try{
			String s = Utility.getStringFromFile("./configuration/configuration");
			String[] data = s.split("\n");
			String user = data[0].split(":")[1];
			String password = data[1].split(":")[1];
			String database = data[2].split(":")[1];
			setParamters(user, password, database);
		}catch(Exception e){
			e.printStackTrace();
		}
		return connect(USER, PASSWORD, DATABASE);
	}
	
	public static void close(){
		try {
			connected = false;
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
				return set;
			}
		}catch(Exception e){
			return null;
		}
	}
	
	
	
	
	public static boolean isConnected() {
		return connected;
	}
	
	public static void clean(){
		String deletefuture1 = "delete  from " + DataBaseManager.TABLEFUTURE1;
		String deletefuture2 = "delete  from " + DataBaseManager.TABLEFUTURE2;
		String deleteall = "delete  from " + DataBaseManager.TABLEALL;
		String deletelinux = "delete  from " + DataBaseManager.TABLELINUX;
		DataBaseManager.excute(deletefuture1);
		DataBaseManager.excute(deletefuture2);
		DataBaseManager.excute(deleteall);
		DataBaseManager.excute(deletelinux);
	}
	
	public static void createTables(){
		String autofuture1 = "create table " + DataBaseManager.TABLEFUTURE1  + " (source text, constraints text, variableType text, variableTrack text, variableMap text, variableFormal text)";
		String autofuture2 = "create table " + DataBaseManager.TABLEFUTURE2  + " (source text, constraints text, variableType text, variableTrack text, variableMap text, variableFormal text)";
		String autoall = "create table " + DataBaseManager.TABLEALL  + " (source text, constraints text, variableType text, variableTrack text, variableMap text, variableFormal text)";
		String autolinux = "create table " + DataBaseManager.TABLELINUX  + " (source text, constraints text, variableType text, variableTrack text, variableMap text, variableFormal text)";
		DataBaseManager.excute(autofuture1);
		DataBaseManager.excute(autofuture2);
		DataBaseManager.excute(autoall);
		DataBaseManager.excute(autolinux);
	}
	
	public static void rebuildTables(){
		createTables();
		clean();
	}


	public static void main(String[] args){
		DataBaseManager.setParamters("root", "3125703", "test");
		connect(DataBaseManager.USER, DataBaseManager.PASSWORD, DataBaseManager.DATABASE);
		rebuildTables();
		
	}


}
