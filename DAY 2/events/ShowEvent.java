package com.event;

import org.springframework.context.ApplicationEvent;

public class ShowEvent extends ApplicationEvent {

	public ShowEvent() {
	super(new Object());
	}

	public String toString() {
		return ("Show Event occured ");
	}
}