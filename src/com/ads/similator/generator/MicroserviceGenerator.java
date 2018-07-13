package com.ads.similator.generator;

import java.util.ArrayList;

import com.ads.similator.entity.Microservice;

public class MicroserviceGenerator implements Generator<Microservice>{
	private ArrayList<Microservice> microservices;
	
	//r_{ij} = (r_max - r_min) * rand(0,1) + r_min
	private Double max_comp_res;
	private Double min_comp_res;
	//d_{ij} = (d_max - d_min) * rand(0,1) + d_min
	private Double max_stor_res;
	private Double min_stor_res;
	// incremental microservice id
	
	public MicroserviceGenerator(){}
	public MicroserviceGenerator(String filename){
		
	}
	@Override
	public ArrayList<Microservice> generate() {
		// TODO Auto-generated method stub
		return null;
	}
}
