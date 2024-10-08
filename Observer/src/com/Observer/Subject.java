package com.Observer;

public interface Subject {
	public void addObserver(Observer observerobj);
	public void removeObserver(Observer observerobj);
	public void notifyObserver();
}
