package com.rpi.springbootrestapi.controller;

import com.rpi.springbootrestapi.controller.dto.HumidityDTO;
import com.rpi.springbootrestapi.controller.mapper.HumidityMapper;
import com.rpi.springbootrestapi.entity.Humidity;
import com.rpi.springbootrestapi.repository.HumidityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HumidityController {
    @Autowired private HumidityMapper humidityMapper;
    @Autowired private HumidityRepository humidityRepository;

    @PostMapping(path = "/saveHumidity",  consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public HumidityDTO saveHumidity(@RequestBody HumidityDTO humidityDTO){
        Humidity humidity = humidityMapper.dtoToEntity(humidityDTO);
        humidity = humidityRepository.save(humidity);
        return humidityMapper.entityToDto(humidity);
    }
}
