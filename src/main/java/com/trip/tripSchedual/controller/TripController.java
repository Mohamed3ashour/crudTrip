package com.trip.tripSchedual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trip.tripSchedual.model.trip;
import com.trip.tripSchedual.service.tripService;

@RestController
@CrossOrigin(allowedHeaders="*",origins = "*")
public class TripController {
	
	@Autowired
	private tripService tripService;
	
	@PostMapping("/registerTrip")
	public trip registerTrip(@RequestBody trip trip) {
	
		return tripService.registerTrip(trip);
	}
	
	@GetMapping("/getTrip")
	public  List<trip> getTrips () {
		return tripService.getTrips();
	}
	
	@DeleteMapping("/deletTrip")
	public void deleteTrip(@RequestParam Integer idTrip) {
		tripService.deleteTrip(idTrip);
	}

}
