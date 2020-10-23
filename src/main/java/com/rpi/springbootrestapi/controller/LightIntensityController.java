package com.rpi.springbootrestapi.controller;

import com.rpi.springbootrestapi.controller.dto.LightDTO;
import com.rpi.springbootrestapi.controller.mapper.LightMapper;
import com.rpi.springbootrestapi.entity.LightIntensity;
import com.rpi.springbootrestapi.repository.LightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin
public class LightIntensityController {

    @Autowired private LightMapper lightMapper;
    @Autowired private LightRepository lightRepository;

    @PostMapping(path = "/saveLightIntensity",  consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public LightDTO saveLightIntensity(@RequestBody LightDTO lightDTO){
        lightDTO.setId(UUID.randomUUID());
        LightIntensity lightIntensity = lightMapper.dtoToEntity(lightDTO);
        lightIntensity = lightRepository.save(lightIntensity);
        return lightMapper.entityToDto(lightIntensity);
    }
}
