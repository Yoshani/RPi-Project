package com.rpi.springbootrestapi.controller.mapper;

import com.rpi.springbootrestapi.controller.dto.LightDTO;
import com.rpi.springbootrestapi.entity.LightIntensity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LightMapper {
    public LightDTO entityToDto(LightIntensity entity) {
        ModelMapper mapper =new ModelMapper();
        return mapper.map(entity, LightDTO.class);
    }

    public LightIntensity dtoToEntity(LightDTO viewModel){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(viewModel, LightIntensity.class);
    }

    public List<LightDTO> entityToDto(List<LightIntensity> entityList) {
        return	entityList.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public List<LightIntensity> dtoToEntity(List<LightDTO> viewModelList) {
        return viewModelList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}