package com.rpi.springbootrestapi.controller;

import com.rpi.springbootrestapi.controller.dto.TemperatureDTO;
import com.rpi.springbootrestapi.controller.mapper.TemperatureMapper;
import com.rpi.springbootrestapi.entity.Temperature;
import com.rpi.springbootrestapi.repository.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@CrossOrigin
public class TemperatureController {

    @Autowired private TemperatureMapper temperatureMapper;
    @Autowired private TemperatureRepository temperatureRepository;

    @PostMapping(path = "/saveTemperature",  consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public TemperatureDTO saveTemp(@RequestBody TemperatureDTO temperatureDTO){
        temperatureDTO.setId(UUID.randomUUID());
        Temperature temperature = temperatureMapper.dtoToEntity(temperatureDTO);
        temperature = temperatureRepository.save(temperature);
        return temperatureMapper.entityToDto(temperature);
    }

    @GetMapping(path = "/getTemperature", produces = MediaType.APPLICATION_XML_VALUE)
    public List<TemperatureDTO> getTemp(){
        return temperatureMapper.entityToDto(temperatureRepository.findAll());
    }

}
