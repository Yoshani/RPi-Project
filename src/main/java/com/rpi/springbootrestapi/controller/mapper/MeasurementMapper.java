package com.rpi.springbootrestapi.controller.mapper;

import com.rpi.springbootrestapi.controller.dto.MeasurementDTO;
import com.rpi.springbootrestapi.entity.Measurement;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MeasurementMapper {
    public MeasurementDTO entityToDto(Measurement entity) {
        ModelMapper mapper =new ModelMapper();
        return mapper.map(entity, MeasurementDTO.class);
    }

    public Measurement dtoToEntity(MeasurementDTO viewModel){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(viewModel, Measurement.class);
    }

    public List<MeasurementDTO> entityToDto(List<Measurement> entityList) {
        return	entityList.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public List<Measurement> dtoToEntity(List<MeasurementDTO> viewModelList) {
        return viewModelList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}

