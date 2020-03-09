package com.StatePattern;
public class Remote {

	public static void main(String[] args) {
		TV tv = new TV();
		State tvOn = new TVOnState();
		State tvOff = new TVOffState();
		State tvVolUp = new TVVolUp();
		State tvVolDown = new TVVolDown();

		tv.setState(tvOn);
		tv.perform();
		
		tv.setState(tvVolUp);
		tv.perform();
		
		tv.setState(tvVolDown);
		tv.perform();
		
		tv.setState(tvOff);
		tv.perform();
		
	}

}