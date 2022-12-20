 package com.trip.tripSchedual.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class station {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idStation;
	private String stationName;
	
	public Integer getIdStation() {
		return idStation;
	}
	public void setIdStation(Integer idStation) {
		this.idStation = idStation;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	
}
