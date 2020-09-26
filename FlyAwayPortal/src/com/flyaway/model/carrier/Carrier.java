package com.flyaway.model.carrier;

public class Carrier {
	private int cid;
	private int fid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Carrier() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Carrier [cid=" + cid + ", fid=" + fid + ", cname=" + cname + "]";
	}
	
	

}
