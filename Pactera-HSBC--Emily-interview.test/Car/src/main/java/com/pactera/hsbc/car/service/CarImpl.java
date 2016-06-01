package com.pactera.hsbc.car.service;

import org.apache.log4j.Logger;

import com.pactera.hsbc.car.domain.CarPark;
import com.pactera.hsbc.car.domain.Oriention;
import com.pactera.hsbc.car.util.CarUtil;
	
public class CarImpl implements CarInter{
	private  int x;
	private  int y;
	private String oriention;
	private Logger LOG=Logger.getLogger(CarImpl.class);
	private CarPark park=new CarPark(4,4);
	public CarImpl(){
		this(0,0,"N");
	}
	public CarImpl(int x,int y,String oriention){
		this.x = x;
		this.y = y;
		this.oriention = oriention;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public String getOriention() {
		return this.oriention;
	}
	
	public void move(String command){
		if(command != null){
			LOG.info("begin position: "+CarUtil.printInfo(x,y,oriention));
			if("MOVE".equals(command.toUpperCase())){
				String originalOriention=this.getOriention();
				if("N".equals(originalOriention)){
					y++;
				}
				if("S".equals(originalOriention)){
					y--;
				}
				if("E".equals(originalOriention)){
					x++;
				}
				if("W".equals(originalOriention)){
					x--;
				}
				LOG.info("after turn position: "+CarUtil.printInfo(x,y,oriention));
				}else if("TURN".equals(command.toUpperCase())){
					 Oriention o=Oriention.N;
					 switch(o){
					 case N:this.oriention=Oriention.E.toString();break;
					 case E:this.oriention=Oriention.S.toString();break;
					 case S:this.oriention=Oriention.W.toString();break;
					 case W:this.oriention=Oriention.N.toString();break;
					 }
					 LOG.info("after move position: "+CarUtil.printInfo(x,y,oriention));
				}
				try {
					CarUtil.isOverStep(x, y,park);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}else{
			LOG.error("there is no command");
			}
		}
	
}
