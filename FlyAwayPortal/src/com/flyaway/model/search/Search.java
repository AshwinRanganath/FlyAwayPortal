package com.flyaway.model.search;

//import java.util.Date;

public class Search {
	
	private String dot;
	private String source;
	private String destination;
	private int nop;
	public String getDot() {
		return dot;
	}
	public void setDot(String dot) {
	
		this.dot = dot;
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
	public int getNop() {
		return nop;
	}
	public void setNop(int nop) {
		this.nop = nop;
	}
	public Search() {
	
	}
	@Override
	public String toString() {
		return "Search [dot=" + dot + ", source=" + source + ", destination=" + destination + ", nop=" + nop + "]";
	}



}
