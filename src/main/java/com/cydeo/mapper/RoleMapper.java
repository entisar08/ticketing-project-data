package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    //to use ModelMapper do DI to be able to use the methods of conversion

    private ModelMapper modelMapper;

    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //we are trying to loose ly coubled so ,we gonna create 2 methods
    // 1. DTO to entity
    public Role convertToEntity(RoleDTO dto){
      return modelMapper.map(dto, Role.class);
    }
    // 2.Entity to DTO
    public RoleDTO convertToDto(Role entity){
        return modelMapper.map(entity, RoleDTO.class);
    }
    // help us w
}
