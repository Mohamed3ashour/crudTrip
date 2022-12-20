package com.trip.tripSchedual.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trip.tripSchedual.model.trip;

@Repository
public interface tripRepository extends CrudRepository<trip,Integer> {

}
