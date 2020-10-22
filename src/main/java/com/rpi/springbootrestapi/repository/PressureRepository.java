package com.rpi.springbootrestapi.repository;

import com.rpi.springbootrestapi.entity.Pressure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PressureRepository extends JpaRepository<Pressure, UUID> {
}
