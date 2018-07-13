package com.ads.similator.entity;

import java.util.ArrayList;

public class ServiceChain {
	private ArrayList<Microservice> sc;
	private Integer current;
	private Integer service_num;
	
	public Microservice next(){
		return null;
	}
}
