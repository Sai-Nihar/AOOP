package com.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
     List <Observer>  observers= new ArrayList<>();
	@Override
	public void addObserver(Observer observerobj) {
		// TODO Auto-generated method stub
		observers.add(observerobj);
	}
	@Override
	public void removeObserver(Observer observerobj) {
		// TODO Auto-generated method stub
		observers.remove(observerobj);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer ob: observers)
		{
			String weatherobj = null;
			ob.update(weatherobj);
		}
	}

}
