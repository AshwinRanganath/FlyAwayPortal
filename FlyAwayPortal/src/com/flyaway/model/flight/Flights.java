package com.flyaway.model.flight;
//import com.flyaway.exception.FlyawayException;


public class Flights {
	
	private int fid;
	private int m_sd_id;
	private int cid;
	private String arrival_time_to_destination;
	private String destination_from_source_time;
	private double fprice;
	private String available;
	private String source;
	private String destination;
	private String airlines;
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
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	
	
	public int getFid() {
		return fid;
	}
	@Override
	public String toString() {
		return "Flights [fid=" + fid + ", m_sd_id=" + m_sd_id + ", cid=" + cid + ", arrival_time_to_destination="
				+ arrival_time_to_destination + ", destination_from_source_time=" + destination_from_source_time
				+ ", fprice=" + fprice + ", available=" + available + ", source=" + source + ", destination="
				+ destination + ", airlines=" + airlines + "]";
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getM_sd_id() {
		return m_sd_id;
	}
	public void setM_sd_id(int m_sd_id) {
		this.m_sd_id = m_sd_id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getArrival_time_to_destination() {
		return arrival_time_to_destination;
	}
	public void setArrival_time_to_destination(String arrival_time_to_destination) {
		this.arrival_time_to_destination = arrival_time_to_destination;
	}
	public String getDestination_from_source_time() {
		return destination_from_source_time;
	}
	public void setDestination_from_source_time(String destination_from_source_time) {
		this.destination_from_source_time = destination_from_source_time;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	public Flights() {
		
	}
	
	

}
