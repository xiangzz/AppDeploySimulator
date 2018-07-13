package com.ads.similator.generator;
import java.util.ArrayList;

import com.ads.similator.entity.Microservice;
import com.ads.similator.entity.Network;
import com.ads.similator.entity.Request;
import com.ads.similator.entity.Server;
import com.ads.similator.entity.ServiceChain;
import com.ads.similator.entity.User;

public class MainGenerator{
	private String server_conf_fname;
	private String user_conf_fname;
	private String network_conf_fname;
	private String sc_conf_fname;
	private String ms_conf_fname;
	
	private ArrayList<Server> servers;
	private ArrayList<User> users;
	private ArrayList<ServiceChain> serviceChains ;
	private ArrayList<Request> requests;
	private ArrayList<Microservice> microservices;
	private ArrayList<Network> networks;
	
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
		servers = serverGenerator.generate();
		UserGenerator userGenerator = new UserGenerator(user_conf_fname);
		users = userGenerator.generate();
		NetworkGenerator networkGenerator = new NetworkGenerator(network_conf_fname, servers);
		networks = networkGenerator.generate();
		MicroserviceGenerator mGenerator = new MicroserviceGenerator(ms_conf_fname);
		microservices = mGenerator.generate();
		ServiceChainGenerator sChainGenerator = new ServiceChainGenerator(sc_conf_fname);
		serviceChains = sChainGenerator.generate();
		RequestGenerator rGenerator = new RequestGenerator();
		requests = rGenerator.generate();
	}

	public ArrayList<Server> getServers() {
		return servers;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public ArrayList<ServiceChain> getServiceChains() {
		return serviceChains;
	}

	public ArrayList<Request> getRequests() {
		return requests;
	}

	public ArrayList<Microservice> getMicroservices() {
		return microservices;
	}

	public ArrayList<Network> getNetworks() {
		return networks;
	}
	
	
}
