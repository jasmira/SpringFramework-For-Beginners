package com.event;

/* This code to show a listener tied to all events */

/*

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener { 

	@Override
	public void onApplicationEvent(ApplicationEvent e) {
		System.out.println(e.toString());
	}

}

*/


/*  This code to show a listener tied to a specific event */ 

import com.event.ShowEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<ShowEvent> { 

	@Override
	public void onApplicationEvent(ShowEvent e) {
		System.out.println(e.toString());
	}

}

