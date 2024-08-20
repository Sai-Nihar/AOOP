package com.LoginApp;
public class Test { 
	 
	 public static void main(String[] args) { 
	  LoginSystem login_user1 = LoginSystem.getUser(); 
	  login_user1.login("SAI"); 
	  //login_user1.logout(); 
	  LoginSystem login_user2 = LoginSystem.getUser(); 
	  login_user2.login("NIHAR");
	 } 
	 		
	}