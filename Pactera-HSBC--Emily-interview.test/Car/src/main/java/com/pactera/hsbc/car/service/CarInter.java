package com.pactera.hsbc.car.service;

public interface CarInter {
	void move(String command); 
	int getX();
	int getY();
	String getOriention();
}
