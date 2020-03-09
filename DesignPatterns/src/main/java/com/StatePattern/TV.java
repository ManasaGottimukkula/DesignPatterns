package com.StatePattern;
public class TV implements State {

	private State tvState;

	public void setState(State state) {
		this.tvState=state;
	}

	public State getState() {
		return this.tvState;
	}

	
	public void perform() {
		this.tvState.perform();
	}

}
