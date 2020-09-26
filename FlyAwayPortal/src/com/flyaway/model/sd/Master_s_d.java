package com.flyaway.model.sd;

public class Master_s_d {

	private int sd_id;
	private String source;
	private String destination;
	public int getSd_id() {
		return sd_id;
	}
	public void setSd_id(int sd_id) {
		this.sd_id = sd_id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Master_s_d() {
		//super();
	}
	@Override
	public String toString() {
		return "Master_s_d [sd_id=" + sd_id + ", source=" + source + ", destination=" + destination + "]";
	}
	
}
