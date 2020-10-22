package com.rpi.springbootrestapi.controller.mapper;

import com.rpi.springbootrestapi.controller.dto.HumidityDTO;
import com.rpi.springbootrestapi.entity.Humidity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HumidityMapper {
    public HumidityDTO entityToDto(Humidity entity) {
        ModelMapper mapper =new ModelMapper();
        return mapper.map(entity, HumidityDTO.class);
    }

    public Humidity dtoToEntity(HumidityDTO viewModel){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(viewModel, Humidity.class);
    }

    public List<HumidityDTO> entityToDto(List<Humidity> entityList) {
        return	entityList.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public List<Humidity> dtoToEntity(List<HumidityDTO> viewModelList) {
        return viewModelList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}