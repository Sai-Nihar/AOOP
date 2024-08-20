package com.LoginApp;

public class LoginSystem {
	private static LoginSystem instance;
	private String loggedInuser;
	
	private LoginSystem()//constructor
		{
		loggedInuser=null; //instance variable is not directly initialized.
	}
	public static LoginSystem getUser()//lazy initialization approach is followed
	{
		if(instance==null) { //check any instance of class is created or not
			instance = new LoginSystem();
		}
		return instance; 
	}
 public void login(String Username) {
	 if(loggedInuser==null) {
		 loggedInuser= Username;
		 System.out.println("user 1 logged out successfully::::"+Username);
	 }
	 else {
		 System.out.println("Another user is already logged in, login failed::"+Username);
	 }
	 
 }
}
