package com.loggingsystem;

public class ErrorHandler extends LogHandler{

	@Override
	public void handleRequest(String message, LogLevel level) {
		// TODO Auto-generated method stub
		if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message, level);
        }
	}

}
