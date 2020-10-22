package com.rpi.springbootrestapi.controller;

import com.rpi.springbootrestapi.controller.dto.PressureDTO;
import com.rpi.springbootrestapi.controller.mapper.PressureMapper;
import com.rpi.springbootrestapi.entity.Pressure;
import com.rpi.springbootrestapi.repository.PressureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PressureController {

    @Autowired private PressureMapper pressureMapper;
    @Autowired private PressureRepository pressureRepository;

    @PostMapping(path = "/savePressure",  consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public PressureDTO savePressure(@RequestBody PressureDTO pressureDTO){
        Pressure pressure = pressureMapper.dtoToEntity(pressureDTO);
        pressure = pressureRepository.save(pressure);
        return pressureMapper.entityToDto(pressure);
    }
}
