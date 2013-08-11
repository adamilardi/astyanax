package com.netflix.astyanax.connectionpool.impl;

public class EndPointWrapper {
	private String host;
	private String dc;
	private String rack;
	
	public EndPointWrapper(String host, String dc, String rack) {
		this.host = host;
		this.dc = dc;
		this.rack = rack;
	}
	
	public String getHost() {
		return host;
	}
	public String getDc() {
		return dc;
	}
	public String getRack() {
		return rack;
	}
}