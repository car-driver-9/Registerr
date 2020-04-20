/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;

/**
 *
 * @author USER
 */
public class RegisterDao {
 
	 public String registerUser(RegisterBean registerBean)
	 {
		 String name = registerBean.getname();
                 String address = registerBean.getaddress();
                 String phone = registerBean.getphone();
		 String gender = registerBean.getgender();
                 String email = registerBean.getEmail();
		 String password = registerBean.getPassword();
		 
		 Connection con = null;
		 PreparedStatement preparedStatement = null;
		 
		 try
		 {
			 con = DBConnection.createConnection();
			 String query = "insert into customer(name,address,phone,gender,email,password) values (?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
			 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
			 preparedStatement.setString(1, name);
			 preparedStatement.setString(2, address);
			 preparedStatement.setString(3, phone);
                          preparedStatement.setString(4, gender);
                           preparedStatement.setString(5, email);
			 preparedStatement.setString(6, password);
			 
			 int i= preparedStatement.executeUpdate();
			 
			 if (i!=0)  //Just to ensure data has been inserted into the database
			 return "SUCCESS"; 
		 }
		 catch(SQLException e)
		 {
			e.printStackTrace();
		 }
		 
		 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
	 }
}
