package com.rpi.springbootrestapi.controller.mapper;

import com.rpi.springbootrestapi.controller.dto.TemperatureDTO;
import com.rpi.springbootrestapi.entity.Temperature;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TemperatureMapper {
    public TemperatureDTO entityToDto(Temperature entity) {
        ModelMapper mapper =new ModelMapper();
        return mapper.map(entity, TemperatureDTO.class);
    }

    public Temperature dtoToEntity(TemperatureDTO viewModel){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(viewModel, Temperature.class);
    }

    public List<TemperatureDTO> entityToDto(List<Temperature> entityList) {
        return	entityList.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public List<Temperature> dtoToEntity(List<TemperatureDTO> viewModelList) {
        return viewModelList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
