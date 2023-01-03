package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Cab;

@Repository
public interface CabRepository extends JpaRepository<Cab, Integer>{

	public List<Cab> findByCabType(String cabType);
}
