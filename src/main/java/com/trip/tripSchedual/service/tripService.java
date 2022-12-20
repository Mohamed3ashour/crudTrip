package com.trip.tripSchedual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trip.tripSchedual.model.trip;
import com.trip.tripSchedual.repository.tripRepository;

@Service
public class tripService {

	@Autowired
	private tripRepository tripRepository;
	public trip registerTrip(trip trip) {
		return tripRepository.save(trip);
	}
	public  List<trip> getTrips () {
		return (List<trip>) tripRepository.findAll();
	}
	public void deleteTrip(Integer idTrip) {
		tripRepository.deleteById(idTrip);
	}
}
