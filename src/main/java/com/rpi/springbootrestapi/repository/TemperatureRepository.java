package com.rpi.springbootrestapi.repository;

import com.rpi.springbootrestapi.entity.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, UUID> {

}
