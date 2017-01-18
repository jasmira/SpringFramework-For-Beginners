package com.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Publisher implements ApplicationEventPublisherAware {
	ApplicationEventPublisher ae;
	Point point;

	public Point getPoint() {
		return point;
	}

	@Autowired
	public void setPoint(Point p) {
		this.point = p;
	}

	public void show() {
		System.out.println("x=" + point.getX());
		System.out.println("y=" + point.getY());
		ae.publishEvent(new ShowEvent());
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher ae) {
		this.ae = ae;
	}
}
