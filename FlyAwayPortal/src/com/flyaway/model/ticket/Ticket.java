package com.flyaway.model.ticket;

import java.sql.Date;
import java.sql.Timestamp;

public class Ticket {

	private int tid;
	private int flight_id;
	private String u_name;
	private String date_of_travel;
	private String date_of_booking;
	private int passenger_age;
	private String passenger_sex;
	private String passenger_name;
	private String payment_status;
	public Ticket() {
	
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getDate_of_travel() {
		return date_of_travel;
	}
	public void setDate_of_travel(String date_of_travel) {
		this.date_of_travel = date_of_travel;
	}
	public String getDate_of_booking() {
		return date_of_booking;
	}
	public void setDate_of_booking(String date_of_booking) {
		this.date_of_booking = date_of_booking;
	}
	public int getPassenger_age() {
		return passenger_age;
	}
	public void setPassenger_age(int passenger_age) {
		this.passenger_age = passenger_age;
	}
	public String getPassenger_sex() {
		return passenger_sex;
	}
	public void setPassenger_sex(String passenger_sex) {
		this.passenger_sex = passenger_sex;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", flight_id=" + flight_id + ", u_name=" + u_name + ", date_of_travel="
				+ date_of_travel + ", date_of_booking=" + date_of_booking + ", passenger_age=" + passenger_age
				+ ", passenger_sex=" + passenger_sex + ", passenger_name=" + passenger_name + ", payment_status="
				+ payment_status + "]";
	}
	
	
	
}
