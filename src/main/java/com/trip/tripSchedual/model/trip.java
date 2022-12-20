package com.trip.tripSchedual.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class trip {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTrip;
	private String startTime;
	private String endTime;
	private String from;
	private String to;
	
	
	public Integer getIdTrip() {
		return idTrip;
	}
	public void setIdTrip(Integer idTrip) {
		this.idTrip = idTrip;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
	 
}
