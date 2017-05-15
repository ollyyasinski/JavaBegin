package com.epam.basic.java.begin.module2.task2;

import java.util.ArrayList;

public class Bus {

	static ArrayList<BusStop> busStops = new ArrayList<BusStop>(); 
	
	public void busStops(){
		BusStop bs1 = new BusStop();
		bs1.name = "Bus stop 1";
		BusStop bs2 = new BusStop();
		bs2.name = "Bus stop 2";
		BusStop bs3 = new BusStop();
		bs3.name = "Bus stop 3";
		BusStop bs4 = new BusStop();
		bs4.name = "Bus stop 4";
		BusStop bs5 = new BusStop();
		bs5.name = "Bus stop 5";
	
		busStops.add(bs1);
		busStops.add(bs2);
		busStops.add(bs3);
		busStops.add(bs4);
		busStops.add(bs5);
	}
	
//	public void move(int i){		
//		System.out.println("The bus leaves " + busStops.get(i).name);
//	}
	
	public void move(BusStop bs){
		System.out.println("The bus leaves " + bs.name);
	}
	
	public void stop(BusStop bs){
		System.out.println("The bus stops at " + bs.name);
	}
	public void add(Human human, Dog dog, BusStop bs){
		if (human.haveDog == true){
			System.out.println(human.name + " and his dog " + dog.name + " gets on the bus at " + bs.name);
	} else{
		System.out.println(human.name + " gets on the bus at " + bs.name);
		}
	}	
	public void remove(Human human, Dog dog, BusStop bs){
		if (human.haveDog == true){
			System.out.println(human.name + " and his dog " + dog.name + " gets off the bus at " + bs.name);
	} else{
		System.out.println(human.name + " gets off the bus at " + bs.name);
		}
	}	
	
	
	
	
}
