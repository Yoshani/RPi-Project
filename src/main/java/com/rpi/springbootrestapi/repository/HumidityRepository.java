package com.rpi.springbootrestapi.repository;

import com.rpi.springbootrestapi.entity.Humidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HumidityRepository extends JpaRepository<Humidity, UUID> {
}
