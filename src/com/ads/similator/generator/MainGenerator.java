package com.ads.similator.generator;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.ads.similator.entity.Microservice;
import com.ads.similator.entity.Server;
import com.ads.similator.entity.ServiceChain;
import com.ads.similator.entity.User;

public class MainGenerator{
	private String server_conf_fname;
	private String user_conf_fname;
	private String network_conf_fname;
	private String sc_conf_fname;
	private String ms_conf_fname;
	
	public MainGenerator(String srv_conf, String usr_conf, 
			String nw_conf, String sc_conf, String ms_conf){
		this.server_conf_fname = srv_conf;
		this.user_conf_fname = usr_conf;
		this.network_conf_fname = nw_conf;
		this.sc_conf_fname = sc_conf;
		this.ms_conf_fname = ms_conf;
	}
	
	public void generate(){
		ServerGenerator serverGenerator = new ServerGenerator(server_conf_fname);
		ArrayList<Server> servers = serverGenerator.generate();
		UserGenerator userGenerator = new UserGenerator(user_conf_fname);
		ArrayList<User> users = userGenerator.generate();
		NetworkGenerator networkGenerator = new NetworkGenerator(network_conf_fname, servers);
		MicroserviceGenerator mGenerator = new MicroserviceGenerator(ms_conf_fname);
		ArrayList<Microservice> microservices = mGenerator.generate();
		ServiceChainGenerator sChainGenerator = new ServiceChainGenerator(sc_conf_fname);
		ArrayList<ServiceChain> serviceChains = sChainGenerator.generate();
		
		
	}
}
