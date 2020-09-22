package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		
		//creating object
		Connection con;
		//calling getconnection
		con=ConnectionManager.getConnection();
		if(con!=null)
			System.out.println("Connection established");
		else
			System.out.println("Check your connection");   
		
	}
}
