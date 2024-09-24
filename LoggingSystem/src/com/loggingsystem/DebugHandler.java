package com.loggingsystem;

public class DebugHandler extends LogHandler{

	@Override
	public void handleRequest(String message, LogLevel level) {
		// TODO Auto-generated method stub
		if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message, level);
        }
	}

}