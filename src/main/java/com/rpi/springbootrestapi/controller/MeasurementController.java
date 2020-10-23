package com.rpi.springbootrestapi.controller;

import com.rpi.springbootrestapi.controller.dto.MeasurementDTO;
import com.rpi.springbootrestapi.controller.mapper.MeasurementMapper;
import com.rpi.springbootrestapi.entity.Measurement;
import com.rpi.springbootrestapi.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
public class MeasurementController {

    @Autowired private MeasurementRepository measurementRepository;
    @Autowired private MeasurementMapper measurementMapper;

    @PostMapping(path = "/saveValues",  consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public MeasurementDTO save(@RequestBody MeasurementDTO measurementDTO){
        measurementDTO.setId(UUID.randomUUID());
        Measurement measurement = measurementMapper.dtoToEntity(measurementDTO);
        measurement = measurementRepository.save(measurement);
        return measurementMapper.entityToDto(measurement);
    }

    @GetMapping(path = "/getValues", produces = MediaType.APPLICATION_XML_VALUE)
    public List<MeasurementDTO> getValues(){
        return measurementMapper.entityToDto(measurementRepository.findAll());
    }
}
