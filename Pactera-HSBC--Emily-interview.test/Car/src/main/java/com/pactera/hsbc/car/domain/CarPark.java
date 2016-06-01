package com.pactera.hsbc.car.domain;

public class CarPark {
	private  int x;
	private  int y;
	
	public CarPark(){
		this(0,0);
	}
	public CarPark(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
