package com.rpi.springbootrestapi.controller.mapper;

import com.rpi.springbootrestapi.controller.dto.PressureDTO;
import com.rpi.springbootrestapi.entity.Pressure;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PressureMapper {
    public PressureDTO entityToDto(Pressure entity) {
        ModelMapper mapper =new ModelMapper();
        return mapper.map(entity, PressureDTO.class);
    }

    public Pressure dtoToEntity(PressureDTO viewModel){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(viewModel, Pressure.class);
    }

    public List<PressureDTO> entityToDto(List<Pressure> entityList) {
        return	entityList.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public List<Pressure> dtoToEntity(List<PressureDTO> viewModelList) {
        return viewModelList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
