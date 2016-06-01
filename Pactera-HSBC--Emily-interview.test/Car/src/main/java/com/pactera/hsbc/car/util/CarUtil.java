package com.pactera.hsbc.car.util;

import com.pactera.hsbc.car.domain.CarPark;
import com.pactera.hsbc.car.service.CarImpl;

public class CarUtil {
	public static boolean isOverStep(int x,int y,CarPark park) throws Exception{
		if(x>park.getX()||y>park.getY()
				||park.getX()<0||park.getY()<0){
			throw new Exception("the car is overstep");
		}else{
			return false;
		}
	}
	public static String printInfo(int x,int y,String oriention) {
		StringBuilder sb=new StringBuilder();
		sb.append("x=").append(x).append(",y=")
		.append(y).append(", Oriention is ")
		.append(oriention);
		return sb.toString();
		}
}
