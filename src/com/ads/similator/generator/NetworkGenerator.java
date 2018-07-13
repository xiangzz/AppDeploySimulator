package com.ads.similator.generator;

import java.util.ArrayList;

import com.ads.similator.entity.Network;
import com.ads.similator.entity.Server;

public class NetworkGenerator implements Generator<Network>{
	private Network network;
	private ArrayList<Server> servers;
	
	public NetworkGenerator(){};
	public NetworkGenerator(String filename, ArrayList<Server> servers){
		if ("".equals(filename) || filename == null){
			
		}
		else{
			
		}
	}
	@Override
	public ArrayList<Network> generate() {
		// TODO Auto-generated method stub
		return null;
	};
	
	public void load_from_file(String filename){};
	public void write_to_file(String filename){};
	
}
