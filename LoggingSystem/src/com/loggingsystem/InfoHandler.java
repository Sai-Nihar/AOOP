package com.loggingsystem;

public class InfoHandler extends LogHandler{

	@Override
	public void handleRequest(String message, LogLevel level) {
		// TODO Auto-generated method stub
		if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message, level);
        }
	}

}
